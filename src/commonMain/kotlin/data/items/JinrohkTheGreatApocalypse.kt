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
public class JinrohkTheGreatApocalypse : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 33478

  public override var name: String = "Jin'rohk, The Great Apocalypse"

  public override var itemLevel: Int = 138

  public override var quality: Int = 4

  public override var icon: String = "inv_sword_108.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.SWORD_2H

  public override var minDmg: Double = 380.0

  public override var maxDmg: Double = 570.0

  public override var speed: Double = 3700.0

  public override var stats: Stats = Stats(
      stamina = 49,
      physicalHasteRating = 45.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(40933, "Attack Power 120", this)
        )}

}
