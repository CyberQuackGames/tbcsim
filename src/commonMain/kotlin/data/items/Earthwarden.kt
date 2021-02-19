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

public class Earthwarden : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29171

  public override var name: String = "Earthwarden"

  public override var itemLevel: Int = 100

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_2H

  public override var minDmg: Double = 142.63999938964844

  public override var maxDmg: Double = 278.6400146484375

  public override var speed: Double = 3200.0

  public override var stats: Stats = Stats(
      stamina = 39,
      expertiseRating = 24.0,
      defenseRating = 27.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(44909, "Attack Power - Feral (+0712)", this)
        )}

}
