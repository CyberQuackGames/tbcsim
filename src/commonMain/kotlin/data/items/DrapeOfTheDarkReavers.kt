package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import character.Buff
import character.Stats
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.js.JsExport

@JsExport
public class DrapeOfTheDarkReavers : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28672

  public override var name: String = "Drape of the Dark Reavers"

  public override var itemLevel: Int = 115

  public override var quality: Int = 4

  public override var icon: String = "inv_misc_cape_10.jpg"

  public override var inventorySlot: Int = 16

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.CLOTH

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      agility = 24,
      stamina = 21,
      physicalHitRating = 17.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15806, "Attack Power 34", this)
        )}

}