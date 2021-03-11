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
public class RobeOfEffervescentLight : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 27506

  public override var name: String = "Robe of Effervescent Light"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_chest_cloth_38.jpg"

  public override var inventorySlot: Int = 20

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.CLOTH

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 25,
      intellect = 33,
      spirit = 18
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(18044, "Increase Healing 73", this),
        Buffs.byIdOrName(21364, "Increased Mana Regen", this)
        )}

}
