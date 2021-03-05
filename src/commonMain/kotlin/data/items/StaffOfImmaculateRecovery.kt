package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
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
public class StaffOfImmaculateRecovery : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32344

  public override var name: String = "Staff of Immaculate Recovery"

  public override var itemLevel: Int = 141

  public override var quality: Int = 4

  public override var icon: String = "inv_staff_61.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.STAFF

  public override var minDmg: Double = 145.1999969482422

  public override var maxDmg: Double = 312.20001220703125

  public override var speed: Double = 3200.0

  public override var stats: Stats = Stats(
      stamina = 73,
      intellect = 51,
      spirit = 35
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(42110, "Increase Healing 443", this),
        Buffs.byIdOrName(21641, "Increased Mana Regen", this)
        )}

}
