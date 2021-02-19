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

public class HighWarlordsClaymore : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28293

  public override var name: String = "High Warlord's Claymore"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.SWORD_2H

  public override var minDmg: Double = 268.0

  public override var maxDmg: Double = 403.0

  public override var speed: Double = 3600.0

  public override var stats: Stats = Stats(
      strength = 28,
      stamina = 42,
      physicalCritRating = 28.0,
      physicalHitRating = 18.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
