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

public class VanirsLeftFistOfBrutality : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34951

  public override var name: String = "Vanir's Left Fist of Brutality"

  public override var itemLevel: Int = 146

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.FIST

  public override var minDmg: Double = 180.0

  public override var maxDmg: Double = 335.0

  public override var speed: Double = 2500.0

  public override var stats: Stats = Stats(
      physicalHitRating = 21.0,
      physicalHasteRating = 23.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15810, "Attack Power 44", this)
        )}

}
