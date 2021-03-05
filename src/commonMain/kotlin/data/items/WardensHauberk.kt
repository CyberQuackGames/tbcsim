package `data`.items

import `data`.Constants
import `data`.model.Color
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import `data`.socketbonus.SocketBonuses
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
public class WardensHauberk : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 25838

  public override var name: String = "Warden's Hauberk"

  public override var itemLevel: Int = 91

  public override var quality: Int = 3

  public override var icon: String = "inv_chest_leather_08.jpg"

  public override var inventorySlot: Int = 5

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      agility = 39,
      stamina = 30
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.RED),
      Socket(Color.RED)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2873)

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
