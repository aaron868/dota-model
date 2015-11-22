package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class CourierMorph extends Ability {

    private static CourierMorph instance;

    private final String[] abilityBehavior;
    private final int abilityCastRange;
    private final double abilityCooldown;
    private final String abilityType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;

    private CourierMorph() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_DONT_CANCEL_MOVEMENT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastRange = 0;
        abilityCooldown = .1;
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5642;
        key = "courier_morph";
        maxLevel = 1;
        localizedName = "Morph";
        owningHeroShortKey = "courier";
    }

    public static CourierMorph instance() {
        if( instance == null ){
            instance = new CourierMorph();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public double getAbilityCooldown() {
        return abilityCooldown;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public String getAbilityUnitTargetTeam() {
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

    public int getMaxLevel() {
        return maxLevel;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof CourierMorph))
            return false;
        if (object == this)
            return true;
        CourierMorph otherObject = (CourierMorph) object;
        return otherObject.getKey().equals(getKey());
    }

}
