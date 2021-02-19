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

public class ZangartoothShortblade : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 24453

  public override var name: String = "Zangartooth Shortblade"

  public override var itemLevel: Int = 94

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 36.04999923706055

  public override var maxDmg: Double = 88.05000305175781

  public override var speed: Double = 1500.0

  public override var stats: Stats = Stats(
      stamina = 13,
      intellect = 14,
      spellHitRating = 12.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(33233, "Increase Spell Dam 61", this)
        )}

}
