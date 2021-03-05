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
public class EdgeOfOppression : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34606

  public override var name: String = "Edge of Oppression"

  public override var itemLevel: Int = 115

  public override var quality: Int = 4

  public override var icon: String = "inv_knife_1h_stratholme_d_03.jpg"

  public override var inventorySlot: Int = 13

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 79.0

  public override var maxDmg: Double = 148.0

  public override var speed: Double = 1300.0

  public override var stats: Stats = Stats(
      stamina = 25,
      physicalHasteRating = 17.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(14089, "Attack Power 36", this)
        )}

}
