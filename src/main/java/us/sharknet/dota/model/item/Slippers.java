package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Slippers extends Item {

    private static Slippers instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int sideShop;
    private final int bonus_agility;
    private final String localizedName;

    private Slippers() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 14;
        itemAliases = "slippers of agility";
        itemCost = 15;
        itemQuality = "component";
        itemShopTags = "agi";
        key = "item_slippers";
        sideShop = 1;
        bonus_agility = 3;
        localizedName = "Slippers Of Agility";
    }

    public static Slippers instance() {
        if( instance == null ){
            instance = new Slippers();
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

    public int getBonusAgility() {
        return bonus_agility;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Slippers))
            return false;
        if (object == this)
            return true;
        Slippers otherObject = (Slippers) object;
        return otherObject.getKey().equals(getKey());
    }

}
