package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LifeStealerEmpty2 extends Ability {

    private static LifeStealerEmpty2 instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;

    private LifeStealerEmpty2() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_PASSIVE","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE"};
        iD = 5658;
        key = "life_stealer_empty_2";
        maxLevel = 0;
        localizedName = "Empty 2";
        owningHeroShortKey = "life_stealer";
    }

    public static LifeStealerEmpty2 instance() {
        if( instance == null ){
            instance = new LifeStealerEmpty2();
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
        if (!(object instanceof LifeStealerEmpty2))
            return false;
        if (object == this)
            return true;
        LifeStealerEmpty2 otherObject = (LifeStealerEmpty2) object;
        return otherObject.getKey().equals(getKey());
    }

}
