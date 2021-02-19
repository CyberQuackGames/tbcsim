@file:Suppress("UNUSED_PARAMETER")

package data.codegen.generators

import character.Stats
import com.fasterxml.jackson.core.type.TypeReference
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import data.Constants
import data.buffs.Buffs
import data.codegen.CodeGen
import data.itemsets.ItemSets
import data.model.*
import data.socketbonus.SocketBonuses
import mu.KotlinLogging
import net.pearx.kasechange.toPascalCase
import java.io.File
import java.lang.IllegalArgumentException
import java.lang.reflect.Modifier

object ItemGen {
    val logger = KotlinLogging.logger {}
    val pkg: String = "data.items"

    private fun load(): List<Map<String, Any?>> {
        return CodeGen.load("/items.json", object : TypeReference<List<Map<String, Any?>>>(){})
    }

    private fun loadBuffs(): List<Map<String, Any?>> {
        return CodeGen.load("/itemprocs.json", object : TypeReference<List<Map<String, Any?>>>(){})
    }

    private fun deserializeSockets(itemData: Map<String, Any?>): List<Socket> {
        return (1..3).mapNotNull { i ->
            val socketColor = itemData["socketColor_$i"] as Int
            if(socketColor == 0) {
                null
            } else {
                val color = Color.values().find { it.mask == socketColor }
                if (color != null) {
                    Socket(color)
                } else {
                    logger.warn { "Could not interpret socket color value: $color" }
                    null
                }
            }
        }
    }

    private fun deserializeStats(itemData: Map<String, Any?>) : Stats {
        val stats = Stats()
        for(i in 1..5) {
            val type = itemData["stat_type$i"] as Int? ?: 0
            val value = itemData["stat_value$i"] as Int? ?: 0
            val statType = Constants.StatType.values().find { it() == type }!!

            stats.addByStatType(statType, value)
        }
        return stats
    }

    fun generate() {
        val itemsData = load()
        val itemBuffsData = loadBuffs()

        val protoItems = itemsData.map {
            val item = Item()
            item.id = it["entry"] as Int? ?: item.id
            item.name = it["name"] as String? ?: item.name
            item.itemLevel = it["ItemLevel"] as Int? ?: item.itemLevel
            item.itemClass = Constants.ItemClass.values().find { it2 ->
                it2.ordinal == it["class"] as Int?
            }
            item.itemSubclass = Constants.ItemClass.subclasses(item.itemClass).find { it2 ->
                it2.itemClassOrdinal == it["subclass"] as Int?
            }
            item.minDmg = (it["dmg_min1"] as Number? ?: item.minDmg).toDouble()
            item.maxDmg = (it["dmg_max1"] as Number? ?: item.maxDmg).toDouble()
            item.speed = (it["delay"] as Number? ?: item.speed).toDouble()
            item.stats = deserializeStats(it)
            item.sockets = deserializeSockets(it)

            Pair(item, it)
        }

        // Write individual item files
        protoItems.forEach { itemPair ->
            writeItemClassFile(itemPair.first, itemPair.second, itemBuffsData)
        }

        // Write index file
        writeItemIndexFile(protoItems.map { it.first })
    }

    private fun writeItemIndexFile(items: List<Item>) {
        // There is a maximum method size, apparently, and generating naively surpasses it
        val maxWhensPerMethod = 1000
        val itemLists = items.chunked(maxWhensPerMethod)

        val itemBlocks = itemLists.map { list ->
            list.map {
                CodeBlock.of("%S -> %L()", it.name, safeItemName(it))
            }.joinToCode(separator = "\n", prefix = "return when(name) {\n", suffix = "\nelse -> null\n}\n")
        }

        val objBuilder = TypeSpec.objectBuilder("ItemIndex")

        // Add an entry point that calls all the smaller methods
        val entryBlock = itemBlocks.mapIndexed { index, _ ->
            CodeBlock.of("items$index(name)")
        }.joinToCode(separator = " ?: ", prefix = "return ", suffix = "")

        // Add the entry method
        objBuilder.addFunction(
            FunSpec.builder("byName")
                .addParameter("name", String::class)
                .returns(Item::class.asTypeName().copy(true))
                .addStatement("%L", entryBlock)
                .build()
        )

        // Add each split item method
        itemBlocks.forEachIndexed { index, codeBlock ->
            objBuilder.addFunction(
                FunSpec.builder("items$index")
                    .addParameter("name", String::class)
                    .returns(Item::class.asTypeName().copy(true))
                    .addStatement("%L", codeBlock)
                    .build()
            )
        }

        FileSpec.builder(pkg, "ItemIndex")
            .addType(objBuilder.build())
            .addAnnotation(
                // TODO: Some item variants have the same name in the data
                //       Need to distinguish them somehow when finding by name
                AnnotationSpec.builder(Suppress::class)
                    .addMember("%S", "DUPLICATE_LABEL_IN_WHEN")
                    .build()
            )
            .build()
            .writeTo(File(CodeGen.outPath))
    }

