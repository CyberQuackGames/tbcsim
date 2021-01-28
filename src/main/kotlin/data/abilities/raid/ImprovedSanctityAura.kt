package data.abilities.raid

import character.Ability
import character.Buff
import character.Proc
import character.Stats
import sim.SimIteration

class ImprovedSanctityAura : Ability() {
    companion object {
        const val name = "Improved Sanctity Aura"
    }

    override val id: Int = 31870
    override val name: String = Companion.name
    override fun gcdMs(sim: SimIteration): Int = 0

    val buff = object : Buff() {
        override val name: String = Companion.name
        // Assume the caster is always maintaining this
        override val durationMs: Int = -1
        override val hidden: Boolean = true

        override fun modifyStats(sim: SimIteration, stats: Stats): Stats {
            return stats.add(Stats(
                physicalDamageMultiplier = 1.02
            ))
        }

        override fun procs(sim: SimIteration): List<Proc> = listOf()
    }

    override fun cast(sim: SimIteration, free: Boolean) {
        sim.addBuff(buff)
    }

    override val baseCastTimeMs: Int = 0
}