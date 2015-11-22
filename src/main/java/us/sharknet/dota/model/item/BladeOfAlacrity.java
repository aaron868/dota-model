package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class BladeOfAlacrity extends Item {

    private static BladeOfAlacrity instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int bonus_agility;
    private final String localizedName;

    private BladeOfAlacrity() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 22;
        itemAliases = "blade of alacrity";
        itemCost = 1000;
        itemQuality = "component";
        itemShopTags = "agi";
        key = "item_blade_of_alacrity";
        bonus_agility = 10;
        localizedName = "Blade Of Alacrity";
    }

    public static BladeOfAlacrity instance() {
        if( instance == null ){
            instance = new BladeOfAlacrity();
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

    public int getBonusAgility() {
        return bonus_agility;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BladeOfAlacrity))
            return false;
        if (object == this)
            return true;
        BladeOfAlacrity otherObject = (BladeOfAlacrity) object;
        return otherObject.getKey().equals(getKey());
    }

}
