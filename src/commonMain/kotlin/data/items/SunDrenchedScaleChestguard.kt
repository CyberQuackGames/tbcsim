package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
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
public class SunDrenchedScaleChestguard : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34375

  public override var name: String = "Sun-Drenched Scale Chestguard"

  public override var itemLevel: Int = 159

  public override var quality: Int = 4

  public override var icon: String = "inv_chest_mail_04.jpg"

  public override var inventorySlot: Int = 5

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var allowableClasses: Array<Constants.AllowableClass>? = arrayOf(
      Constants.AllowableClass.WARRIOR,
      Constants.AllowableClass.PALADIN,
      Constants.AllowableClass.HUNTER,
      Constants.AllowableClass.ROGUE,
      Constants.AllowableClass.PRIEST,
      Constants.AllowableClass.DEATHKNIGHT,
      Constants.AllowableClass.SHAMAN,
      Constants.AllowableClass.MAGE,
      Constants.AllowableClass.WARLOCK,
      Constants.AllowableClass.DRUID
      )

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 48,
      intellect = 41,
      armor = 1110,
      spellHasteRating = 40.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.RED),
      Socket(Color.RED)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2865)

  public override var phase: Int = 0

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(29369, "Increase Healing 134", this),
        Buffs.byIdOrName(20959, "Increased Mana Regen", this)
        )}

}
