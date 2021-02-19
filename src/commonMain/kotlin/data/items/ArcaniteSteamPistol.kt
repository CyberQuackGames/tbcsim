package `data`.items

import `data`.Constants
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

public class ArcaniteSteamPistol : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29949

  public override var name: String = "Arcanite Steam-Pistol"

  public override var itemLevel: Int = 134

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.GUN

  public override var minDmg: Double = 177.0

  public override var maxDmg: Double = 329.0

  public override var speed: Double = 2900.0

  public override var stats: Stats = Stats(
      agility = 20,
      physicalHitRating = 19.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
