package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Relic extends Item {

    private static Relic instance;

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

    private Relic() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 54;
        itemAliases = "sacred relic";
        itemCost = 3800;
        itemQuality = "secret_shop";
        itemShopTags = "damage";
        key = "item_relic";
        secretShop = 1;
        bonus_damage = 60;
        localizedName = "Sacred Relic";
    }

    public static Relic instance() {
        if( instance == null ){
            instance = new Relic();
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
        if (!(object instanceof Relic))
            return false;
        if (object == this)
            return true;
        Relic otherObject = (Relic) object;
        return otherObject.getKey().equals(getKey());
    }

}
