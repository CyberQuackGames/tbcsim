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

public class IronstaffOfRegeneration : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 27412

  public override var name: String = "Ironstaff of Regeneration"

  public override var itemLevel: Int = 100

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.STAFF

  public override var minDmg: Double = 92.0999984741211

  public override var maxDmg: Double = 158.10000610351562

  public override var speed: Double = 2100.0

  public override var stats: Stats = Stats(
      stamina = 33,
      intellect = 29,
      spirit = 35
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(26461, "Increase Healing 143", this)
        )}

}
