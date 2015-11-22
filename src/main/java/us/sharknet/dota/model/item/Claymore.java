package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Claymore extends Item {

    private static Claymore instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int bonus_damage;
    private final String localizedName;

    private Claymore() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5;
        itemAliases = "claymore";
        itemCost = 1400;
        itemQuality = "component";
        itemShopTags = "damage";
        key = "item_claymore";
        bonus_damage = 21;
        localizedName = "Claymore";
    }

    public static Claymore instance() {
        if( instance == null ){
            instance = new Claymore();
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

    public int getBonusDamage() {
        return bonus_damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Claymore))
            return false;
        if (object == this)
            return true;
        Claymore otherObject = (Claymore) object;
        return otherObject.getKey().equals(getKey());
    }

}
