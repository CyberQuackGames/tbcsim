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
public class DepletedClothBracers : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32676

  public override var name: String = "Depleted Cloth Bracers"

  public override var itemLevel: Int = 105

  public override var quality: Int = 4

  public override var icon: String = "inv_bracer_09.jpg"

  public override var inventorySlot: Int = 0

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.MISCELLANEOUS

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.JUNK

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      intellect = 16,
      armor = 71,
      spellCritRating = 12.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override var phase: Int = 2

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(14047, "Increase Spell Dam 23", this),
        Buffs.byIdOrName(40748, "Apexis Crystal Infusion", this)
        )}

}
