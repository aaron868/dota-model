package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Platemail extends Item {

    private static Platemail instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int secretShop;
    private final int bonus_armor;
    private final String localizedName;

    private Platemail() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 9;
        itemAliases = "platemail";
        itemCost = 14;
        itemQuality = "secret_shop";
        itemShopTags = "armor";
        key = "item_platemail";
        secretShop = 1;
        bonus_armor = 1;
        localizedName = "Platemail";
    }

    public static Platemail instance() {
        if( instance == null ){
            instance = new Platemail();
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

    public int getBonusArmor() {
        return bonus_armor;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Platemail))
            return false;
        if (object == this)
            return true;
        Platemail otherObject = (Platemail) object;
        return otherObject.getKey().equals(getKey());
    }

}
