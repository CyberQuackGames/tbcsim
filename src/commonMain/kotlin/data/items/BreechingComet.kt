package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.model.Color
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import `data`.socketbonus.SocketBonuses
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
public class BreechingComet : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34616

  public override var name: String = "Breeching Comet"

  public override var itemLevel: Int = 125

  public override var quality: Int = 4

  public override var icon: String = "inv_axe_62.jpg"

  public override var inventorySlot: Int = 13

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.AXE_1H

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 167.0

  public override var maxDmg: Double = 312.0

  public override var speed: Double = 2600.0

  public override var stats: Stats = Stats(
      agility = 18,
      stamina = 15
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(3114)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(14049, "Attack Power 40", this)
        )}

}
