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
public class DarkBlessing : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 33468

  public override var name: String = "Dark Blessing"

  public override var itemLevel: Int = 138

  public override var quality: Int = 4

  public override var icon: String = "inv_staff_64.jpg"

  public override var inventorySlot: Int = 21

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_1H

  public override var minDmg: Double = 22.1299991607666

  public override var maxDmg: Double = 135.1300048828125

  public override var speed: Double = 1900.0

  public override var stats: Stats = Stats(
      intellect = 19,
      spellHasteRating = 30.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(42070, "Increase Healing 431", this)
        )}

}
