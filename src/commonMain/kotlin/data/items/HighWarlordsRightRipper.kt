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

public class HighWarlordsRightRipper : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28928

  public override var name: String = "High Warlord's Right Ripper"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.FIST

  public override var minDmg: Double = 130.0

  public override var maxDmg: Double = 243.0

  public override var speed: Double = 2600.0

  public override var stats: Stats = Stats(
      stamina = 18,
      physicalCritRating = 13.0,
      physicalHitRating = 8.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9334, "Attack Power 26", this)
        )}

}
