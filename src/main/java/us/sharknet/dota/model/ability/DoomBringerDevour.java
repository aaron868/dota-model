package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DoomBringerDevour extends Ability {

    private static DoomBringerDevour instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final int[] bonus_gold;
    private final int[] health_per_second;
    private final String localizedName;
    private final String owningHeroShortKey;

    private DoomBringerDevour() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{300,300,300,300};
        abilityCooldown = new double[]{70.0,60.0,50.0,40.0};
        abilityManaCost = 60;
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_NOT_CREEP_HERO";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_CUSTOM";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_CUSTOM";
        iD = 5339;
        key = "doom_bringer_devour";
        bonus_gold = new int[]{25,50,75,100};
        health_per_second = new int[]{20,20,20,20};
        localizedName = "Devour";
        owningHeroShortKey = "doom_bringer";
    }

    public static DoomBringerDevour instance() {
        if( instance == null ){
            instance = new DoomBringerDevour();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int[] getBonusGold() {
        return bonus_gold;
    }

    public int[] getHealthPerSecond() {
        return health_per_second;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DoomBringerDevour))
            return false;
        if (object == this)
            return true;
        DoomBringerDevour otherObject = (DoomBringerDevour) object;
        return otherObject.getKey().equals(getKey());
    }

}
