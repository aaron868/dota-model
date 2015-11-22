package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class GreaterCrit extends Item {

    private static GreaterCrit instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_damage;
    private final int crit_chance;
    private final int crit_multiplier;
    private final String localizedName;

    private GreaterCrit() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 141;
        itemAliases = "daedalus";
        itemCost = 552;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "epic";
        itemShopTags = new String[]{"damage","crit"};
        key = "item_greater_crit";
        bonus_damage = 81;
        crit_chance = 25;
        crit_multiplier = 24;
        localizedName = "Daedalus";
    }

    public static GreaterCrit instance() {
        if( instance == null ){
            instance = new GreaterCrit();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getID() {
        return iD;
    }

    public String getItemAliases() {
        return itemAliases;
    }

    public int getItemCost() {
        return itemCost;
    }

    public String[] getItemDeclarations() {
        return itemDeclarations;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public String[] getItemShopTags() {
        return itemShopTags;
    }

    public String getKey() {
        return key;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getCritChance() {
        return crit_chance;
    }

    public int getCritMultiplier() {
        return crit_multiplier;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof GreaterCrit))
            return false;
        if (object == this)
            return true;
        GreaterCrit otherObject = (GreaterCrit) object;
        return otherObject.getKey().equals(getKey());
    }

}
