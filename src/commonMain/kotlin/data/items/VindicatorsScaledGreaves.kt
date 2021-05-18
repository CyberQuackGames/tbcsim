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
public class VindicatorsScaledGreaves : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 33911

  public override var name: String = "Vindicator's Scaled Greaves"

  public override var itemLevel: Int = 146

  public override var quality: Int = 4

  public override var icon: String = "inv_boots_plate_04.jpg"

  public override var inventorySlot: Int = 8

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var allowableClasses: Array<Constants.AllowableClass>? = arrayOf(
      Constants.AllowableClass.WARRIOR,
      Constants.AllowableClass.PALADIN
      )

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      strength = 40,
      stamina = 39,
      intellect = 26,
      armor = 1255,
      meleeCritRating = 27.0,
      rangedCritRating = 27.0,
      resilienceRating = 26.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override var phase: Int = 3

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
