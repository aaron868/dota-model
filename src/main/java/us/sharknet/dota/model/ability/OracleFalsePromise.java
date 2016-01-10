package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class OracleFalsePromise extends Ability {

    private static OracleFalsePromise instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final double[] duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private OracleFalsePromise() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{.3,.3,.3,.3};
        abilityCastRange = new int[]{1000,1000,1000,1000};
        abilityCooldown = new double[]{90,60,30};
        abilityManaCost = new int[]{100,100,100,100};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO"};
        iD = 5640;
        key = "oracle_false_promise";
        duration = new double[]{7.0,8.0,9.0};
        localizedName = "False Promise";
        ownerKey = "npc_dota_hero_oracle";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 4;
    }

    public static OracleFalsePromise instance() {
        if( instance == null ){
            instance = new OracleFalsePromise();
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

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public String[] getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
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

    public String getOwnerKey() {
        return ownerKey;
    }

    public AbilityOwnerType getOwnerType() {
        return ownerType;
    }

    public boolean isPassive() {
        return passive;
    }

    public boolean isPlaceholder() {
        return placeholder;
    }

    public int getRadius() {
        return radius;
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
