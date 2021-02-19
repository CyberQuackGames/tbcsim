package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.itemsets.ItemSets
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

public class FistOfMoltenFury : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32945

  public override var name: String = "Fist of Molten Fury"

  public override var itemLevel: Int = 141

  public override var itemSet: ItemSet? = ItemSets.byId(719)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.FIST

  public override var minDmg: Double = 120.0

  public override var maxDmg: Double = 181.0

  public override var speed: Double = 1500.0

  public override var stats: Stats = Stats(
      agility = 20,
      stamina = 28
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15808, "Attack Power 38", this)
        )}

}
