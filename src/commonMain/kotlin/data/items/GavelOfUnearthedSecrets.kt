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
import kotlin.js.JsExport

@JsExport
public class GavelOfUnearthedSecrets : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 30832

  public override var name: String = "Gavel of Unearthed Secrets"

  public override var itemLevel: Int = 100

  public override var quality: Int = 4

  public override var icon: String = "inv_hammer_08.jpg"

  public override var inventorySlot: Int = 21

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_1H

  public override var minDmg: Double = 45.540000915527344

  public override var maxDmg: Double = 177.5399932861328

  public override var speed: Double = 2700.0

  public override var stats: Stats = Stats(
      stamina = 24,
      intellect = 16,
      spellCritRating = 15.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(34611, "Increase Spell Dam 159", this)
        )}

}