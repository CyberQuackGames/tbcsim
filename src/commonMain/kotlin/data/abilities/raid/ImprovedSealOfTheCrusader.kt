package data.abilities.raid

import character.Ability
import character.Buff
import character.Stats
import mechanics.Rating
import sim.SimParticipant

class ImprovedSealOfTheCrusader : Ability() {
    companion object {
        const val name = "Improved Seal of the Crusader"
    }

    override val id: Int = 27158
    override val name: String = Companion.name
    override val icon: String = "spell_holy_holysmite.jpg"
    override fun gcdMs(sp: SimParticipant): Int = 0

    // Always assume the raid buffer has 3/3 imp seal
    val bonusCritRating = 3.0 * Rating.critPerPct
    val buff = object : Buff() {
        override val name: String = "Judgement of the Crusader"
        override val icon: String = "spell_holy_holysmite.jpg"
        // Assume the caster is always maintaining this
        override val durationMs: Int = -1
        override val hidden: Boolean = true

        override fun modifyStats(sp: SimParticipant): Stats {
            return Stats(
                meleeCritRating = bonusCritRating,
                rangedCritRating = bonusCritRating,
                spellCritRating = bonusCritRating
            )
        }
    }

    override fun cast(sp: SimParticipant) {
        sp.sim.addRaidBuff(buff)
    }
}
