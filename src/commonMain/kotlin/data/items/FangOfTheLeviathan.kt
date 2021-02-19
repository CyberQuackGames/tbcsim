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

public class FangOfTheLeviathan : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 30095

  public override var name: String = "Fang of the Leviathan"

  public override var itemLevel: Int = 134

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.SWORD_1H

  public override var minDmg: Double = 21.459999084472656

  public override var maxDmg: Double = 126.45999908447266

  public override var speed: Double = 1800.0

  public override var stats: Stats = Stats(
      stamina = 28,
      intellect = 20,
      spellCritRating = 21.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(44073, "Increase Spell Dam 215", this)
        )}

}
