package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class MysticStaff extends Item {

    private static MysticStaff instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int secretShop;
    private final int bonus_intellect;
    private final String localizedName;

    private MysticStaff() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 58;
        itemAliases = "mystic staff";
        itemCost = 2700;
        itemQuality = "secret_shop";
        itemShopTags = "int";
        key = "item_mystic_staff";
        secretShop = 1;
        bonus_intellect = 25;
        localizedName = "Mystic Staff";
    }

    public static MysticStaff instance() {
        if( instance == null ){
            instance = new MysticStaff();
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

    public int getBonusIntellect() {
        return bonus_intellect;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MysticStaff))
            return false;
        if (object == this)
            return true;
        MysticStaff otherObject = (MysticStaff) object;
        return otherObject.getKey().equals(getKey());
    }

}
