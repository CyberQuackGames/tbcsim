package `data`.items

import `data`.Constants
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
public class FelbaneSlugs : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32883

  public override var name: String = "Felbane Slugs"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_misc_ammo_bullet_02.jpg"

  public override var inventorySlot: Int = 24

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.PROJECTILE

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.BULLET

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 37.0

  public override var maxDmg: Double = 37.0

  public override var speed: Double = 3000.0

  public override var stats: Stats = Stats(

      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override var phase: Int = 1

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
