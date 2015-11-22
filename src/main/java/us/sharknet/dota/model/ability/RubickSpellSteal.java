package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RubickSpellSteal extends Ability {

    private static RubickSpellSteal instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int cast_range_scepter;
    private final int cooldown_scepter;
    private final double[] duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int projectile_speed;

    private RubickSpellSteal() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.1,0.1,0.1,0.1};
        abilityCastRange = new int[]{1000,1000,1000};
        abilityCooldown = new double[]{20.0,18.0,16.0};
        abilityManaCost = new int[]{25,25,25};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        fightRecapLevel = 1;
        iD = 5452;
        key = "rubick_spell_steal";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        cast_range_scepter = 1400;
        cooldown_scepter = 2;
        duration = new double[]{180.0,240.0,300.0};
        localizedName = "Spell Steal";
        owningHeroShortKey = "rubick";
        projectile_speed = 900;
    }

    public static RubickSpellSteal instance() {
        if( instance == null ){
            instance = new RubickSpellSteal();
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

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public String getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public int getCastRangeScepter() {
        return cast_range_scepter;
    }

    public int getCooldownScepter() {
        return cooldown_scepter;
    }

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getProjectileSpeed() {
        return projectile_speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RubickSpellSteal))
            return false;
        if (object == this)
            return true;
        RubickSpellSteal otherObject = (RubickSpellSteal) object;
        return otherObject.getKey().equals(getKey());
    }

}
