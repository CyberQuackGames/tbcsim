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
public class SporelingClaw : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 25538

  public override var name: String = "Sporeling Claw"

  public override var itemLevel: Int = 94

  public override var quality: Int = 3

  public override var icon: String = "inv_gauntlets_11.jpg"

  public override var inventorySlot: Int = 13

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.FIST

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 99.0

  public override var maxDmg: Double = 184.0

  public override var speed: Double = 2500.0

  public override var stats: Stats = Stats(
      stamina = 18,
      physicalHitRating = 12.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(14027, "Attack Power 24", this)
        )}

}
