package `data`.items

import `data`.Constants
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
public class StormforgedAxe : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 30087

  public override var name: String = "Stormforged Axe"

  public override var itemLevel: Int = 100

  public override var quality: Int = 3

  public override var icon: String = "inv_axe_39.jpg"

  public override var inventorySlot: Int = 13

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.AXE_1H

  public override var minDmg: Double = 110.0

  public override var maxDmg: Double = 205.0

  public override var speed: Double = 2600.0

  public override var stats: Stats = Stats(
      agility = 24
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
