package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RingOfProtection extends Item {

    private static RingOfProtection instance;

    private final String abilityBehavior;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int sideShop;
    private final String uIDropSound;
    private final String uIPickupSound;
    private final String worldDropSound;
    private final int bonus_armor;
    private final String localizedName;

    private RingOfProtection() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 12;
        itemAliases = new String[]{"rop","ring of protection"};
        itemCost = 175;
        itemQuality = "component";
        itemShopTags = "armor";
        key = "item_ring_of_protection";
        sideShop = 0;
        uIDropSound = "Item.DropRingShop";
        uIPickupSound = "Item.PickUpRingShop";
        worldDropSound = "Item.DropRingWorld";
        bonus_armor = 2;
        localizedName = "Ring Of Protection";
    }

    public static RingOfProtection instance() {
        if( instance == null ){
            instance = new RingOfProtection();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getID() {
        return iD;
    }

    public String[] getItemAliases() {
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

    public String getUIDropSound() {
        return uIDropSound;
    }

    public String getUIPickupSound() {
        return uIPickupSound;
    }

    public String getWorldDropSound() {
        return worldDropSound;
    }

    public int getBonusArmor() {
        return bonus_armor;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RingOfProtection))
            return false;
        if (object == this)
            return true;
        RingOfProtection otherObject = (RingOfProtection) object;
        return otherObject.getKey().equals(getKey());
    }

}
