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
public class VindicatorsBrand : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29124

  public override var name: String = "Vindicator's Brand"

  public override var itemLevel: Int = 100

  public override var quality: Int = 4

  public override var icon: String = "inv_sword_draenei_01.jpg"

  public override var inventorySlot: Int = 13

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.SWORD_1H

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 147.0

  public override var maxDmg: Double = 275.0

  public override var speed: Double = 2600.0

  public override var stats: Stats = Stats(
      physicalHitRating = 19.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15808, "Attack Power 38", this)
        )}

}
