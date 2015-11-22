package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BlueDragonspawnOverseerDevotionAura extends Ability {

    private static BlueDragonspawnOverseerDevotionAura instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int bonus_armor;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;

    private BlueDragonspawnOverseerDevotionAura() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5327;
        key = "blue_dragonspawn_overseer_devotion_aura";
        maxLevel = 1;
        bonus_armor = 3;
        localizedName = "Devotion Aura";
        owningHeroShortKey = "blue_dragonspawn";
        radius = 900;
    }

    public static BlueDragonspawnOverseerDevotionAura instance() {
        if( instance == null ){
            instance = new BlueDragonspawnOverseerDevotionAura();
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

    public int getBonusArmor() {
        return bonus_armor;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BlueDragonspawnOverseerDevotionAura))
            return false;
        if (object == this)
            return true;
        BlueDragonspawnOverseerDevotionAura otherObject = (BlueDragonspawnOverseerDevotionAura) object;
        return otherObject.getKey().equals(getKey());
    }

}
