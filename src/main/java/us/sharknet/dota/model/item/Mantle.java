package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Mantle extends Item {

    private static Mantle instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int sideShop;
    private final int bonus_intellect;
    private final String localizedName;

    private Mantle() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 15;
        itemAliases = "mantle of intelligence";
        itemCost = 150;
        itemQuality = "component";
        itemShopTags = "int";
        key = "item_mantle";
        sideShop = 1;
        bonus_intellect = 3;
        localizedName = "Mantle Of Intelligence";
    }

    public static Mantle instance() {
        if( instance == null ){
            instance = new Mantle();
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

    public int getSideShop() {
        return sideShop;
    }

    public int getBonusIntellect() {
        return bonus_intellect;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Mantle))
            return false;
        if (object == this)
            return true;
        Mantle otherObject = (Mantle) object;
        return otherObject.getKey().equals(getKey());
    }

}
