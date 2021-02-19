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

public class ThunderheartPants : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 31046

  public override var name: String = "Thunderheart Pants"

  public override var itemLevel: Int = 146

  public override var itemSet: ItemSet? = ItemSets.byId(677)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 39,
      intellect = 48,
      spirit = 27,
      spellCritRating = 21.0,
      spellHitRating = 20.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(3153)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(34760, "Increase Spell Dam 62", this)
        )}

}
