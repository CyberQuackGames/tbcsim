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
public class MagnifiedMoonSpecs : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32480

  public override var name: String = "Magnified Moon Specs"

  public override var itemLevel: Int = 127

  public override var quality: Int = 4

  public override var icon: String = "inv_gizmo_newgoggles.jpg"

  public override var inventorySlot: Int = 1

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 22,
      intellect = 24,
      spellCritRating = 41.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.META),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2889)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(33484, "Increase Spell Dam 50", this),
        Buffs.byIdOrName(30645, "Gas Cloud Tracking", this),
        Buffs.byIdOrName(40273, "Stealth Detection", this),
        Buffs.byIdOrName(12883, "Longsight", this)
        )}

}
