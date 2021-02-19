package data.model

import character.Buff
import character.Stats
import data.Constants

open class Item {
    // Flag for ItemGen - all generated Items will have this set to true
    // If an item is manually edited, set this to false to prevent future ItemGen runs from overwriting
    open var isAutoGenerated: Boolean = false

    // Item attributes
    open var id: Int = -1
    open var name: String = ""
    open var itemLevel: Int = 0
    open var itemSet: ItemSet? = null
    var equippedSlot: String = ""

    // TODO: Validate itemSubclass is indeed a subclass of the itemClass
    open var itemClass: Constants.ItemClass? = null
    open var itemSubclass: Constants.ItemSubclass? = null

    // TODO: This assumes physical damage types for items
    // TODO: Multiple damage types
    open var minDmg: Double = 0.0
    open var maxDmg: Double = 0.0
    open var speed: Double = 1000.0

    // Stats
    open var stats: Stats = Stats()

    // Sockets
    open var sockets: List<Socket> = listOf()
    open var socketBonus: SocketBonus? = null

    open val socketBonusActive: Boolean
        get() {
            return sockets.all {
                it.matches()
            }
        }

    // Granted buffs and effects
    open val buffs: List<Buff> by lazy { listOf() }

    var enchant: Buff? = null
    var temporaryEnhancement: Buff? = null

    // Helpers
    open val avgDmg: Double
        get() { return (minDmg + maxDmg) / 2.0 }
    open val dps: Double
        get() { return avgDmg / speed }
    val uniqueName: String
        get() { return name + equippedSlot }
}
