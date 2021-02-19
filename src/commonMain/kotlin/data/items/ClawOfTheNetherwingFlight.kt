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

public class ClawOfTheNetherwingFlight : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 31492

  public override var name: String = "Claw of the Netherwing Flight"

  public override var itemLevel: Int = 108

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 83.0

  public override var maxDmg: Double = 156.0

  public override var speed: Double = 1800.0

  public override var stats: Stats = Stats(
      agility = 15,
      physicalHitRating = 15.0,
      expertiseRating = 15.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9336, "Attack Power 30", this)
        )}

}
