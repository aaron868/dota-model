package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Reaver extends Item {

    private static Reaver instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int secretShop;
    private final int bonus_strength;
    private final String localizedName;

    private Reaver() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 53;
        itemAliases = "reaver";
        itemCost = 3;
        itemQuality = "secret_shop";
        itemShopTags = "str";
        key = "item_reaver";
        secretShop = 1;
        bonus_strength = 25;
        localizedName = "Reaver";
    }

    public static Reaver instance() {
        if( instance == null ){
            instance = new Reaver();
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

    public int getBonusStrength() {
        return bonus_strength;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Reaver))
            return false;
        if (object == this)
            return true;
        Reaver otherObject = (Reaver) object;
        return otherObject.getKey().equals(getKey());
    }

}
