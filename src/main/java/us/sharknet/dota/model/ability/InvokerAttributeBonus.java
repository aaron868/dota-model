package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class InvokerAttributeBonus extends Ability {

    private static InvokerAttributeBonus instance;

    private final String[] abilityBehavior;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int levelsBetweenUpgrades;
    private final int requiredLevel;
    private final int attribute_bonus_per_level;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private InvokerAttributeBonus() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityType = "DOTA_ABILITY_TYPE_ATTRIBUTES";
        iD = 5690;
        key = "invoker_attribute_bonus";
        levelsBetweenUpgrades = 1;
        requiredLevel = 25;
        attribute_bonus_per_level = 6;
        localizedName = "Invoker Attribute Bonus";
        ownerKey = "npc_dota_hero_invoker";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static InvokerAttributeBonus instance() {
        if( instance == null ){
            instance = new InvokerAttributeBonus();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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

    public int getLevelsBetweenUpgrades() {
        return levelsBetweenUpgrades;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public int getAttributeBonusPerLevel() {
        return attribute_bonus_per_level;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwnerKey() {
        return ownerKey;
    }

    public AbilityOwnerType getOwnerType() {
        return ownerType;
    }

    public boolean isPassive() {
        return passive;
    }

    public boolean isPlaceholder() {
        return placeholder;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof InvokerAttributeBonus))
            return false;
        if (object == this)
            return true;
        InvokerAttributeBonus otherObject = (InvokerAttributeBonus) object;
        return otherObject.getKey().equals(getKey());
    }

}
