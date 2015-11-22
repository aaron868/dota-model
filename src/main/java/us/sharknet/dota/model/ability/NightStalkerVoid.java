package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NightStalkerVoid extends Ability {

    private static NightStalkerVoid instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] attackspeed_slow;
    private final double[] duration_day;
    private final double[] duration_night;
    private final String localizedName;
    private final int[] movespeed_slow;
    private final String owningHeroShortKey;

    private NightStalkerVoid() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 525;
        abilityCooldown = new int[]{8,8,8,8};
        abilityDamage = new int[]{90,160,255,335};
        abilityManaCost = new int[]{80,90,100,110};
        abilityModifierSupportValue = .5;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5275;
        key = "night_stalker_void";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        attackspeed_slow = new int[]{-50,-50,-50,-50};
        duration_day = new double[]{2.0,2.0,2.0,2.0};
        duration_night = new double[]{4.0,4.0,4.0,4.0};
        localizedName = "Void";
        movespeed_slow = new int[]{-50,-50,-50,-50};
        owningHeroShortKey = "night_stalker";
    }

    public static NightStalkerVoid instance() {
        if( instance == null ){
            instance = new NightStalkerVoid();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int[] getAttackspeedSlow() {
        return attackspeed_slow;
    }

    public double[] getDurationDay() {
        return duration_day;
    }

    public double[] getDurationNight() {
        return duration_night;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMovespeedSlow() {
        return movespeed_slow;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof NightStalkerVoid))
            return false;
        if (object == this)
            return true;
        NightStalkerVoid otherObject = (NightStalkerVoid) object;
        return otherObject.getKey().equals(getKey());
    }

}
