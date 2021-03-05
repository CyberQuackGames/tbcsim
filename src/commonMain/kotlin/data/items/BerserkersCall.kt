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
public class BerserkersCall : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 33831

  public override var name: String = "Berserker's Call"

  public override var itemLevel: Int = 133

  public override var quality: Int = 4

  public override var icon: String = "racial_troll_berserk.jpg"

  public override var inventorySlot: Int = 12

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MISC

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(

      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15831, "Attack Power 90", this),
        Buffs.byIdOrName(43716, "Call of the Berserker", this)
        )}

}
