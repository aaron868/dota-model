package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class KeeperOfTheLightEmpty2 extends Ability {

    private static KeeperOfTheLightEmpty2 instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;

    private KeeperOfTheLightEmpty2() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE"};
        iD = 552;
        key = "keeper_of_the_light_empty2";
        maxLevel = 0;
        localizedName = "Empty 2";
        owningHeroShortKey = "keeper_of_the_light";
    }

    public static KeeperOfTheLightEmpty2 instance() {
        if( instance == null ){
            instance = new KeeperOfTheLightEmpty2();
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
        if (!(object instanceof KeeperOfTheLightEmpty2))
            return false;
        if (object == this)
            return true;
        KeeperOfTheLightEmpty2 otherObject = (KeeperOfTheLightEmpty2) object;
        return otherObject.getKey().equals(getKey());
    }

}
