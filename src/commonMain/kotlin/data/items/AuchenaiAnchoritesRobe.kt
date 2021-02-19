package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
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

public class AuchenaiAnchoritesRobe : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29341

  public override var name: String = "Auchenai Anchorite's Robe"

  public override var itemLevel: Int = 100

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.CLOTH

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      intellect = 24,
      spellHitRating = 23.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.YELLOW),
      Socket(Color.YELLOW),
      Socket(Color.RED)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2864)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(14127, "Increase Spell Dam 28", this)
        )}

}
