package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class GiantWolfCriticalStrike extends Ability {

    private static GiantWolfCriticalStrike instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int crit_chance;
    private final int crit_mult;
    private final String localizedName;
    private final String owningHeroShortKey;

    private GiantWolfCriticalStrike() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 537;
        key = "giant_wolf_critical_strike";
        maxLevel = 1;
        crit_chance = 2;
        crit_mult = 2;
        localizedName = "Critical Strike";
        owningHeroShortKey = "giant_wolf";
    }

    public static GiantWolfCriticalStrike instance() {
        if( instance == null ){
            instance = new GiantWolfCriticalStrike();
        }
        return instance;
    }

    public String getAbilityBehavior() {
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

    public int getCritChance() {
        return crit_chance;
    }

    public int getCritMult() {
        return crit_mult;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof GiantWolfCriticalStrike))
            return false;
        if (object == this)
            return true;
        GiantWolfCriticalStrike otherObject = (GiantWolfCriticalStrike) object;
        return otherObject.getKey().equals(getKey());
    }

}
