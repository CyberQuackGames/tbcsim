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
public class ArchmagesGuile : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34667

  public override var name: String = "Archmage's Guile"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_sword_59.jpg"

  public override var inventorySlot: Int = 21

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.SWORD_1H

  public override var minDmg: Double = 45.310001373291016

  public override var maxDmg: Double = 145.30999755859375

  public override var speed: Double = 2300.0

  public override var stats: Stats = Stats(
      stamina = 12,
      intellect = 11,
      spellCritRating = 20.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(33490, "Increase Spell Dam 121", this)
        )}

}
