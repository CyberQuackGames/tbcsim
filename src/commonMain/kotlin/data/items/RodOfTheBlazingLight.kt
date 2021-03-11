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
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.js.JsExport

@JsExport
public class RodOfTheBlazingLight : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34608

  public override var name: String = "Rod of the Blazing Light"

  public override var itemLevel: Int = 115

  public override var quality: Int = 4

  public override var icon: String = "inv_staff_47.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.STAFF

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 142.83999633789062

  public override var maxDmg: Double = 289.8399963378906

  public override var speed: Double = 3200.0

  public override var stats: Stats = Stats(
      stamina = 36,
      intellect = 32,
      spirit = 41
      )

  public override var sockets: Array<Socket> = arrayOf(
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
