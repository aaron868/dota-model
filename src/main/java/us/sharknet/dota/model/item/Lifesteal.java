package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Lifesteal extends Item {

    private static Lifesteal instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int sideShop;
    private final int lifesteal_percent;
    private final String localizedName;

    private Lifesteal() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 26;
        itemAliases = "morbid mask";
        itemCost = 900;
        itemQuality = "component";
        itemShopTags = "unique";
        key = "item_lifesteal";
        sideShop = 1;
        lifesteal_percent = 15;
        localizedName = "Morbid Mask";
    }

    public static Lifesteal instance() {
        if( instance == null ){
            instance = new Lifesteal();
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

    public int getLifestealPercent() {
        return lifesteal_percent;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Lifesteal))
            return false;
        if (object == this)
            return true;
        Lifesteal otherObject = (Lifesteal) object;
        return otherObject.getKey().equals(getKey());
    }

}
