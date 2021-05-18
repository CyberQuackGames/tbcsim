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
public class DemonStalkerHarness : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29082

  public override var name: String = "Demon Stalker Harness"

  public override var itemLevel: Int = 120

  public override var quality: Int = 4

  public override var icon: String = "inv_chest_chain_15.jpg"

  public override var inventorySlot: Int = 5

  public override var itemSet: ItemSet? = ItemSets.byId(651)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var allowableClasses: Array<Constants.AllowableClass>? = arrayOf(
      Constants.AllowableClass.HUNTER
      )

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      agility = 26,
      stamina = 24,
      intellect = 35,
      armor = 846
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.BLUE),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2936)

  public override var phase: Int = 0

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15820, "Attack Power 70", this),
        Buffs.byIdOrName(21627, "Increased Mana Regen", this)
        )}

}
