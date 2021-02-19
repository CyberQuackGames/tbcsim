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

public class BrutalGladiatorsMoonclothGloves : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 35053

  public override var name: String = "Brutal Gladiator's Mooncloth Gloves"

  public override var itemLevel: Int = 159

  public override var itemSet: ItemSet? = ItemSets.byId(687)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.CLOTH

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 56,
      intellect = 28
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(44297, "Improved Psychic Scream", this),
        Buffs.byIdOrName(18046, "Increase Healing 77", this)
        )}

}
