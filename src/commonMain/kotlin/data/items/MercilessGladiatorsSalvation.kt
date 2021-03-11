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
public class MercilessGladiatorsSalvation : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32964

  public override var name: String = "Merciless Gladiator's Salvation"

  public override var itemLevel: Int = 136

  public override var quality: Int = 4

  public override var icon: String = "inv_mace_47.jpg"

  public override var inventorySlot: Int = 21

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_1H

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 18.920000076293945

  public override var maxDmg: Double = 112.91999816894531

  public override var speed: Double = 1600.0

  public override var stats: Stats = Stats(
      stamina = 31,
      intellect = 21
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(42127, "Increase Healing 423", this)
        )}

}
