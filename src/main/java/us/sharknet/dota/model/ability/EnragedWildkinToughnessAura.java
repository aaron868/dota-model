package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EnragedWildkinToughnessAura extends Ability {

    private static EnragedWildkinToughnessAura instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int bonus_armor;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;

    private EnragedWildkinToughnessAura() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5313;
        key = "enraged_wildkin_toughness_aura";
        maxLevel = 1;
        bonus_armor = 3;
        localizedName = "Toughness Aura";
        owningHeroShortKey = "enraged_wildkin";
        radius = 9;
    }

    public static EnragedWildkinToughnessAura instance() {
        if( instance == null ){
            instance = new EnragedWildkinToughnessAura();
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
        if (!(object instanceof EnragedWildkinToughnessAura))
            return false;
        if (object == this)
            return true;
        EnragedWildkinToughnessAura otherObject = (EnragedWildkinToughnessAura) object;
        return otherObject.getKey().equals(getKey());
    }

}
