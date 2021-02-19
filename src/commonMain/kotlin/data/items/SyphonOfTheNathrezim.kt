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

public class SyphonOfTheNathrezim : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32262

  public override var name: String = "Syphon of the Nathrezim"

  public override var itemLevel: Int = 141

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_1H

  public override var minDmg: Double = 196.0

  public override var maxDmg: Double = 365.0

  public override var speed: Double = 2800.0

  public override var stats: Stats = Stats(

      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(14056, "Attack Power 50", this),
        Buffs.byIdOrName(40291, "Siphon Essence", this)
        )}

}
