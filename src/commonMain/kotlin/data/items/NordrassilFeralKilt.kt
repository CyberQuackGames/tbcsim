package `data`.items

import `data`.Constants
import `data`.itemsets.ItemSets
import `data`.model.Color
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import `data`.socketbonus.SocketBonuses
import character.Buff
import character.Stats
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public class NordrassilFeralKilt : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 30229

  public override var name: String = "Nordrassil Feral-Kilt"

  public override var itemLevel: Int = 133

  public override var itemSet: ItemSet? = ItemSets.byId(641)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      strength = 46,
      agility = 37,
      stamina = 42,
      intellect = 17,
      physicalHitRating = 18.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(3149)

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