    private fun shouldOverwrite(name: String): Boolean {
        return try {
            // Check to see if the class exists and the autoGenerated field is set
            // If it has been manually changed and isAutogenerated is false, then do not overwrite
            val klass = Class.forName("data.items.$name")
            return klass.getDeclaredMethod("isAutoGenerated").invoke(klass.getDeclaredConstructor().newInstance()) as Boolean
        } catch(e: ClassNotFoundException) {
            true
        }
    }

    private fun renderStats(item: Item, itemData: Map<String, Any?>): CodeBlock {
        val fields = Class.forName("character.Stats").declaredFields
            .filter { it.name != "Companion" }
            .filter { !it.name.startsWith("$") }
            .filter { !Modifier.isFinal(it.modifiers) }

        // Render all stats constructor params and inject Item values
        val baseStats = Stats()
        val block = fields.mapNotNull {
            val method = Class.forName("character.Stats").getDeclaredMethod("get${it.name.capitalize()}")
            val methodValue = method.invoke(item.stats)

            // Only render non-default values
            if(methodValue == method.invoke(baseStats)) {
                null
            } else {
                CodeBlock.of("%L = %L", it.name, methodValue)
            }
        }.joinToCode(separator = ",\n", prefix = "(\n", suffix = "\n)")

        return CodeBlock.builder()
            .add("%T", Stats::class)
            .add(block)
            .build()
    }

    private fun renderSockets(item: Item, itemData: Map<String, Any?>): CodeBlock {
        return if(item.sockets.isNotEmpty()) {
            item.sockets.map {
                CodeBlock.of("%1T(%2T.%3L)", Socket::class, Color::class, it.color)
            }.joinToCode(separator = ",\n", prefix = "listOf(\n", suffix = "\n)")
        } else {
            CodeBlock.builder()
                .add("%L", "listOf()")
                .build()
        }
    }

    private fun renderSocketBonus(item: Item, itemData: Map<String, Any?>): CodeBlock {
        val bonusId = itemData["socketBonus"] as Int?
        return if(bonusId != null && bonusId != 0) {
            CodeBlock.of("%T.byId(%L)", SocketBonuses::class, bonusId)
        } else {
            CodeBlock.of("%L", null)
        }
    }

    private fun renderItemSet(item: Item, itemData: Map<String, Any?>): CodeBlock {
        val itemSet = itemData["itemset"] as Int?
        return if(itemSet != null && itemSet != 0) {
            CodeBlock.of("%T.byId(%L)", ItemSets::class, itemSet)
        } else {
            CodeBlock.of("%L", null)
        }
    }

    private fun renderItemClass(item: Item, itemData: Map<String, Any?>): CodeBlock {
        return if(item.itemClass != null) {
            CodeBlock.of("%T.%L", Constants.ItemClass::class, item.itemClass)
        } else {
            CodeBlock.of("%L", null)
        }
    }

    private fun renderItemSubclass(item: Item, itemData: Map<String, Any?>): CodeBlock {
        return if(item.itemSubclass != null) {
            CodeBlock.of("%T.%L", Constants.ItemSubclass::class, item.itemSubclass)
        } else {
            CodeBlock.of("%L", null)
        }
    }

    private fun renderBuffs(item: Item, itemData: Map<String, Any?>, itemBuffsData: List<Map<String, Any?>>): CodeBlock {
        val buffIds = (1..5).mapNotNull { i ->
            val spellId = itemData["spellid_$i"] as Int? ?: 0

            if(spellId == 0) {
                null
            } else {
                // Find buff name and ID from DB
                val itemBuff = itemBuffsData.find { it["Id"] as Int == spellId }
                    ?: throw IllegalArgumentException("Cannot find item buff with ID: $spellId")

                val name = itemBuff["SpellName"] as String
                Pair(spellId, name)
            }
        }

        return if(buffIds.isNotEmpty()) {
            buffIds.map {
                CodeBlock.of("%T.byIdOrName(%L, %S, %L)", Buffs::class, it.first, it.second, "this")
            }.joinToCode(separator = ",\n", prefix = "listOfNotNull(\n", suffix = "\n)")
        } else {
            CodeBlock.builder()
                .add("%L", "listOf()")
                .build()
        }
    }

