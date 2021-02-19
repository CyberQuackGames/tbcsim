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

public class FelEdgedBattleaxe : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 23542

  public override var name: String = "Fel Edged Battleaxe"

  public override var itemLevel: Int = 105

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.AXE_1H

  public override var minDmg: Double = 128.0

  public override var maxDmg: Double = 239.0

  public override var speed: Double = 2200.0

  public override var stats: Stats = Stats(
      physicalCritRating = 21.0,
      physicalHitRating = 14.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.RED)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2925)

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
