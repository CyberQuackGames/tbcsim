package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.model.Color
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import `data`.socketbonus.SocketBonuses
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
public class GoldenStaffOfTheSindorei : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34337

  public override var name: String = "Golden Staff of the Sin'dorei"

  public override var itemLevel: Int = 164

  public override var quality: Int = 4

  public override var icon: String = "inv_staff_73.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.STAFF

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 146.39999389648438

  public override var maxDmg: Double = 337.3999938964844

  public override var speed: Double = 3200.0

  public override var stats: Stats = Stats(
      stamina = 60,
      intellect = 54,
      spirit = 57,
      spellHasteRating = 32.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.BLUE),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2890)

  public override var phase: Int = 5

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(44973, "Increase Healing 550", this)
        )}

}
