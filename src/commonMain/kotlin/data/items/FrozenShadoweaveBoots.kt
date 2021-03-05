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
public class FrozenShadoweaveBoots : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 21870

  public override var name: String = "Frozen Shadoweave Boots"

  public override var itemLevel: Int = 105

  public override var quality: Int = 4

  public override var icon: String = "inv_boots_cloth_03.jpg"

  public override var inventorySlot: Int = 8

  public override var itemSet: ItemSet? = ItemSets.byId(553)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.CLOTH

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 15,
      intellect = 9
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.YELLOW),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2880)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(25706, "Increase Shadow Dam 57", this),
        Buffs.byIdOrName(26717, "Increase Frost Dam 57", this)
        )}

}
