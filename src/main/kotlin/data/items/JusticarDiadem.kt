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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public class JusticarDiadem : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Justicar Diadem"

  public override var itemLevel: Int = 120

  public override var itemSet: ItemSet? = ItemSets.byId(624)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 32,
      intellect = 33,
      spellCritRating = 28.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.RED),
      Socket(Color.META)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2865)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(18045, "Increase Healing 75", this)
      )
}