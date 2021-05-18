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
public class ClawOfMoltenFury : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32946

  public override var name: String = "Claw of Molten Fury"

  public override var itemLevel: Int = 141

  public override var quality: Int = 4

  public override var icon: String = "inv_weapon_hand_14.jpg"

  public override var inventorySlot: Int = 21

  public override var itemSet: ItemSet? = ItemSets.byId(719)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.FIST

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 216.0

  public override var maxDmg: Double = 325.0

  public override var speed: Double = 2700.0

  public override var stats: Stats = Stats(
      agility = 20,
      stamina = 28
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override var phase: Int = 3

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15808, "Attack Power 38", this)
        )}

}
