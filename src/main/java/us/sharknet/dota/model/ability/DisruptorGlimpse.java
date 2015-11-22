package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DisruptorGlimpse extends Ability {

    private static DisruptorGlimpse instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] backtrack_time;
    private final int[] cast_range;
    private final String localizedName;
    private final String owningHeroShortKey;

    private DisruptorGlimpse() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.05,0.05,0.05,0.05};
        abilityCastRange = new int[]{600,1000,1400,1800};
        abilityCooldown = new double[]{60.0,46.0,32.0,18.0};
        abilityManaCost = 100;
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_NOT_CREEP_HERO";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        fightRecapLevel = 1;
        iD = 5459;
        key = "disruptor_glimpse";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        backtrack_time = new double[]{4.0,4.0,4.0,4.0};
        cast_range = new int[]{600,1000,1400,1800};
        localizedName = "Glimpse";
        owningHeroShortKey = "disruptor";
    }

    public static DisruptorGlimpse instance() {
        if( instance == null ){
            instance = new DisruptorGlimpse();
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

    public int getAbilityManaCost() {
        return abilityManaCost;
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

    public double[] getBacktrackTime() {
        return backtrack_time;
    }

    public int[] getCastRange() {
        return cast_range;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DisruptorGlimpse))
            return false;
        if (object == this)
            return true;
        DisruptorGlimpse otherObject = (DisruptorGlimpse) object;
        return otherObject.getKey().equals(getKey());
    }

}
