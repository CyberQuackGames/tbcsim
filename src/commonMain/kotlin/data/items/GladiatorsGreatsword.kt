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
public class GladiatorsGreatsword : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 24550

  public override var name: String = "Gladiator's Greatsword"

  public override var itemLevel: Int = 123

  public override var quality: Int = 4

  public override var icon: String = "inv_sword_70.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.SWORD_2H

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 341.0

  public override var maxDmg: Double = 513.0

  public override var speed: Double = 3600.0

  public override var stats: Stats = Stats(
      strength = 32,
      stamina = 48,
      physicalCritRating = 35.0,
      physicalHitRating = 20.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
