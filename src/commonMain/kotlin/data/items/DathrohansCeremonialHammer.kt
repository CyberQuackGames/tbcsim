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
public class DathrohansCeremonialHammer : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28216

  public override var name: String = "Dathrohan's Ceremonial Hammer"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_hammer_11.jpg"

  public override var inventorySlot: Int = 21

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_1H

  public override var minDmg: Double = 35.459999084472656

  public override var maxDmg: Double = 113.45999908447266

  public override var speed: Double = 1800.0

  public override var stats: Stats = Stats(
      stamina = 13,
      intellect = 14,
      spirit = 18
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(33273, "Increase Healing 227", this)
        )}

}
