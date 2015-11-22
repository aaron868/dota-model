package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class EnergyBooster extends Item {

    private static EnergyBooster instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int secretShop;
    private final int sideShop;
    private final int bonus_mana;
    private final String localizedName;

    private EnergyBooster() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 59;
        itemAliases = "energy booster";
        itemCost = 9;
        itemQuality = "secret_shop";
        itemShopTags = "mana_pool";
        key = "item_energy_booster";
        secretShop = 1;
        sideShop = 1;
        bonus_mana = 25;
        localizedName = "Energy Booster";
    }

    public static EnergyBooster instance() {
        if( instance == null ){
            instance = new EnergyBooster();
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

    public int getSideShop() {
        return sideShop;
    }

    public int getBonusMana() {
        return bonus_mana;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EnergyBooster))
            return false;
        if (object == this)
            return true;
        EnergyBooster otherObject = (EnergyBooster) object;
        return otherObject.getKey().equals(getKey());
    }

}
