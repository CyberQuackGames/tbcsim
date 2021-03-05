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
public class TwinBladedRipper : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 30013

  public override var name: String = "Twin-Bladed Ripper"

  public override var itemLevel: Int = 109

  public override var quality: Int = 3

  public override var icon: String = "inv_sword_15.jpg"

  public override var inventorySlot: Int = 13

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 84.0

  public override var maxDmg: Double = 157.0

  public override var speed: Double = 1800.0

  public override var stats: Stats = Stats(
      agility = 12,
      stamina = 12,
      physicalHitRating = 11.0,
      expertiseRating = 7.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(14027, "Attack Power 24", this)
        )}

}
