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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.js.JsExport

@JsExport
public class LatrosDancingBlade : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34703

  public override var name: String = "Latro's Dancing Blade"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_sword_76.jpg"

  public override var inventorySlot: Int = 13

  public override var itemSet: ItemSet? = ItemSets.byId(737)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.SWORD_1H

  public override var minDmg: Double = 130.0

  public override var maxDmg: Double = 243.0

  public override var speed: Double = 2600.0

  public override var stats: Stats = Stats(
      stamina = 21
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9335, "Attack Power 28", this),
        Buffs.byIdOrName(43902, "Armor Penetration 98", this)
        )}

}