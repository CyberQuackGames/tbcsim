package mechanics

import character.Stats
import data.model.Item
import sim.Event
import sim.SimParticipant
import kotlin.js.JsExport
import kotlin.random.Random

@JsExport
object Ranged {

    fun baseMiss(sp: SimParticipant): Double {
        return General.valueByLevelDiff(sp, General.baseMissChance)
    }

    fun rangedMissChance(sp: SimParticipant): Double {
        val baseMiss = baseMiss(sp)
        val physicalHitChance = sp.physicalHitPct() / 100.0
        return (baseMiss - physicalHitChance).coerceAtLeast(0.0)
    }

    // Converts an attack power value into a flat damage modifier for a particular item
    @Suppress("UNUSED_PARAMETER")
    fun apToDamage(sp: SimParticipant, attackPower: Int, item: Item): Double {
        return attackPower / 14 * (item.speed / 1000.0)
    }

    fun baseDamageRoll(sp: SimParticipant, item: Item, bonusAp: Int = 0, isWhiteDmg: Boolean = false): Double {
        val totalAp = sp.rangedAttackPower() + bonusAp
        val min = item.minDmg.coerceAtLeast(0.0)
        val max = item.maxDmg.coerceAtLeast(1.0)

        val flatModifier = if(isWhiteDmg) {
            sp.stats.whiteDamageFlatModifier
        } else {
            sp.stats.yellowDamageFlatModifier
        }

        val allMultiplier = if(isWhiteDmg) {
            sp.stats.whiteDamageMultiplier
        } else {
            sp.stats.yellowDamageMultiplier
        } * sp.stats.physicalDamageMultiplier

        return (Random.nextDouble(min, max) + apToDamage(sp, totalAp, item) + flatModifier) * allMultiplier
    }

    // Performs an attack roll given an initial unmitigated damage value
    fun attackRoll(sp: SimParticipant, damageRoll: Double, item: Item, isWhiteDmg: Boolean = false) : Pair<Double, Event.Result> {
        // Find all our possible damage mods from buffs and so on
        val critMultiplier = Stats.physicalCritMultiplier + (if(isWhiteDmg) {
            sp.stats.whiteDamageAddlCritMultiplier
        } else {
            sp.stats.yellowDamageAddlCritMultiplier
        } - 1)

        // Get the attack result
        val missChance = rangedMissChance(sp)
        val blockChance = General.physicalBlockChance(sp) + missChance
        val critChance = if(isWhiteDmg) {
            General.physicalCritChance(sp) + blockChance
        } else {
            blockChance
        }

        val attackRoll = Random.nextDouble()
        var finalResult = when {
            attackRoll < missChance -> Pair(0.0, Event.Result.MISS)
            attackRoll < blockChance -> Pair(damageRoll, Event.Result.BLOCK) // Blocked damage is reduced later
            isWhiteDmg && attackRoll < critChance -> Pair(damageRoll * critMultiplier, Event.Result.CRIT)
            else -> Pair(damageRoll, Event.Result.HIT)
        }

        if(!isWhiteDmg) {
            // Two-roll yellow hit
            if(finalResult.second == Event.Result.HIT || finalResult.second == Event.Result.BLOCK) {
                val hitRoll2 = Random.nextDouble()
                finalResult = when {
                    hitRoll2 < General.physicalCritChance(sp) -> Pair(
                        finalResult.first * critMultiplier,
                        Event.Result.CRIT
                    )
                    else -> finalResult
                }
            }
        }

        // Apply target armor mitigation
        finalResult = Pair(finalResult.first * (1 - General.physicalArmorMitigation(sp)), finalResult.second)

        // If the attack was blocked, reduce by the block value
        if(finalResult.second == Event.Result.BLOCK || finalResult.second == Event.Result.BLOCKED_CRIT) {
            finalResult = Pair(finalResult.first - General.physicalBlockReduction(sp), finalResult.second)
        }

        return finalResult
    }
}
