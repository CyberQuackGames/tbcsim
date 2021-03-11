package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import character.Buff
import character.Stats
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.js.JsExport

@JsExport
public class ShatteredSunPendantOfRestoration : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34677

  public override var name: String = "Shattered Sun Pendant of Restoration"

  public override var itemLevel: Int = 115

  public override var quality: Int = 4

  public override var icon: String = "inv_jewelry_necklace_12.jpg"

  public override var inventorySlot: Int = 2

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MISC

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 19
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(18043, "Increase Healing 70", this),
        Buffs.byIdOrName(21628, "Increased Mana Regen", this),
        Buffs.byIdOrName(45484, "Sunwell Exalted Healer Neck", this)
        )}

}
