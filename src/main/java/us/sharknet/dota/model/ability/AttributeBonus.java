package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AttributeBonus extends Ability {

    private static AttributeBonus instance;

    private final String abilityBehavior;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int attribute_bonus_per_level;
    private final String localizedName;
    private final String owningHeroShortKey;

    private AttributeBonus() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityType = "DOTA_ABILITY_TYPE_ATTRIBUTES";
        iD = 52;
        key = "attribute_bonus";
        attribute_bonus_per_level = 2;
        localizedName = "Stats";
        owningHeroShortKey = "stats";
    }

    public static AttributeBonus instance() {
        if( instance == null ){
            instance = new AttributeBonus();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getAttributeBonusPerLevel() {
        return attribute_bonus_per_level;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AttributeBonus))
            return false;
        if (object == this)
            return true;
        AttributeBonus otherObject = (AttributeBonus) object;
        return otherObject.getKey().equals(getKey());
    }

}
