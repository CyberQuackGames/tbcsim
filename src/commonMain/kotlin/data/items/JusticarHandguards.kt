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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public class JusticarHandguards : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29067

  public override var name: String = "Justicar Handguards"

  public override var itemLevel: Int = 120

  public override var itemSet: ItemSet? = ItemSets.byId(625)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 34,
      intellect = 24,
      defenseRating = 23.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(14054, "Increase Spell Dam 27", this),
        Buffs.byIdOrName(35074, "Block Value 35", this)
        )}

}
