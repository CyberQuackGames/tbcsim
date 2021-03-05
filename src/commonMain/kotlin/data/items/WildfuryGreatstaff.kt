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
public class WildfuryGreatstaff : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 30021

  public override var name: String = "Wildfury Greatstaff"

  public override var itemLevel: Int = 134

  public override var quality: Int = 4

  public override var icon: String = "inv_staff_50.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.STAFF

  public override var minDmg: Double = 135.10000610351562

  public override var maxDmg: Double = 286.1000061035156

  public override var speed: Double = 3000.0

  public override var stats: Stats = Stats(
      stamina = 75,
      dodgeRating = 54.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(44914, "Attack Power - Feral (+0992)", this)
        )}

}
