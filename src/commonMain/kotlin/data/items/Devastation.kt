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

public class Devastation : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 30316

  public override var name: String = "Devastation"

  public override var itemLevel: Int = 175

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.AXE_2H

  public override var minDmg: Double = 496.0

  public override var maxDmg: Double = 744.0

  public override var speed: Double = 3900.0

  public override var stats: Stats = Stats(
      stamina = 75,
      physicalCritRating = 50.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(36409, "Attack Power 150", this),
        Buffs.byIdOrName(36479, "Speed Infusion", this)
        )}

}
