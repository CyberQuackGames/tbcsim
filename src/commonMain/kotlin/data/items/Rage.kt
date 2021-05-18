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
public class Rage : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 33495

  public override var name: String = "Rage"

  public override var itemLevel: Int = 132

  public override var quality: Int = 4

  public override var icon: String = "inv_weapon_hand_15.jpg"

  public override var inventorySlot: Int = 21

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.FIST

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 174.0

  public override var maxDmg: Double = 323.0

  public override var speed: Double = 2600.0

  public override var stats: Stats = Stats(
      agility = 20,
      stamina = 18,
      meleeCritRating = 13.0,
      rangedCritRating = 13.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(3114)

  public override var phase: Int = 4

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
