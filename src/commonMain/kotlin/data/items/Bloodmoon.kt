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
public class Bloodmoon : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28436

  public override var name: String = "Bloodmoon"

  public override var itemLevel: Int = 136

  public override var quality: Int = 4

  public override var icon: String = "inv_axe_52.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.AXE_2H

  public override var minDmg: Double = 375.0

  public override var maxDmg: Double = 564.0

  public override var speed: Double = 3700.0

  public override var stats: Stats = Stats(
      physicalCritRating = 56.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(36069, "Attack Power 112", this)
        )}

}
