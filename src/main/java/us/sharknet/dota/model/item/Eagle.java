package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Eagle extends Item {

    private static Eagle instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int secretShop;
    private final int bonus_agility;
    private final String localizedName;

    private Eagle() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 52;
        itemAliases = "eaglesong";
        itemCost = 32;
        itemQuality = "secret_shop";
        itemShopTags = "agi";
        key = "item_eagle";
        secretShop = 1;
        bonus_agility = 25;
        localizedName = "Eaglesong";
    }

    public static Eagle instance() {
        if( instance == null ){
            instance = new Eagle();
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

    public String getItemQuality() {
        return itemQuality;
    }

    public String getItemShopTags() {
        return itemShopTags;
    }

    public String getKey() {
        return key;
    }

    public int getSecretShop() {
        return secretShop;
    }

    public int getBonusAgility() {
        return bonus_agility;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Eagle))
            return false;
        if (object == this)
            return true;
        Eagle otherObject = (Eagle) object;
        return otherObject.getKey().equals(getKey());
    }

}
