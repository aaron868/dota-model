package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class VitalityBooster extends Item {

    private static VitalityBooster instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int secretShop;
    private final int bonus_health;
    private final String localizedName;

    private VitalityBooster() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 61;
        itemAliases = "vitality booster";
        itemCost = 1100;
        itemQuality = "secret_shop";
        itemShopTags = "health_pool";
        key = "item_vitality_booster";
        secretShop = 1;
        bonus_health = 250;
        localizedName = "Vitality Booster";
    }

    public static VitalityBooster instance() {
        if( instance == null ){
            instance = new VitalityBooster();
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

    public int getBonusHealth() {
        return bonus_health;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof VitalityBooster))
            return false;
        if (object == this)
            return true;
        VitalityBooster otherObject = (VitalityBooster) object;
        return otherObject.getKey().equals(getKey());
    }

}
