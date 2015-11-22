package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Gauntlets extends Item {

    private static Gauntlets instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int bonus_strength;
    private final String localizedName;

    private Gauntlets() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 13;
        itemAliases = "gauntlets of strength";
        itemCost = 150;
        itemQuality = "component";
        itemShopTags = "str";
        key = "item_gauntlets";
        bonus_strength = 3;
        localizedName = "Gauntlets Of Strength";
    }

    public static Gauntlets instance() {
        if( instance == null ){
            instance = new Gauntlets();
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

    public int getBonusStrength() {
        return bonus_strength;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Gauntlets))
            return false;
        if (object == this)
            return true;
        Gauntlets otherObject = (Gauntlets) object;
        return otherObject.getKey().equals(getKey());
    }

}
