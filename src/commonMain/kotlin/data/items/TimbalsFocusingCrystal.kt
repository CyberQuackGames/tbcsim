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
public class TimbalsFocusingCrystal : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34470

  public override var name: String = "Timbal's Focusing Crystal"

  public override var itemLevel: Int = 115

  public override var quality: Int = 4

  public override var icon: String = "inv_misc_gem_lionseye_01.jpg"

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
        Buffs.byIdOrName(45054, "Augment Pain", this),
        Buffs.byIdOrName(17493, "Increase Spell Dam 44", this)
        )}

}
