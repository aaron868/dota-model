package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WispEmpty1 extends Ability {

    private static WispEmpty1 instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;

    private WispEmpty1() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE"};
        iD = 5498;
        key = "wisp_empty1";
        maxLevel = 0;
        localizedName = "Empty 1";
        owningHeroShortKey = "wisp";
    }

    public static WispEmpty1 instance() {
        if( instance == null ){
            instance = new WispEmpty1();
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
        if (!(object instanceof WispEmpty1))
            return false;
        if (object == this)
            return true;
        WispEmpty1 otherObject = (WispEmpty1) object;
        return otherObject.getKey().equals(getKey());
    }

}
