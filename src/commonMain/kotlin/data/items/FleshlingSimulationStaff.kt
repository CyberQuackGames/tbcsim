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

public class FleshlingSimulationStaff : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 30010

  public override var name: String = "Fleshling Simulation Staff"

  public override var itemLevel: Int = 109

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.STAFF

  public override var minDmg: Double = 105.08000183105469

  public override var maxDmg: Double = 190.0800018310547

  public override var speed: Double = 2400.0

  public override var stats: Stats = Stats(
      strength = 27,
      agility = 27,
      stamina = 27,
      physicalHitRating = 26.0,
      expertiseRating = 17.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(44906, "Attack Power - Feral (+0457)", this)
        )}

}
