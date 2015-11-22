package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DoomBringerLvlDeath extends Ability {

    private static DoomBringerLvlDeath instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final int abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage;
    private final String localizedName;
    private final int lvl_bonus_damage;
    private final int[] lvl_bonus_multiple;
    private final String owningHeroShortKey;

    private DoomBringerLvlDeath() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{600,600,600,600};
        abilityCooldown = 7;
        abilityManaCost = new int[]{110,110,110,110};
        abilityModifierSupportValue = 0;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        fightRecapLevel = 1;
        iD = 5341;
        key = "doom_bringer_lvl_death";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage = new int[]{125,175,225,275};
        localizedName = "Lvl Death";
        lvl_bonus_damage = 20;
        lvl_bonus_multiple = new int[]{6,5,4,3};
        owningHeroShortKey = "doom_bringer";
    }

    public static DoomBringerLvlDeath instance() {
        if( instance == null ){
            instance = new DoomBringerLvlDeath();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int[] getDamage() {
        return damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getLvlBonusDamage() {
        return lvl_bonus_damage;
    }

    public int[] getLvlBonusMultiple() {
        return lvl_bonus_multiple;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DoomBringerLvlDeath))
            return false;
        if (object == this)
            return true;
        DoomBringerLvlDeath otherObject = (DoomBringerLvlDeath) object;
        return otherObject.getKey().equals(getKey());
    }

}
