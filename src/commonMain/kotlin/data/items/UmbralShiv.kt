package `data`.items

import `data`.Constants
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
public class UmbralShiv : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 33493

  public override var name: String = "Umbral Shiv"

  public override var itemLevel: Int = 132

  public override var quality: Int = 4

  public override var icon: String = "inv_weapon_shortblade_66.jpg"

  public override var inventorySlot: Int = 13

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var allowableClasses: Array<Constants.AllowableClass>? = arrayOf(
      Constants.AllowableClass.WARRIOR,
      Constants.AllowableClass.PALADIN,
      Constants.AllowableClass.HUNTER,
      Constants.AllowableClass.ROGUE,
      Constants.AllowableClass.PRIEST,
      Constants.AllowableClass.DEATHKNIGHT,
      Constants.AllowableClass.SHAMAN,
      Constants.AllowableClass.MAGE,
      Constants.AllowableClass.WARLOCK,
      Constants.AllowableClass.DRUID
      )

  public override var minDmg: Double = 137.0

  public override var maxDmg: Double = 207.0

  public override var speed: Double = 1800.0

  public override var stats: Stats = Stats(
      agility = 12,
      stamina = 30,
      physicalHitRating = 13.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2973)

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
