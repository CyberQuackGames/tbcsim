package `data`.items

import `data`.Constants
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

public class TheSunEater : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29362

  public override var name: String = "The Sun Eater"

  public override var itemLevel: Int = 105

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.SWORD_1H

  public override var minDmg: Double = 93.0

  public override var maxDmg: Double = 174.0

  public override var speed: Double = 1600.0

  public override var stats: Stats = Stats(
      stamina = 22,
      defenseRating = 13.0,
      dodgeRating = 19.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
