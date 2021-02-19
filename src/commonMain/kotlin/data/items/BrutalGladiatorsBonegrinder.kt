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

public class BrutalGladiatorsBonegrinder : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34989

  public override var name: String = "Brutal Gladiator's Bonegrinder"

  public override var itemLevel: Int = 154

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_2H

  public override var minDmg: Double = 404.0

  public override var maxDmg: Double = 606.0

  public override var speed: Double = 3600.0

  public override var stats: Stats = Stats(
      strength = 50,
      stamina = 66,
      physicalCritRating = 50.0,
      physicalHitRating = 19.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(43902, "Armor Penetration 98", this)
        )}

}
