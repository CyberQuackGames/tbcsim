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
public class GronnstalkersBelt : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34549

  public override var name: String = "Gronnstalker's Belt"

  public override var itemLevel: Int = 154

  public override var quality: Int = 4

  public override var icon: String = "inv_belt_14.jpg"

  public override var inventorySlot: Int = 6

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
      agility = 29,
      stamina = 21,
      intellect = 17,
      physicalCritRating = 19.0,
      physicalHitRating = 24.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2902)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15829, "Attack Power 86", this),
        Buffs.byIdOrName(42098, "Armor Penetration 140", this)
        )}

}
