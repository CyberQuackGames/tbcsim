package `data`.items

import `data`.Constants
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
public class DoomplateWarhelm : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28225

  public override var name: String = "Doomplate Warhelm"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_helmet_20.jpg"

  public override var inventorySlot: Int = 1

  public override var itemSet: ItemSet? = ItemSets.byId(661)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var allowableClasses: Array<Constants.AllowableClass>? = arrayOf(
      Constants.AllowableClass.WARRIOR,
      Constants.AllowableClass.PALADIN,
      Constants.AllowableClass.HUNTER,
      Constants.AllowableClass.ROGUE,
      Constants.AllowableClass.PRIEST,
      Constants.AllowableClass.DEATHKNIGHT,
      Constants.AllowableClass.SHAMAN,
      Constants.AllowableClass.MAGE,
      Constants.AllowableClass.WARLOCK,
      Constants.AllowableClass.DRUID
      )

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      strength = 34,
      stamina = 39
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.META)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2873)

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
