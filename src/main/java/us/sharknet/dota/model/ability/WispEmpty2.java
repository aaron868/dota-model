package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WispEmpty2 extends Ability {

    private static WispEmpty2 instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;

    private WispEmpty2() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE"};
        iD = 5499;
        key = "wisp_empty2";
        maxLevel = 0;
        localizedName = "Empty 2";
        owningHeroShortKey = "wisp";
    }

    public static WispEmpty2 instance() {
        if( instance == null ){
            instance = new WispEmpty2();
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
        if (!(object instanceof WispEmpty2))
            return false;
        if (object == this)
            return true;
        WispEmpty2 otherObject = (WispEmpty2) object;
        return otherObject.getKey().equals(getKey());
    }

}
