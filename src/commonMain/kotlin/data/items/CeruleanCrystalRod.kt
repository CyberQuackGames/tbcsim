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

public class CeruleanCrystalRod : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32650

  public override var name: String = "Cerulean Crystal Rod"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.WAND

  public override var minDmg: Double = 135.0

  public override var maxDmg: Double = 252.0

  public override var speed: Double = 1500.0

  public override var stats: Stats = Stats(
      stamina = 15,
      intellect = 11
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9417, "Increase Spell Dam 12", this)
        )}

}
