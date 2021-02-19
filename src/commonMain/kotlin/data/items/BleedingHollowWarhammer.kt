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

public class BleedingHollowWarhammer : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 27741

  public override var name: String = "Bleeding Hollow Warhammer"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_1H

  public override var minDmg: Double = 47.279998779296875

  public override var maxDmg: Double = 151.27999877929688

  public override var speed: Double = 2400.0

  public override var stats: Stats = Stats(
      stamina = 12,
      intellect = 17,
      spellCritRating = 16.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(33250, "Increase Spell Dam 121", this)
        )}

}
