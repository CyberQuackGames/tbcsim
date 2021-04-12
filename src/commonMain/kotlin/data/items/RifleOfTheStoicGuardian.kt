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
public class RifleOfTheStoicGuardian : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32325

  public override var name: String = "Rifle of the Stoic Guardian"

  public override var itemLevel: Int = 141

  public override var quality: Int = 4

  public override var icon: String = "inv_weapon_rifle_21.jpg"

  public override var inventorySlot: Int = 26

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.GUN

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 120.0

  public override var maxDmg: Double = 224.0

  public override var speed: Double = 1900.0

  public override var stats: Stats = Stats(
      stamina = 31,
      dodgeRating = 20.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOf()}

}