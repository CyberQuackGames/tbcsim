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
public class TheOathkeeper : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 31299

  public override var name: String = "The Oathkeeper"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_mace_47.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_2H

  public override var minDmg: Double = 252.0

  public override var maxDmg: Double = 420.0

  public override var speed: Double = 3600.0

  public override var stats: Stats = Stats(
      strength = 35,
      stamina = 24,
      intellect = 32,
      physicalHitRating = 26.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
