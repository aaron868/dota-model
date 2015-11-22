package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Broadsword extends Item {

    private static Broadsword instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int sideShop;
    private final int bonus_damage;
    private final String localizedName;

    private Broadsword() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 3;
        itemAliases = "broadsword";
        itemCost = 12;
        itemQuality = "component";
        itemShopTags = "damage";
        key = "item_broadsword";
        sideShop = 1;
        bonus_damage = 18;
        localizedName = "Broadsword";
    }

    public static Broadsword instance() {
        if( instance == null ){
            instance = new Broadsword();
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

    public int getBonusDamage() {
        return bonus_damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Broadsword))
            return false;
        if (object == this)
            return true;
        Broadsword otherObject = (Broadsword) object;
        return otherObject.getKey().equals(getKey());
    }

}
