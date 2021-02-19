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

public class TerminalEdge : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 27929

  public override var name: String = "Terminal Edge"

  public override var itemLevel: Int = 91

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.THROWN

  public override var minDmg: Double = 63.0

  public override var maxDmg: Double = 96.0

  public override var speed: Double = 1600.0

  public override var stats: Stats = Stats(
      stamina = 7,
      physicalCritRating = 12.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9329, "Attack Power 16", this)
        )}

}
