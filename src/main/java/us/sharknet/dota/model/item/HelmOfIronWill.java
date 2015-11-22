package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class HelmOfIronWill extends Item {

    private static HelmOfIronWill instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int sideShop;
    private final int bonus_armor;
    private final int bonus_regen;
    private final String localizedName;

    private HelmOfIronWill() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 6;
        itemAliases = "helm of iron will";
        itemCost = 9;
        itemQuality = "component";
        itemShopTags = new String[]{"armor","regen_health"};
        key = "item_helm_of_iron_will";
        sideShop = 1;
        bonus_armor = 5;
        bonus_regen = 3;
        localizedName = "Helm Of Iron Will";
    }

    public static HelmOfIronWill instance() {
        if( instance == null ){
            instance = new HelmOfIronWill();
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

    public int getSideShop() {
        return sideShop;
    }

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getBonusRegen() {
        return bonus_regen;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof HelmOfIronWill))
            return false;
        if (object == this)
            return true;
        HelmOfIronWill otherObject = (HelmOfIronWill) object;
        return otherObject.getKey().equals(getKey());
    }

}
