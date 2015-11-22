package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class TalismanOfEvasion extends Item {

    private static TalismanOfEvasion instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int secretShop;
    private final int bonus_evasion;
    private final String localizedName;

    private TalismanOfEvasion() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 32;
        itemAliases = "talisman of evasion";
        itemCost = 18;
        itemQuality = "secret_shop";
        itemShopTags = "evasion";
        key = "item_talisman_of_evasion";
        secretShop = 1;
        bonus_evasion = 25;
        localizedName = "Talisman Of Evasion";
    }

    public static TalismanOfEvasion instance() {
        if( instance == null ){
            instance = new TalismanOfEvasion();
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

    public int getBonusEvasion() {
        return bonus_evasion;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TalismanOfEvasion))
            return false;
        if (object == this)
            return true;
        TalismanOfEvasion otherObject = (TalismanOfEvasion) object;
        return otherObject.getKey().equals(getKey());
    }

}
