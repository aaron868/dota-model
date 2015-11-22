package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class FlyingCourier extends Item {

    private static FlyingCourier instance;

    private final String abilityBehavior;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String itemDeclarations;
    private final String itemQuality;
    private final String itemShareability;
    private final String itemShopTags;
    private final int itemStockInitial;
    private final int itemStockMax;
    private final int itemStockTime;
    private final int itemSupport;
    private final String key;
    private final String localizedName;

    private FlyingCourier() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 84;
        itemAliases = new String[]{"crow","flying courier"};
        itemCost = 22;
        itemDeclarations = "DECLARE_PURCHASES_TO_TEAMMATES";
        itemQuality = "consumable";
        itemShareability = "ITEM_FULLY_SHAREABLE";
        itemShopTags = "consumable";
        itemStockInitial = 0;
        itemStockMax = 1;
        itemStockTime = 27;
        itemSupport = 1;
        key = "item_flying_courier";
        localizedName = "Flying Courier";
    }

    public static FlyingCourier instance() {
        if( instance == null ){
            instance = new FlyingCourier();
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

    public int getItemStockInitial() {
        return itemStockInitial;
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
        if (!(object instanceof FlyingCourier))
            return false;
        if (object == this)
            return true;
        FlyingCourier otherObject = (FlyingCourier) object;
        return otherObject.getKey().equals(getKey());
    }

}
