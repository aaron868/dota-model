package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Cloak extends Item {

    private static Cloak instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int sideShop;
    private final int bonus_magical_armor;
    private final String localizedName;
    private final int tooltip_resist;

    private Cloak() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 31;
        itemAliases = "cloak";
        itemCost = 55;
        itemQuality = "component";
        itemShopTags = "magic_resist";
        key = "item_cloak";
        sideShop = 1;
        bonus_magical_armor = 2;
        localizedName = "Cloak";
        tooltip_resist = 2;
    }

    public static Cloak instance() {
        if( instance == null ){
            instance = new Cloak();
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

    public int getSideShop() {
        return sideShop;
    }

    public int getBonusMagicalArmor() {
        return bonus_magical_armor;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getTooltipResist() {
        return tooltip_resist;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Cloak))
            return false;
        if (object == this)
            return true;
        Cloak otherObject = (Cloak) object;
        return otherObject.getKey().equals(getKey());
    }

}
