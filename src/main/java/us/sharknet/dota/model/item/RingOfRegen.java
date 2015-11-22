package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RingOfRegen extends Item {

    private static RingOfRegen instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShareability;
    private final String itemShopTags;
    private final String key;
    private final int sideShop;
    private final String uIDropSound;
    private final String uIPickupSound;
    private final String worldDropSound;
    private final int bonus_health_regen;
    private final String localizedName;

    private RingOfRegen() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 27;
        itemAliases = "ror";
        itemCost = 35;
        itemQuality = "component";
        itemShareability = "ITEM_PARTIALLY_SHAREABLE";
        itemShopTags = "regen_health";
        key = "item_ring_of_regen";
        sideShop = 1;
        uIDropSound = "Item.DropRingShop";
        uIPickupSound = "Item.PickUpRingShop";
        worldDropSound = "Item.DropRingWorld";
        bonus_health_regen = 2;
        localizedName = "Ring Of Regen";
    }

    public static RingOfRegen instance() {
        if( instance == null ){
            instance = new RingOfRegen();
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

    public String getUIDropSound() {
        return uIDropSound;
    }

    public String getUIPickupSound() {
        return uIPickupSound;
    }

    public String getWorldDropSound() {
        return worldDropSound;
    }

    public int getBonusHealthRegen() {
        return bonus_health_regen;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RingOfRegen))
            return false;
        if (object == this)
            return true;
        RingOfRegen otherObject = (RingOfRegen) object;
        return otherObject.getKey().equals(getKey());
    }

}
