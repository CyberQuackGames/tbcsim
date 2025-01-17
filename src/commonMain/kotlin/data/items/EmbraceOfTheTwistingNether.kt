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
public class EmbraceOfTheTwistingNether : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 23565

  public override var name: String = "Embrace of the Twisting Nether"

  public override var itemLevel: Int = 146

  public override var quality: Int = 4

  public override var icon: String = "inv_chest_chain_17.jpg"

  public override var inventorySlot: Int = 5

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 56,
      intellect = 27,
      armor = 1022,
      meleeCritRating = 35.0,
      rangedCritRating = 35.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.YELLOW),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(90)

  public override var phase: Int = 1

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15828, "Attack Power 84", this),
        Buffs.byIdOrName(21632, "Increased Mana Regen", this),
        Buffs.byIdOrName(34518, "Nether Protection", this)
        )}

}
