package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class SmokeOfDeceit extends Item {

    private static SmokeOfDeceit instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final String effect;
    private final int fightRecapLevel;
    private final int iD;
    private final int itemAlertable;
    private final String itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final int itemDisplayCharges;
    private final int itemInitialCharges;
    private final int itemPermanent;
    private final String itemQuality;
    private final String itemShareability;
    private final String itemShopTags;
    private final int itemStackable;
    private final int itemStockMax;
    private final int itemStockTime;
    private final int itemSupport;
    private final String key;
    private final String model;
    private final int application_radius;
    private final int bonus_movement_speed;
    private final int duration;
    private final String localizedName;
    private final int visibility_radius;

    private SmokeOfDeceit() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCooldown = 9;
        effect = "particles/generic_gameplay/dropped_smoke.vpcf";
        fightRecapLevel = 1;
        iD = 188;
        itemAlertable = 1;
        itemAliases = "smoke of deceit";
        itemCost = 100;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemDisplayCharges = 1;
        itemInitialCharges = 1;
        itemPermanent = 0;
        itemQuality = "consumable";
        itemShareability = "ITEM_FULLY_SHAREABLE";
        itemShopTags = "consumable";
        itemStackable = 1;
        itemStockMax = 3;
        itemStockTime = 72;
        itemSupport = 1;
        key = "item_smoke_of_deceit";
        model = "models/props_gameplay/smoke.vmdl";
        application_radius = 1200;
        bonus_movement_speed = 15;
        duration = 35;
        localizedName = "Smoke Of Deceit";
        visibility_radius = 1025;
    }

    public static SmokeOfDeceit instance() {
        if( instance == null ){
            instance = new SmokeOfDeceit();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public String getEffect() {
        return effect;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
    }

    public int getID() {
        return iD;
    }

    public int getItemAlertable() {
        return itemAlertable;
    }

    public String getItemAliases() {
        return itemAliases;
    }

    public int getItemCost() {
        return itemCost;
    }

    public String[] getItemDeclarations() {
        return itemDeclarations;
    }

    public int getItemDisplayCharges() {
        return itemDisplayCharges;
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

    public String getItemShareability() {
        return itemShareability;
    }

    public String getItemShopTags() {
        return itemShopTags;
    }

    public int getItemStackable() {
        return itemStackable;
    }

    public int getItemStockMax() {
        return itemStockMax;
    }

    public int getItemStockTime() {
        return itemStockTime;
    }

    public int getItemSupport() {
        return itemSupport;
    }

    public String getKey() {
        return key;
    }

    public String getModel() {
        return model;
    }

    public int getApplicationRadius() {
        return application_radius;
    }

    public int getBonusMovementSpeed() {
        return bonus_movement_speed;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getVisibilityRadius() {
        return visibility_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SmokeOfDeceit))
            return false;
        if (object == this)
            return true;
        SmokeOfDeceit otherObject = (SmokeOfDeceit) object;
        return otherObject.getKey().equals(getKey());
    }

}
