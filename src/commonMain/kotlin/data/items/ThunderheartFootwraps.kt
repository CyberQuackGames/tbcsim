package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
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
public class ThunderheartFootwraps : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34572

  public override var name: String = "Thunderheart Footwraps"

  public override var itemLevel: Int = 154

  public override var quality: Int = 4

  public override var icon: String = "inv_boots_08.jpg"

  public override var inventorySlot: Int = 8

  public override var itemSet: ItemSet? = ItemSets.byId(677)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 21,
      intellect = 30,
      spellCritRating = 28.0,
      spellHasteRating = 13.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2884)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(45011, "Increase Spell Dam 50", this),
        Buffs.byIdOrName(21634, "Increased Mana Regen", this)
        )}

}
