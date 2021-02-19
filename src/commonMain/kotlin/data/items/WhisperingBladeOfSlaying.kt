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

public class WhisperingBladeOfSlaying : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 27913

  public override var name: String = "Whispering Blade of Slaying"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 109.0

  public override var maxDmg: Double = 164.0

  public override var speed: Double = 1900.0

  public override var stats: Stats = Stats(
      stamina = 21,
      expertiseRating = 15.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9334, "Attack Power 26", this)
        )}

}
