package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class FaerieFire extends Item {

    private static FaerieFire instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCooldown;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final int itemHideCharges;
    private final int itemInitialCharges;
    private final int itemPermanent;
    private final String itemQuality;
    private final String itemShopTags;
    private final int itemStackable;
    private final String key;
    private final int sideShop;
    private final String uIDropSound;
    private final String uIPickupSound;
    private final String worldDropSound;
    private final int bonus_damage;
    private final int hp_restore;
    private final String localizedName;

    private FaerieFire() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = 0;
        abilityCooldown = 5;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        iD = 237;
        itemAliases = "faerie fire";
        itemCost = 75;
        itemHideCharges = 1;
        itemInitialCharges = 1;
        itemPermanent = 0;
        itemQuality = "component";
        itemShopTags = "armor";
        itemStackable = 0;
        key = "item_faerie_fire";
        sideShop = 0;
        uIDropSound = "Item.DropRingShop";
        uIPickupSound = "Item.PickUpRingShop";
        worldDropSound = "Item.DropRingWorld";
        bonus_damage = 2;
        hp_restore = 75;
        localizedName = "Faerie Fire";
    }

    public static FaerieFire instance() {
        if( instance == null ){
            instance = new FaerieFire();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String getAbilityUnitTargetType() {
        return abilityUnitTargetType;
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

    public int getItemHideCharges() {
        return itemHideCharges;
    }

    public int getItemInitialCharges() {
        return itemInitialCharges;
    }

    public int getItemPermanent() {
        return itemPermanent;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public String getItemShopTags() {
        return itemShopTags;
    }

    public int getItemStackable() {
        return itemStackable;
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

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getHpRestore() {
        return hp_restore;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof FaerieFire))
            return false;
        if (object == this)
            return true;
        FaerieFire otherObject = (FaerieFire) object;
        return otherObject.getKey().equals(getKey());
    }

}
