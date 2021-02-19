package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.model.Color
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import `data`.socketbonus.SocketBonuses
import character.Buff
import character.Stats
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public class RodOfTheBlazingLight : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34608

  public override var name: String = "Rod of the Blazing Light"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.STAFF

  public override var minDmg: Double = 142.83999633789062

  public override var maxDmg: Double = 289.8399963378906

  public override var speed: Double = 3200.0

  public override var stats: Stats = Stats(
      stamina = 36,
      intellect = 32,
      spirit = 41
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.RED),
      Socket(Color.YELLOW),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2890)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(40107, "Increase Healing 348", this)
        )}

}
