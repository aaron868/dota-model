package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RubickHidden2 extends Ability {

    private static RubickHidden2 instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;

    private RubickHidden2() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE"};
        iD = 5456;
        key = "rubick_hidden2";
        maxLevel = 0;
        localizedName = "Hidden 2";
        owningHeroShortKey = "rubick";
    }

    public static RubickHidden2 instance() {
        if( instance == null ){
            instance = new RubickHidden2();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
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
        if (!(object instanceof RubickHidden2))
            return false;
        if (object == this)
            return true;
        RubickHidden2 otherObject = (RubickHidden2) object;
        return otherObject.getKey().equals(getKey());
    }

}
