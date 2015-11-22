package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Chainmail extends Item {

    private static Chainmail instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int sideShop;
    private final int bonus_armor;
    private final String localizedName;

    private Chainmail() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 4;
        itemAliases = "chainmail";
        itemCost = 55;
        itemQuality = "component";
        itemShopTags = "armor";
        key = "item_chainmail";
        sideShop = 1;
        bonus_armor = 5;
        localizedName = "Chainmail";
    }

    public static Chainmail instance() {
        if( instance == null ){
            instance = new Chainmail();
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

    public int getBonusArmor() {
        return bonus_armor;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Chainmail))
            return false;
        if (object == this)
            return true;
        Chainmail otherObject = (Chainmail) object;
        return otherObject.getKey().equals(getKey());
    }

}
