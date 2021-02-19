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

public class BlackenedSpear : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29167

  public override var name: String = "Blackened Spear"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.POLEARM

  public override var minDmg: Double = 261.0

  public override var maxDmg: Double = 392.0

  public override var speed: Double = 3500.0

  public override var stats: Stats = Stats(
      agility = 26,
      physicalHitRating = 19.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15832, "Attack Power 92", this)
        )}

}
