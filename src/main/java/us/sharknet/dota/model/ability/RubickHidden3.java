package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RubickHidden3 extends Ability {

    private static RubickHidden3 instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;

    private RubickHidden3() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE"};
        iD = 5457;
        key = "rubick_hidden3";
        maxLevel = 0;
        localizedName = "Hidden 3";
        owningHeroShortKey = "rubick";
    }

    public static RubickHidden3 instance() {
        if( instance == null ){
            instance = new RubickHidden3();
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
        if (!(object instanceof RubickHidden3))
            return false;
        if (object == this)
            return true;
        RubickHidden3 otherObject = (RubickHidden3) object;
        return otherObject.getKey().equals(getKey());
    }

}
