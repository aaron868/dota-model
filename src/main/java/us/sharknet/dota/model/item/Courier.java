package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Courier extends Item {

    private static Courier instance;

    private final String abilityBehavior;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String itemDeclarations;
    private final String itemQuality;
    private final String itemShareability;
    private final String itemShopTags;
    private final int itemStockMax;
    private final int itemStockTime;
    private final int itemSupport;
    private final String key;
    private final String localizedName;

    private Courier() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        iD = 45;
        itemAliases = new String[]{"donkey","chicken","animal courier"};
        itemCost = 12;
        itemDeclarations = "DECLARE_PURCHASES_TO_TEAMMATES";
        itemQuality = "consumable";
        itemShareability = "ITEM_FULLY_SHAREABLE";
        itemShopTags = "consumable";
        itemStockMax = 1;
        itemStockTime = 7;
        itemSupport = 1;
        key = "item_courier";
        localizedName = "Animal Courier";
    }

    public static Courier instance() {
        if( instance == null ){
            instance = new Courier();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getID() {
        return iD;
    }

    public String[] getItemAliases() {
        return itemAliases;
    }

    public int getItemCost() {
        return itemCost;
    }

    public String getItemDeclarations() {
        return itemDeclarations;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public String getItemShareability() {
        return itemShareability;
    }

    public String getItemShopTags() {
        return itemShopTags;
    }

    public int getItemStockMax() {
        return itemStockMax;
    }

    public int getItemStockTime() {
        return itemStockTime;
    }

    public int getItemSupport() {
        return itemSupport;
    }

    public String getKey() {
        return key;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Courier))
            return false;
        if (object == this)
            return true;
        Courier otherObject = (Courier) object;
        return otherObject.getKey().equals(getKey());
    }

}
