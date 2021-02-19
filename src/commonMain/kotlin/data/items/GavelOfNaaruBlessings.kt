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

public class GavelOfNaaruBlessings : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34896

  public override var name: String = "Gavel of Naaru Blessings"

  public override var itemLevel: Int = 146

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_1H

  public override var minDmg: Double = 16.1200008392334

  public override var maxDmg: Double = 116.12000274658203

  public override var speed: Double = 1600.0

  public override var stats: Stats = Stats(
      stamina = 42,
      intellect = 28
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(43460, "Increase Healing 464", this)
        )}

}
