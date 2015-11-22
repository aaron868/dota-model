package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WeaverTimeLapse extends Ability {

    private static WeaverTimeLapse instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final int cast_range_tooltip_scepter;
    private final int cooldown_scepter;
    private final String localizedName;
    private final String owningHeroShortKey;

    private WeaverTimeLapse() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_MOVEMENT","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 1000;
        abilityCooldown = new int[]{60,50,40};
        abilityManaCost = new int[]{150,75,0};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_NOT_CREEP_HERO";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        fightRecapLevel = 2;
        iD = 5292;
        key = "weaver_time_lapse";
        cast_range_tooltip_scepter = 1000;
        cooldown_scepter = 20;
        localizedName = "Time Lapse";
        owningHeroShortKey = "weaver";
    }

    public static WeaverTimeLapse instance() {
        if( instance == null ){
            instance = new WeaverTimeLapse();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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

    public int getCastRangeTooltipScepter() {
        return cast_range_tooltip_scepter;
    }

    public int getCooldownScepter() {
        return cooldown_scepter;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WeaverTimeLapse))
            return false;
        if (object == this)
            return true;
        WeaverTimeLapse otherObject = (WeaverTimeLapse) object;
        return otherObject.getKey().equals(getKey());
    }

}
