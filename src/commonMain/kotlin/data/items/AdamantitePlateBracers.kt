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

public class AdamantitePlateBracers : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 23506

  public override var name: String = "Adamantite Plate Bracers"

  public override var itemLevel: Int = 103

  public override var itemSet: ItemSet? = ItemSets.byId(562)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      strength = 22,
      stamina = 24
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(1583)

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
