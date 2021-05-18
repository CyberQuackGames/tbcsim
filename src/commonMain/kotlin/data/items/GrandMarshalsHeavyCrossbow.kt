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
public class GrandMarshalsHeavyCrossbow : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28960

  public override var name: String = "Grand Marshal's Heavy Crossbow"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_weapon_crossbow_10.jpg"

  public override var inventorySlot: Int = 26

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.CROSSBOW

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 170.0

  public override var maxDmg: Double = 255.0

  public override var speed: Double = 3200.0

  public override var stats: Stats = Stats(
      stamina = 12,
      meleeCritRating = 9.0,
      rangedCritRating = 9.0,
      resilienceRating = 9.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override var phase: Int = 1

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(21434, "Attack Power Ranged 22", this)
        )}

}