    fun safeItemName(item: Item): String {
        val safeRegex = Regex("""[^a-zA-Z ]""")
        return item.name.replace(safeRegex, "").toPascalCase()
    }

    fun writeItemClassFile(item: Item, itemData: Map<String, Any?>, itemBuffsData: List<Map<String, Any?>>) {
        val className = safeItemName(item)

        if(shouldOverwrite(className)) {
            val file = FileSpec.builder(pkg, className)
                .addType(
                    TypeSpec.classBuilder(className)
                        .superclass(Item::class)
                        .addProperty(
                            PropertySpec.builder("isAutoGenerated", Boolean::class)
                                .addModifiers(KModifier.OVERRIDE)
                                .mutable(true)
                                .initializer("%L", true)
                                .build()
                        )
                        .addProperty(
                            PropertySpec.builder("id", Int::class)
                                .addModifiers(KModifier.OVERRIDE)
                                .mutable(true)
                                .initializer("%L", item.id)
                                .build()
                        )
                        .addProperty(
                            PropertySpec.builder("name", String::class)
                                .addModifiers(KModifier.OVERRIDE)
                                .mutable(true)
                                .initializer("%S", item.name)
                                .build()
                        )
                        .addProperty(
                            PropertySpec.builder("itemLevel", Int::class)
                                .addModifiers(KModifier.OVERRIDE)
                                .mutable(true)
                                .initializer("%L", item.itemLevel)
                                .build()
                        )
                        .addProperty(
                            PropertySpec.builder("itemSet", ItemSet::class.asTypeName().copy(true))
                                .addModifiers(KModifier.OVERRIDE)
                                .mutable(true)
                                .initializer("%L", renderItemSet(item, itemData))
                                .build()
                        )
                        .addProperty(
                            PropertySpec.builder("itemClass", Constants.ItemClass::class.asTypeName().copy(true))
                                .addModifiers(KModifier.OVERRIDE)
                                .mutable(true)
                                .initializer("%L", renderItemClass(item, itemData))
                                .build()
                        )
                        .addProperty(
                            PropertySpec.builder("itemSubclass", Constants.ItemSubclass::class.asTypeName().copy(true))
                                .addModifiers(KModifier.OVERRIDE)
                                .mutable(true)
                                .initializer("%L", renderItemSubclass(item, itemData))
                                .build()
                        )
                        .addProperty(
                            PropertySpec.builder("minDmg", Double::class)
                                .addModifiers(KModifier.OVERRIDE)
                                .mutable(true)
                                .initializer("%L", item.minDmg)
                                .build()
                        )
                        .addProperty(
                            PropertySpec.builder("maxDmg", Double::class)
                                .addModifiers(KModifier.OVERRIDE)
                                .mutable(true)
                                .initializer("%L", item.maxDmg)
                                .build()
                        )
                        .addProperty(
                            PropertySpec.builder("speed", Double::class)
                                .addModifiers(KModifier.OVERRIDE)
                                .mutable(true)
                                .initializer("%L", item.speed)
                                .build()
                        )
                        .addProperty(
                            PropertySpec.builder("stats", Stats::class)
                                .addModifiers(KModifier.OVERRIDE)
                                .mutable(true)
                                .initializer("%L", renderStats(item, itemData))
                                .build()
                        )
                        .addProperty(
                            PropertySpec.builder("sockets", LIST.parameterizedBy(ClassName("data.model", "Socket")))
                                .addModifiers(KModifier.OVERRIDE)
                                .mutable(true)
                                .initializer("%L", renderSockets(item, itemData))
                                .build()
                        )
                        .addProperty(
                            PropertySpec.builder("socketBonus", SocketBonus::class.asTypeName().copy(true))
                                .addModifiers(KModifier.OVERRIDE)
                                .mutable(true)
                                .initializer("%L", renderSocketBonus(item, itemData))
                                .build()
                        )
                        .addProperty(
                            PropertySpec.builder("buffs", LIST.parameterizedBy(ClassName("character", "Buff")))
                                .addModifiers(KModifier.OVERRIDE)
                                .delegate(
                                    CodeBlock.builder()
                                        .beginControlFlow("lazy")
                                        .add(renderBuffs(item, itemData, itemBuffsData))
                                        .endControlFlow()
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

            file.writeTo(File(CodeGen.outPath))
        }
    }
}
