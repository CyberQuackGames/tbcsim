package `data`.items

import `data`.Constants
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
public class CrystalbladeOfTheDraenei : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 31234

  public override var name: String = "Crystalblade of the Draenei"

  public override var itemLevel: Int = 103

  public override var quality: Int = 3

  public override var icon: String = "inv_sword_79.jpg"

  public override var inventorySlot: Int = 13

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.SWORD_1H

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 70.0

  public override var maxDmg: Double = 131.0

  public override var speed: Double = 1600.0

  public override var stats: Stats = Stats(
      stamina = 18,
      armor = 195,
      defenseRating = 13.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override var phase: Int = 1

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
