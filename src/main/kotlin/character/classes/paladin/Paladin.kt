package character.classes.paladin

import character.*
import data.model.Item

class Paladin(talents: Map<String, Talent>) : Class(talents) {
    override val baseStats: Stats = Stats(
        agility = 79,
        intellect = 180,
        strength = 252,
        stamina = 154,
        spirit = 135
    )
    override val buffs: List<Buff>
        get() = TODO("Not yet implemented")

    override fun abilityFromString(name: String, item: Item?): Ability? {
        TODO("Not yet implemented")
    }

    override fun talentFromString(name: String, ranks: Int): Talent? {
        TODO("Not yet implemented")
    }

    override val resourceType: Resource.Type
        get() = TODO("Not yet implemented")
    override val canDualWield: Boolean
        get() = TODO("Not yet implemented")
    override val allowAutoAttack: Boolean
        get() = TODO("Not yet implemented")
    override val attackPowerFromAgility: Int
        get() = TODO("Not yet implemented")
    override val attackPowerFromStrength: Int
        get() = TODO("Not yet implemented")
    override val critPctPerAgility: Double
        get() = TODO("Not yet implemented")
    override val rangedAttackPowerFromAgility: Int
        get() = TODO("Not yet implemented")
    override val baseMana: Int
        get() = TODO("Not yet implemented")
    override val baseSpellCritChance: Double
        get() = TODO("Not yet implemented")
}
