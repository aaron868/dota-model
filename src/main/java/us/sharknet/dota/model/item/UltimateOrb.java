package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class UltimateOrb extends Item {

    private static UltimateOrb instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int secretShop;
    private final int bonus_all_stats;
    private final String localizedName;

    private UltimateOrb() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 24;
        itemAliases = "ultimate orb";
        itemCost = 2100;
        itemQuality = "secret_shop";
        itemShopTags = new String[]{"agi","int","str"};
        key = "item_ultimate_orb";
        secretShop = 1;
        bonus_all_stats = 10;
        localizedName = "Ultimate Orb";
    }

    public static UltimateOrb instance() {
        if( instance == null ){
            instance = new UltimateOrb();
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

    public int getBonusAllStats() {
        return bonus_all_stats;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof UltimateOrb))
            return false;
        if (object == this)
            return true;
        UltimateOrb otherObject = (UltimateOrb) object;
        return otherObject.getKey().equals(getKey());
    }

}
