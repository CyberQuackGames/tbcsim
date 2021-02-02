package data.abilities.raid

import character.Ability
import character.Buff
import character.Stats
import sim.SimIteration

class WindfuryTotem : Ability() {
    companion object {
        const val name = "Windfury Totem"
    }

    override val id: Int = 25528
    override val name: String = Companion.name
    override fun gcdMs(sim: SimIteration): Int = 0

    val buff = object : Buff() {
        override val name: String = Companion.name
        // Assume the caster is always maintaining this
        override val durationMs: Int = -1
        override val hidden: Boolean = true

        // Assume 100% uptime and that the caster has Enhancing Totems
        override fun modifyStats(sim: SimIteration): Stats {
            return Stats(
                strength = (86.0 * 1.15).toInt()
            )
        }
    }

    override fun cast(sim: SimIteration, free: Boolean) {
        sim.addBuff(buff)
    }
}
