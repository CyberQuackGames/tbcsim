package data.abilities.raid

import character.*
import sim.SimIteration

class CurseOfShadow : Ability() {
    companion object {
        const val name = "Curse of Shadow"
    }

    override val id: Int = 27226
    override val name: String = Companion.name
    override fun gcdMs(sim: SimIteration): Int = 0

    val buff = object : Buff() {
        override val name: String = Companion.name
        // Assume the caster is always maintaining this
        override val durationMs: Int = -1
        override val hidden: Boolean = true

        override fun modifyStats(sim: SimIteration, stats: Stats): Stats {
            return stats.add(Stats(
                shadowDamageMultiplier = 1.1
            ))
        }

        override fun procs(sim: SimIteration): List<Proc> = listOf()
    }

    val debuff = object : Debuff() {
        override fun tick(sim: SimIteration) {
            // Not periodic, do nothing
        }

        override val name: String = Companion.name
        // Assume the caster is always maintaining this
        override val durationMs: Int = -1
        override val hidden: Boolean = true

        override fun modifyStats(sim: SimIteration, stats: Stats): Stats {
            return stats.subtract(Stats(
                shadowResistance = 88
            ))
        }

        override fun procs(sim: SimIteration): List<Proc> = listOf()
    }

    override fun cast(sim: SimIteration, free: Boolean) {
        sim.addBuff(buff)
        sim.addDebuff(debuff)
    }

    override val baseCastTimeMs: Int = 0
}