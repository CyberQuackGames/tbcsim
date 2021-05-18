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
public class StormHelm : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 23534

  public override var name: String = "Storm Helm"

  public override var itemLevel: Int = 105

  public override var quality: Int = 4

  public override var icon: String = "inv_helmet_29.jpg"

  public override var inventorySlot: Int = 1

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 21,
      intellect = 28,
      armor = 604,
      meleeCritRating = 22.0,
      rangedCritRating = 22.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.BLUE),
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2882)

  public override var phase: Int = 0

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15810, "Attack Power 44", this),
        Buffs.byIdOrName(21365, "Increased Mana Regen", this)
        )}

}
