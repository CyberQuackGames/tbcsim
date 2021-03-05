package data.enchants

import character.Stats
import data.Constants
import data.model.Enchant
import data.model.Item
import sim.SimIteration
import kotlin.js.JsExport

@JsExport
class WeaponPotency(item: Item) : Enchant(item) {
    override val id: Int = 27972
    override val inventorySlot: Int = Constants.InventorySlot.WEAPON.ordinal
    override val name: String = "Potency"

    override fun modifyStats(sim: SimIteration): Stats {
        return Stats(
            strength = 20
        )
    }
}
