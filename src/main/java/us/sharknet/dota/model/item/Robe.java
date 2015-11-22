package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Robe extends Item {

    private static Robe instance;

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

    private Robe() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 19;
        itemAliases = "robe of the magi";
        itemCost = 450;
        itemQuality = "component";
        itemShopTags = "int";
        key = "item_robe";
        sideShop = 1;
        bonus_intellect = 6;
        localizedName = "Robe Of The Magi";
    }

    public static Robe instance() {
        if( instance == null ){
            instance = new Robe();
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
        if (!(object instanceof Robe))
            return false;
        if (object == this)
            return true;
        Robe otherObject = (Robe) object;
        return otherObject.getKey().equals(getKey());
    }

}
