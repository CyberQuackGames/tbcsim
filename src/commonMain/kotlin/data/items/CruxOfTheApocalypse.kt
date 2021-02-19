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

public class CruxOfTheApocalypse : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34329

  public override var name: String = "Crux of the Apocalypse"

  public override var itemLevel: Int = 164

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 164.0

  public override var maxDmg: Double = 247.0

  public override var speed: Double = 1800.0

  public override var stats: Stats = Stats(
      agility = 18,
      stamina = 15,
      physicalHasteRating = 27.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.RED)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(3114)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15814, "Attack Power 56", this)
        )}

}
