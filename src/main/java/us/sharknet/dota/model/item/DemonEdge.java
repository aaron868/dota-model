package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class DemonEdge extends Item {

    private static DemonEdge instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int secretShop;
    private final int bonus_damage;
    private final String localizedName;

    private DemonEdge() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 51;
        itemAliases = "demon edge";
        itemCost = 2400;
        itemQuality = "secret_shop";
        itemShopTags = "damage";
        key = "item_demon_edge";
        secretShop = 1;
        bonus_damage = 46;
        localizedName = "Demon Edge";
    }

    public static DemonEdge instance() {
        if( instance == null ){
            instance = new DemonEdge();
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

    public int getBonusDamage() {
        return bonus_damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DemonEdge))
            return false;
        if (object == this)
            return true;
        DemonEdge otherObject = (DemonEdge) object;
        return otherObject.getKey().equals(getKey());
    }

}
