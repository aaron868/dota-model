package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class CourierReturnToBase extends Ability {

    private static CourierReturnToBase instance;

    private final String[] abilityBehavior;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;

    private CourierReturnToBase() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        iD = 5205;
        key = "courier_return_to_base";
        maxLevel = 1;
        localizedName = "Return To Base";
        owningHeroShortKey = "courier";
    }

    public static CourierReturnToBase instance() {
        if( instance == null ){
            instance = new CourierReturnToBase();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
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

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof CourierReturnToBase))
            return false;
        if (object == this)
            return true;
        CourierReturnToBase otherObject = (CourierReturnToBase) object;
        return otherObject.getKey().equals(getKey());
    }

}
