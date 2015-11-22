package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Gloves extends Item {

    private static Gloves instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int sideShop;
    private final int bonus_attack_speed;
    private final String localizedName;

    private Gloves() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 25;
        itemAliases = "gloves of haste";
        itemCost = 500;
        itemQuality = "component";
        itemShopTags = "attack_speed";
        key = "item_gloves";
        sideShop = 1;
        bonus_attack_speed = 20;
        localizedName = "Gloves Of Haste";
    }

    public static Gloves instance() {
        if( instance == null ){
            instance = new Gloves();
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

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Gloves))
            return false;
        if (object == this)
            return true;
        Gloves otherObject = (Gloves) object;
        return otherObject.getKey().equals(getKey());
    }

}
