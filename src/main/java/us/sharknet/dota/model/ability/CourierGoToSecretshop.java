package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class CourierGoToSecretshop extends Ability {

    private static CourierGoToSecretshop instance;

    private final String[] abilityBehavior;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;

    private CourierGoToSecretshop() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        iD = 5492;
        key = "courier_go_to_secretshop";
        maxLevel = 1;
        localizedName = "Go To Secret Shop";
        owningHeroShortKey = "courier";
    }

    public static CourierGoToSecretshop instance() {
        if( instance == null ){
            instance = new CourierGoToSecretshop();
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
        if (!(object instanceof CourierGoToSecretshop))
            return false;
        if (object == this)
            return true;
        CourierGoToSecretshop otherObject = (CourierGoToSecretshop) object;
        return otherObject.getKey().equals(getKey());
    }

}
