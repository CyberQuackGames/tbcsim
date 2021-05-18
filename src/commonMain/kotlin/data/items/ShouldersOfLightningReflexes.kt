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
public class ShouldersOfLightningReflexes : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32575

  public override var name: String = "Shoulders of Lightning Reflexes"

  public override var itemLevel: Int = 141

  public override var quality: Int = 4

  public override var icon: String = "inv_shoulder_66.jpg"

  public override var inventorySlot: Int = 3

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
      agility = 27,
      stamina = 19,
      intellect = 21,
      armor = 741,
      physicalHasteRating = 37.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override var phase: Int = 0

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15823, "Attack Power 74", this)
        )}

}
