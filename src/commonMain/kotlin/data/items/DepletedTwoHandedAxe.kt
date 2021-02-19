package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
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

public class DepletedTwoHandedAxe : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32670

  public override var name: String = "Depleted Two-Handed Axe"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.MISCELLANEOUS

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.JUNK

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 3600.0

  public override var stats: Stats = Stats(
      strength = 46,
      stamina = 39,
      physicalCritRating = 19.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(40757, "Apexis Crystal Infusion", this)
        )}

}
