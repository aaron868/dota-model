package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class BootsOfElves extends Item {

    private static BootsOfElves instance;

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

    private BootsOfElves() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 18;
        itemAliases = "band of elvenskin";
        itemCost = 450;
        itemQuality = "component";
        itemShopTags = "agi";
        key = "item_boots_of_elves";
        sideShop = 1;
        bonus_agility = 6;
        localizedName = "Band Of Elvenskin";
    }

    public static BootsOfElves instance() {
        if( instance == null ){
            instance = new BootsOfElves();
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
        if (!(object instanceof BootsOfElves))
            return false;
        if (object == this)
            return true;
        BootsOfElves otherObject = (BootsOfElves) object;
        return otherObject.getKey().equals(getKey());
    }

}
