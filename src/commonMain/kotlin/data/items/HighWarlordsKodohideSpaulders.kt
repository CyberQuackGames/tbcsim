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
public class HighWarlordsKodohideSpaulders : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 31587

  public override var name: String = "High Warlord's Kodohide Spaulders"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_shoulder_12.jpg"

  public override var inventorySlot: Int = 3

  public override var itemSet: ItemSet? = ItemSets.byId(689)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 33,
      intellect = 16
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2859)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9315, "Increase Healing 26", this),
        Buffs.byIdOrName(21624, "Increased Mana Regen", this)
        )}

}
