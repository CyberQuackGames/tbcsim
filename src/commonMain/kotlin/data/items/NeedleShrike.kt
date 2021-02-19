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

public class NeedleShrike : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 27631

  public override var name: String = "Needle Shrike"

  public override var itemLevel: Int = 94

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.THROWN

  public override var minDmg: Double = 57.0

  public override var maxDmg: Double = 86.0

  public override var speed: Double = 1400.0

  public override var stats: Stats = Stats(
      physicalHitRating = 11.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(14027, "Attack Power 24", this)
        )}

}
