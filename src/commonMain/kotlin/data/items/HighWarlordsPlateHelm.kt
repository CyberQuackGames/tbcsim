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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public class HighWarlordsPlateHelm : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28853

  public override var name: String = "High Warlord's Plate Helm"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = ItemSets.byId(588)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      strength = 20,
      stamina = 34,
      physicalCritRating = 24.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.META),
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2878)

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
