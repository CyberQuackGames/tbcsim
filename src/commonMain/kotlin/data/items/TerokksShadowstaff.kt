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
public class TerokksShadowstaff : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29355

  public override var name: String = "Terokk's Shadowstaff"

  public override var itemLevel: Int = 105

  public override var quality: Int = 4

  public override var icon: String = "inv_weapon_halberd19.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.STAFF

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 143.60000610351562

  public override var maxDmg: Double = 282.6000061035156

  public override var speed: Double = 3200.0

  public override var stats: Stats = Stats(
      stamina = 40,
      intellect = 42,
      spellCritRating = 37.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(37542, "Increase Spell Dam 168", this)
        )}

}
