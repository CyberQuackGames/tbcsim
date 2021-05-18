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
public class DirebrewsShanker : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 37597

  public override var name: String = "Direbrew's Shanker"

  public override var itemLevel: Int = 115

  public override var quality: Int = 4

  public override var icon: String = "inv_drink_10.jpg"

  public override var inventorySlot: Int = 13

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 122.0

  public override var maxDmg: Double = 228.0

  public override var speed: Double = 2000.0

  public override var stats: Stats = Stats(
      agility = 19,
      stamina = 18
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override var phase: Int = 0

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(14089, "Attack Power 36", this)
        )}

}
