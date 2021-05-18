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
public class GuardiansMoonclothSlippers : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 35144

  public override var name: String = "Guardian's Mooncloth Slippers"

  public override var itemLevel: Int = 159

  public override var quality: Int = 4

  public override var icon: String = "inv_boots_cloth_12.jpg"

  public override var inventorySlot: Int = 8

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.CLOTH

  public override var allowableClasses: Array<Constants.AllowableClass>? = arrayOf(
      Constants.AllowableClass.PRIEST,
      Constants.AllowableClass.MAGE,
      Constants.AllowableClass.WARLOCK
      )

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 56,
      intellect = 36,
      armor = 253,
      resilienceRating = 31.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override var phase: Int = 0

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(33820, "Increase Healing 88", this)
        )}

}
