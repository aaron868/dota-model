package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ChaosKnightRealityRift extends Ability {

    private static ChaosKnightRealityRift instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final int[] abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_damage;
    private final double bonus_duration;
    private final int[] cast_range;
    private final String localizedName;
    private final String owningHeroShortKey;

    private ChaosKnightRealityRift() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.4,0.4,0.4,0.4};
        abilityCastRange = new int[]{550,600,650,700};
        abilityCooldown = new int[]{24,18,12,6};
        abilityManaCost = 5;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5427;
        key = "chaos_knight_reality_rift";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bonus_damage = new int[]{60,80,100,120};
        bonus_duration = 1.2;
        cast_range = new int[]{550,600,650,700};
        localizedName = "Reality Rift";
        owningHeroShortKey = "chaos_knight";
    }

    public static ChaosKnightRealityRift instance() {
        if( instance == null ){
            instance = new ChaosKnightRealityRift();
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

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
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

    public int[] getBonusDamage() {
        return bonus_damage;
    }

    public double getBonusDuration() {
        return bonus_duration;
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
        if (!(object instanceof ChaosKnightRealityRift))
            return false;
        if (object == this)
            return true;
        ChaosKnightRealityRift otherObject = (ChaosKnightRealityRift) object;
        return otherObject.getKey().equals(getKey());
    }

}
