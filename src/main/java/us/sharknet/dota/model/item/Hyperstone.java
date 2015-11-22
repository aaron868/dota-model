package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Hyperstone extends Item {

    private static Hyperstone instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int secretShop;
    private final int bonus_attack_speed;
    private final String localizedName;

    private Hyperstone() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 55;
        itemAliases = "hyperstone";
        itemCost = 2;
        itemQuality = "secret_shop";
        itemShopTags = "attack_speed";
        key = "item_hyperstone";
        secretShop = 1;
        bonus_attack_speed = 55;
        localizedName = "Hyperstone";
    }

    public static Hyperstone instance() {
        if( instance == null ){
            instance = new Hyperstone();
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

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Hyperstone))
            return false;
        if (object == this)
            return true;
        Hyperstone otherObject = (Hyperstone) object;
        return otherObject.getKey().equals(getKey());
    }

}
