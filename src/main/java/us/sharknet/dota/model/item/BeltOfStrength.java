package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class BeltOfStrength extends Item {

    private static BeltOfStrength instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int sideShop;
    private final int bonus_strength;
    private final String localizedName;

    private BeltOfStrength() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 17;
        itemAliases = "belt of strength";
        itemCost = 45;
        itemQuality = "component";
        itemShopTags = "str";
        key = "item_belt_of_strength";
        sideShop = 1;
        bonus_strength = 6;
        localizedName = "Belt Of Strength";
    }

    public static BeltOfStrength instance() {
        if( instance == null ){
            instance = new BeltOfStrength();
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

    public int getBonusStrength() {
        return bonus_strength;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BeltOfStrength))
            return false;
        if (object == this)
            return true;
        BeltOfStrength otherObject = (BeltOfStrength) object;
        return otherObject.getKey().equals(getKey());
    }

}
