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

public class GladiatorsKodohideGloves : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 31375

  public override var name: String = "Gladiator's Kodohide Gloves"

  public override var itemLevel: Int = 123

  public override var itemSet: ItemSet? = ItemSets.byId(685)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 33,
      intellect = 27
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(18039, "Increase Healing 62", this),
        Buffs.byIdOrName(33830, "Cyclone Cast Time Decrease", this),
        Buffs.byIdOrName(21626, "Increased Mana Regen", this)
        )}

}
