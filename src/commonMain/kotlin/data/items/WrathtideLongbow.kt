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
public class WrathtideLongbow : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29351

  public override var name: String = "Wrathtide Longbow"

  public override var itemLevel: Int = 105

  public override var quality: Int = 4

  public override var icon: String = "inv_weapon_crossbow_16.jpg"

  public override var inventorySlot: Int = 15

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.BOW

  public override var minDmg: Double = 158.0

  public override var maxDmg: Double = 295.0

  public override var speed: Double = 3000.0

  public override var stats: Stats = Stats(
      agility = 14
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9335, "Attack Power 28", this)
        )}

}
