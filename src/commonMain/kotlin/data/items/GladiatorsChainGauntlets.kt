package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.itemsets.ItemSets
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
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
public class GladiatorsChainGauntlets : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28335

  public override var name: String = "Gladiator's Chain Gauntlets"

  public override var itemLevel: Int = 123

  public override var quality: Int = 4

  public override var icon: String = "inv_gauntlets_11.jpg"

  public override var inventorySlot: Int = 10

  public override var itemSet: ItemSet? = ItemSets.byId(586)

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
      stamina = 41,
      intellect = 10,
      armor = 541,
      meleeCritRating = 14.0,
      rangedCritRating = 14.0,
      resilienceRating = 18.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override var phase: Int = 1

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9334, "Attack Power 26", this),
        Buffs.byIdOrName(28539, "Multi-Shot Damage Increase", this)
        )}

}
