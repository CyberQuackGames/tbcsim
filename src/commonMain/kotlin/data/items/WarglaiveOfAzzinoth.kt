package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.itemsets.ItemSets
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
public class WarglaiveOfAzzinoth : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32837

  public override var name: String = "Warglaive of Azzinoth"

  public override var itemLevel: Int = 156

  public override var quality: Int = 5

  public override var icon: String = "inv_weapon_glave_01.jpg"

  public override var inventorySlot: Int = 21

  public override var itemSet: ItemSet? = ItemSets.byId(699)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.SWORD_1H

  public override var minDmg: Double = 214.0

  public override var maxDmg: Double = 398.0

  public override var speed: Double = 2800.0

  public override var stats: Stats = Stats(
      agility = 22,
      stamina = 29,
      physicalHitRating = 21.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15810, "Attack Power 44", this)
        )}

}
