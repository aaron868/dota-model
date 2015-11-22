package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class CourierShield extends Ability {

    private static CourierShield instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int duration;
    private final String localizedName;
    private final String owningHeroShortKey;

    private CourierShield() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCooldown = 2;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5209;
        key = "courier_shield";
        maxLevel = 1;
        duration = 7;
        localizedName = "Shield";
        owningHeroShortKey = "courier";
    }

    public static CourierShield instance() {
        if( instance == null ){
            instance = new CourierShield();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public String getAbilityType() {
        return abilityType;
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

    public int getDuration() {
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
        if (!(object instanceof CourierShield))
            return false;
        if (object == this)
            return true;
        CourierShield otherObject = (CourierShield) object;
        return otherObject.getKey().equals(getKey());
    }

}
