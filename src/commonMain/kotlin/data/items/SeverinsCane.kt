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

public class SeverinsCane : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32830

  public override var name: String = "Severin's Cane"

  public override var itemLevel: Int = 109

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.STAFF

  public override var minDmg: Double = 105.08000183105469

  public override var maxDmg: Double = 190.0800018310547

  public override var speed: Double = 2400.0

  public override var stats: Stats = Stats(
      stamina = 60,
      intellect = 40
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(36428, "Increase Healing 194", this)
        )}

}
