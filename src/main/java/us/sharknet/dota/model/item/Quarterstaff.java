package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Quarterstaff extends Item {

    private static Quarterstaff instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int sideShop;
    private final int bonus_damage;
    private final int bonus_speed;
    private final String localizedName;

    private Quarterstaff() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 10;
        itemAliases = "quarterstaff";
        itemCost = 875;
        itemQuality = "component";
        itemShopTags = new String[]{"damage","attack_speed"};
        key = "item_quarterstaff";
        sideShop = 1;
        bonus_damage = 10;
        bonus_speed = 10;
        localizedName = "Quarterstaff";
    }

    public static Quarterstaff instance() {
        if( instance == null ){
            instance = new Quarterstaff();
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

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusSpeed() {
        return bonus_speed;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Quarterstaff))
            return false;
        if (object == this)
            return true;
        Quarterstaff otherObject = (Quarterstaff) object;
        return otherObject.getKey().equals(getKey());
    }

}
