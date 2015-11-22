package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Gem extends Item {

    private static Gem instance;

    private final String abilityBehavior;
    private final String effect;
    private final int iD;
    private final String itemAliases;
    private final int itemContributesToNetWorthWhenDropped;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final int itemKillable;
    private final String itemQuality;
    private final int itemSellable;
    private final String itemShareability;
    private final String itemShopTags;
    private final int itemStockMax;
    private final int itemStockTime;
    private final int itemSupport;
    private final String key;
    private final String model;
    private final String uIDropSound;
    private final String uIPickupSound;
    private final String worldDropSound;
    private final String localizedName;
    private final int radius;

    private Gem() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        effect = "particles/generic_gameplay/dropped_gem.vpcf";
        iD = 30;
        itemAliases = "gem of true sight";
        itemContributesToNetWorthWhenDropped = 0;
        itemCost = 900;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemKillable = 0;
        itemQuality = "component";
        itemSellable = 0;
        itemShareability = "ITEM_FULLY_SHAREABLE";
        itemShopTags = "see_invis";
        itemStockMax = 1;
        itemStockTime = 6;
        itemSupport = 1;
        key = "item_gem";
        model = "models/props_gameplay/gem01.vmdl";
        uIDropSound = "Item.DropGemShop";
        uIPickupSound = "Item.PickUpGemShop";
        worldDropSound = "Item.DropGemWorld";
        localizedName = "Gem Of True Sight";
        radius = 1100;
    }

    public static Gem instance() {
        if( instance == null ){
            instance = new Gem();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public String getEffect() {
        return effect;
    }

    public int getID() {
        return iD;
    }

    public String getItemAliases() {
        return itemAliases;
    }

    public int getItemContributesToNetWorthWhenDropped() {
        return itemContributesToNetWorthWhenDropped;
    }

    public int getItemCost() {
        return itemCost;
    }

    public String[] getItemDeclarations() {
        return itemDeclarations;
    }

    public int getItemKillable() {
        return itemKillable;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public int getItemSellable() {
        return itemSellable;
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

    public String getModel() {
        return model;
    }

    public String getUIDropSound() {
        return uIDropSound;
    }

    public String getUIPickupSound() {
        return uIPickupSound;
    }

    public String getWorldDropSound() {
        return worldDropSound;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Gem))
            return false;
        if (object == this)
            return true;
        Gem otherObject = (Gem) object;
        return otherObject.getKey().equals(getKey());
    }

}
