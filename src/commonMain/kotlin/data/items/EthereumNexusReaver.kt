package `data`.items

import `data`.Constants
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
public class EthereumNexusReaver : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 30722

  public override var name: String = "Ethereum Nexus-Reaver"

  public override var itemLevel: Int = 120

  public override var quality: Int = 4

  public override var icon: String = "inv_axe_67.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.AXE_2H

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 346.0

  public override var maxDmg: Double = 519.0

  public override var speed: Double = 3700.0

  public override var stats: Stats = Stats(
      strength = 50,
      physicalCritRating = 30.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.YELLOW),
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(3094)

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
