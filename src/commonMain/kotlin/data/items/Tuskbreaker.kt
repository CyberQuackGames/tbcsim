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

public class Tuskbreaker : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 33491

  public override var name: String = "Tuskbreaker"

  public override var itemLevel: Int = 132

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.GUN

  public override var minDmg: Double = 175.0

  public override var maxDmg: Double = 326.0

  public override var speed: Double = 2900.0

  public override var stats: Stats = Stats(
      physicalHasteRating = 18.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15808, "Attack Power 38", this)
        )}

}
