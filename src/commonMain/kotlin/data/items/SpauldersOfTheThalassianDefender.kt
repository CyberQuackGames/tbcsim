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
public class SpauldersOfTheThalassianDefender : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34389

  public override var name: String = "Spaulders of the Thalassian Defender"

  public override var itemLevel: Int = 159

  public override var quality: Int = 4

  public override var icon: String = "inv_shoulder_89.jpg"

  public override var inventorySlot: Int = 3

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 60,
      intellect = 24,
      armor = 1487,
      defenseRating = 27.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2895)

  public override var phase: Int = 5

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(35168, "Block Value 51", this),
        Buffs.byIdOrName(18054, "Increase Spell Dam 37", this)
        )}

}
