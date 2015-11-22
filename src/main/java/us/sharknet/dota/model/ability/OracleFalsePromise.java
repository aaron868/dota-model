package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class OracleFalsePromise extends Ability {

    private static OracleFalsePromise instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int abilityManaCost;
    private final String abilityType;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final double[] duration;
    private final String localizedName;
    private final String owningHeroShortKey;

    private OracleFalsePromise() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = .3;
        abilityCastRange = 1000;
        abilityCooldown = new int[]{80,60,40};
        abilityManaCost = 200;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        iD = 5640;
        key = "oracle_false_promise";
        duration = new double[]{6.0,7.0,8.0};
        localizedName = "False Promise";
        owningHeroShortKey = "oracle";
    }

    public static OracleFalsePromise instance() {
        if( instance == null ){
            instance = new OracleFalsePromise();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
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

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof OracleFalsePromise))
            return false;
        if (object == this)
            return true;
        OracleFalsePromise otherObject = (OracleFalsePromise) object;
        return otherObject.getKey().equals(getKey());
    }

}
