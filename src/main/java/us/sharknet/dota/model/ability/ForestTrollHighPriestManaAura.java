package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ForestTrollHighPriestManaAura extends Ability {

    private static ForestTrollHighPriestManaAura instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final int mana_regen;
    private final String owningHeroShortKey;
    private final int radius;

    private ForestTrollHighPriestManaAura() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5491;
        key = "forest_troll_high_priest_mana_aura";
        maxLevel = 1;
        localizedName = "Troll High Priest Mana Aura";
        mana_regen = 2;
        owningHeroShortKey = "forest_troll_high_priest";
        radius = 900;
    }

    public static ForestTrollHighPriestManaAura instance() {
        if( instance == null ){
            instance = new ForestTrollHighPriestManaAura();
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

    public String getLocalizedName() {
        return localizedName;
    }

    public int getManaRegen() {
        return mana_regen;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ForestTrollHighPriestManaAura))
            return false;
        if (object == this)
            return true;
        ForestTrollHighPriestManaAura otherObject = (ForestTrollHighPriestManaAura) object;
        return otherObject.getKey().equals(getKey());
    }

}
