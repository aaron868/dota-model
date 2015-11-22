package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RubickEmpty1 extends Ability {

    private static RubickEmpty1 instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;

    private RubickEmpty1() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE"};
        iD = 5453;
        key = "rubick_empty1";
        maxLevel = 0;
        localizedName = "Empty 1";
        owningHeroShortKey = "rubick";
    }

    public static RubickEmpty1 instance() {
        if( instance == null ){
            instance = new RubickEmpty1();
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
        if (!(object instanceof RubickEmpty1))
            return false;
        if (object == this)
            return true;
        RubickEmpty1 otherObject = (RubickEmpty1) object;
        return otherObject.getKey().equals(getKey());
    }

}
