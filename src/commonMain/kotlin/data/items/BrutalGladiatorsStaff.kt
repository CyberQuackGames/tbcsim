package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import character.Buff
import character.Stats
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public class BrutalGladiatorsStaff : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 35103

  public override var name: String = "Brutal Gladiator's Staff"

  public override var itemLevel: Int = 154

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.STAFF

  public override var minDmg: Double = 86.4000015258789

  public override var maxDmg: Double = 199.39999389648438

  public override var speed: Double = 2000.0

  public override var stats: Stats = Stats(
      strength = 50,
      stamina = 66,
      physicalCritRating = 50.0,
      physicalHitRating = 26.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(45783, "Attack Power - Feral (+1197)", this)
        )}

}
