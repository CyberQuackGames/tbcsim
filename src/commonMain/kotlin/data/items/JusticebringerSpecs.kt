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
public class JusticebringerSpecs : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 35185

  public override var name: String = "Justicebringer 3000 Specs"

  public override var itemLevel: Int = 159

  public override var quality: Int = 4

  public override var icon: String = "inv_gizmo_newgoggles.jpg"

  public override var inventorySlot: Int = 1

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 48,
      intellect = 26,
      armor = 1611,
      spellCritRating = 52.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.META),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2951)

  public override var phase: Int = 0

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(40342, "Increase Healing 128", this),
        Buffs.byIdOrName(30645, "Gas Cloud Tracking", this),
        Buffs.byIdOrName(40273, "Stealth Detection", this),
        Buffs.byIdOrName(12883, "Longsight", this)
        )}

}
