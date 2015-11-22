package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AlphaWolfCriticalStrike extends Ability {

    private static AlphaWolfCriticalStrike instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int crit_chance;
    private final int crit_mult;
    private final String localizedName;
    private final String owningHeroShortKey;

    private AlphaWolfCriticalStrike() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5308;
        key = "alpha_wolf_critical_strike";
        maxLevel = 1;
        crit_chance = 20;
        crit_mult = 200;
        localizedName = "Critical Strike";
        owningHeroShortKey = "alpha_wolf";
    }

    public static AlphaWolfCriticalStrike instance() {
        if( instance == null ){
            instance = new AlphaWolfCriticalStrike();
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
        if (!(object instanceof AlphaWolfCriticalStrike))
            return false;
        if (object == this)
            return true;
        AlphaWolfCriticalStrike otherObject = (AlphaWolfCriticalStrike) object;
        return otherObject.getKey().equals(getKey());
    }

}
