package `data`.items

import `data`.Constants
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

public class CleaverOfTheUnforgiving : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 33476

  public override var name: String = "Cleaver of the Unforgiving"

  public override var itemLevel: Int = 138

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.AXE_1H

  public override var minDmg: Double = 110.0

  public override var maxDmg: Double = 205.0

  public override var speed: Double = 1600.0

  public override var stats: Stats = Stats(
      stamina = 31,
      physicalHitRating = 12.0,
      parryRating = 20.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2925)

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
