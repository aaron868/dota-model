package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BaneNightmareEnd extends Ability {

    private static BaneNightmareEnd instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;

    private BaneNightmareEnd() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_TOGGLE","DOTA_ABILITY_BEHAVIOR_IGNORE_PSEUDO_QUEUE"};
        iD = 5523;
        key = "bane_nightmare_end";
        maxLevel = 1;
        localizedName = "Nightmare End";
        owningHeroShortKey = "bane";
    }

    public static BaneNightmareEnd instance() {
        if( instance == null ){
            instance = new BaneNightmareEnd();
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
        if (!(object instanceof BaneNightmareEnd))
            return false;
        if (object == this)
            return true;
        BaneNightmareEnd otherObject = (BaneNightmareEnd) object;
        return otherObject.getKey().equals(getKey());
    }

}
