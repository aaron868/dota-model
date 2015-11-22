package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LifeStealerEmpty3 extends Ability {

    private static LifeStealerEmpty3 instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;

    private LifeStealerEmpty3() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_PASSIVE","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE"};
        iD = 5659;
        key = "life_stealer_empty_3";
        maxLevel = 0;
        localizedName = "Empty 3";
        owningHeroShortKey = "life_stealer";
    }

    public static LifeStealerEmpty3 instance() {
        if( instance == null ){
            instance = new LifeStealerEmpty3();
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
        if (!(object instanceof LifeStealerEmpty3))
            return false;
        if (object == this)
            return true;
        LifeStealerEmpty3 otherObject = (LifeStealerEmpty3) object;
        return otherObject.getKey().equals(getKey());
    }

}
