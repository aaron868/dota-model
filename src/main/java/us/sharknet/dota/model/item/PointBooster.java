package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class PointBooster extends Item {

    private static PointBooster instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int secretShop;
    private final int bonus_health;
    private final int bonus_mana;
    private final String localizedName;

    private PointBooster() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 6;
        itemAliases = "point booster";
        itemCost = 12;
        itemQuality = "secret_shop";
        itemShopTags = new String[]{"mana_pool","health_pool"};
        key = "item_point_booster";
        secretShop = 1;
        bonus_health = 2;
        bonus_mana = 15;
        localizedName = "Point Booster";
    }

    public static PointBooster instance() {
        if( instance == null ){
            instance = new PointBooster();
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

    public String[] getItemShopTags() {
        return itemShopTags;
    }

    public String getKey() {
        return key;
    }

    public int getSecretShop() {
        return secretShop;
    }

    public int getBonusHealth() {
        return bonus_health;
    }

    public int getBonusMana() {
        return bonus_mana;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PointBooster))
            return false;
        if (object == this)
            return true;
        PointBooster otherObject = (PointBooster) object;
        return otherObject.getKey().equals(getKey());
    }

}
