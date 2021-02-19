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

public class SingingCrystalAxe : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 31318

  public override var name: String = "Singing Crystal Axe"

  public override var itemLevel: Int = 100

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.AXE_2H

  public override var minDmg: Double = 295.0

  public override var maxDmg: Double = 444.0

  public override var speed: Double = 3500.0

  public override var stats: Stats = Stats(

      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(38282, "The Blade's Song", this)
        )}

}
