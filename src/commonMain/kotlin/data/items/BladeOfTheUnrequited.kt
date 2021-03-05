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
public class BladeOfTheUnrequited : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28572

  public override var name: String = "Blade of the Unrequited"

  public override var itemLevel: Int = 115

  public override var quality: Int = 4

  public override var icon: String = "inv_weapon_shortblade_39.jpg"

  public override var inventorySlot: Int = 13

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 112.0

  public override var maxDmg: Double = 168.0

  public override var speed: Double = 1600.0

  public override var stats: Stats = Stats(
      stamina = 13,
      physicalCritRating = 9.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.YELLOW),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2936)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9330, "Attack Power 18", this)
        )}

}
