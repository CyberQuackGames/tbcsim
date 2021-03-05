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
public class HighWarlordsChainGauntlets : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28806

  public override var name: String = "High Warlord's Chain Gauntlets"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_gauntlets_11.jpg"

  public override var inventorySlot: Int = 10

  public override var itemSet: ItemSet? = ItemSets.byId(596)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      agility = 21,
      stamina = 31,
      intellect = 6,
      physicalCritRating = 11.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9331, "Attack Power 20", this),
        Buffs.byIdOrName(28539, "Multi-Shot Damage Increase", this)
        )}

}
