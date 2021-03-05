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
public class ClawOfThePhoenix : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29948

  public override var name: String = "Claw of the Phoenix"

  public override var itemLevel: Int = 134

  public override var quality: Int = 4

  public override var icon: String = "inv_weapon_hand_12.jpg"

  public override var inventorySlot: Int = 22

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.FIST

  public override var minDmg: Double = 101.0

  public override var maxDmg: Double = 189.0

  public override var speed: Double = 1500.0

  public override var stats: Stats = Stats(
      agility = 21,
      stamina = 30
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(14049, "Attack Power 40", this)
        )}

}
