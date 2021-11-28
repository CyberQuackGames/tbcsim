package data.itemscustom

import character.Buff
import character.CharacterType
import character.Stats
import data.Constants
import data.model.Item
import data.model.ItemSet
import data.model.Socket
import data.model.SocketBonus
import sim.SimParticipant
import kotlin.js.JsExport

@JsExport
class MarkOfTheChampionSpell : Item() {
    override var isAutoGenerated: Boolean = false
    override var id: Int = 23207
    override var name: String = "Mark of the Champion (Spell)"
    override var itemLevel: Int = 90
    override var quality: Int = 4
    override var icon: String = "inv_misc_token_argentdawn3.jpg"
    override var inventorySlot: Int = 12
    override var itemSet: ItemSet? = null
    override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR
    override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MISC
    override var minDmg: Double = 0.0
    override var maxDmg: Double = 0.0
    override var speed: Double = 0.0
    override var stats: Stats = Stats()
    override var sockets: Array<Socket> = arrayOf()
    override var socketBonus: SocketBonus? = null
    override var phase = 1

    val apBuff = object : Buff() {
        override val name: String = "Mark of the Champion (SP)"
        override var icon: String = "inv_misc_token_argentdawn3.jpg"
        override val durationMs: Int = -1

        val validSubtypes = setOf(CharacterType.DEMON, CharacterType.UNDEAD)
        override fun modifyStats(sp: SimParticipant): Stats {
            return if(validSubtypes.intersect(sp.sim.target.character.subTypes).isNotEmpty()) {
                Stats(
                    spellDamage = 85
                )
            } else Stats()
        }
    }

    override val buffs: List<Buff> = listOf(apBuff)
}
