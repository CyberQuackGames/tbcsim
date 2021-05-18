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
public class ShroudOfAbsolution : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 31065

  public override var name: String = "Shroud of Absolution"

  public override var itemLevel: Int = 146

  public override var quality: Int = 4

  public override var icon: String = "inv_chest_cloth_66.jpg"

  public override var inventorySlot: Int = 20

  public override var itemSet: ItemSet? = ItemSets.byId(674)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.CLOTH

  public override var allowableClasses: Array<Constants.AllowableClass>? = arrayOf(
      Constants.AllowableClass.PRIEST
      )

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 36,
      intellect = 39,
      armor = 244,
      spellCritRating = 21.0,
      spellHitRating = 20.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.YELLOW),
      Socket(Color.YELLOW),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2889)

  public override var phase: Int = 0

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(33233, "Increase Spell Dam 61", this),
        Buffs.byIdOrName(21635, "Increased Mana Regen", this)
        )}

}
