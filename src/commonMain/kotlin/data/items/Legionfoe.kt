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

public class Legionfoe : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34673

  public override var name: String = "Legionfoe"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.AXE_2H

  public override var minDmg: Double = 276.0

  public override var maxDmg: Double = 414.0

  public override var speed: Double = 3700.0

  public override var stats: Stats = Stats(
      strength = 31,
      stamina = 45,
      physicalCritRating = 26.0,
      expertiseRating = 19.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
