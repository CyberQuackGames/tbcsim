package `data`.items

import `data`.Constants
import `data`.itemsets.ItemSets
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
public class OnslaughtHandguards : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 30970

  public override var name: String = "Onslaught Handguards"

  public override var itemLevel: Int = 146

  public override var quality: Int = 4

  public override var icon: String = "inv_gauntlets_62.jpg"

  public override var inventorySlot: Int = 10

  public override var itemSet: ItemSet? = ItemSets.byId(673)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var allowableClasses: Array<Constants.AllowableClass>? = arrayOf(
      Constants.AllowableClass.WARRIOR
      )

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      strength = 18,
      stamina = 50,
      armor = 1141,
      defenseRating = 32.0,
      blockRating = 27.0,
      dodgeRating = 27.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2925)

  public override var phase: Int = 0

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
