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

public class ShivOfExsanguination : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34197

  public override var name: String = "Shiv of Exsanguination"

  public override var itemLevel: Int = 154

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 136.0

  public override var maxDmg: Double = 253.0

  public override var speed: Double = 1800.0

  public override var stats: Stats = Stats(
      agility = 25
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15809, "Attack Power 42", this),
        Buffs.byIdOrName(40226, "Armor Penetration 196", this)
        )}

}
