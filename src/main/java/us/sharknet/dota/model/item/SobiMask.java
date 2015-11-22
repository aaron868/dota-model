package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class SobiMask extends Item {

    private static SobiMask instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShareability;
    private final String itemShopTags;
    private final String key;
    private final int sideShop;
    private final int bonus_mana_regen;
    private final String localizedName;

    private SobiMask() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 28;
        itemAliases = "sage's mask";
        itemCost = 325;
        itemQuality = "component";
        itemShareability = "ITEM_PARTIALLY_SHAREABLE";
        itemShopTags = "regen_mana";
        key = "item_sobi_mask";
        sideShop = 1;
        bonus_mana_regen = 50;
        localizedName = "Sage's Mask";
    }

    public static SobiMask instance() {
        if( instance == null ){
            instance = new SobiMask();
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

    public String getItemShareability() {
        return itemShareability;
    }

    public String getItemShopTags() {
        return itemShopTags;
    }

    public String getKey() {
        return key;
    }

    public int getSideShop() {
        return sideShop;
    }

    public int getBonusManaRegen() {
        return bonus_mana_regen;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SobiMask))
            return false;
        if (object == this)
            return true;
        SobiMask otherObject = (SobiMask) object;
        return otherObject.getKey().equals(getKey());
    }

}
