package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.itemsets.ItemSets
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
public class GronnstalkersBracers : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34443

  public override var name: String = "Gronnstalker's Bracers"

  public override var itemLevel: Int = 154

  public override var quality: Int = 4

  public override var icon: String = "inv_bracer_02.jpg"

  public override var inventorySlot: Int = 9

  public override var itemSet: ItemSet? = ItemSets.byId(669)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var allowableClasses: Array<Constants.AllowableClass>? = arrayOf(
      Constants.AllowableClass.HUNTER
      )

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      agility = 23,
      stamina = 16,
      intellect = 16,
      armor = 471,
      meleeCritRating = 17.0,
      rangedCritRating = 17.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(3149)

  public override var phase: Int = 5

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15817, "Attack Power 64", this),
        Buffs.byIdOrName(43219, "Armor Penetration 112", this)
        )}

}
