package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class WardObserver extends Item {

    private static WardObserver instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemDeclarations;
    private final int itemInitialCharges;
    private final int itemPermanent;
    private final String itemQuality;
    private final String itemShareability;
    private final String itemShopTags;
    private final int itemStackable;
    private final int itemStockInitial;
    private final int itemStockMax;
    private final int itemStockTime;
    private final int itemSupport;
    private final String key;
    private final String model;
    private final int duration_minutes_tooltip;
    private final int health;
    private final int lifetime;
    private final String localizedName;
    private final int vision_range;

    private WardObserver() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_OPTIONAL_UNIT_TARGET"};
        abilityCastPoint = 0;
        abilityCastRange = 500;
        abilityCooldown = 1;
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_NOT_CREEP_HERO";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        iD = 42;
        itemAliases = "observer ward";
        itemCost = 75;
        itemDeclarations = "DECLARE_PURCHASES_TO_TEAMMATES";
        itemInitialCharges = 1;
        itemPermanent = 0;
        itemQuality = "consumable";
        itemShareability = "ITEM_FULLY_SHAREABLE_STACKING";
        itemShopTags = "consumable";
        itemStackable = 1;
        itemStockInitial = 2;
        itemStockMax = 4;
        itemStockTime = 18;
        itemSupport = 1;
        key = "item_ward_observer";
        model = "models/props_gameplay/observer_ward_bundle.vmdl";
        duration_minutes_tooltip = 7;
        health = 200;
        lifetime = 420;
        localizedName = "Observer Ward";
        vision_range = 1600;
    }

    public static WardObserver instance() {
        if( instance == null ){
            instance = new WardObserver();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public String getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public String getItemDeclarations() {
        return itemDeclarations;
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

    public int getItemStockInitial() {
        return itemStockInitial;
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

    public int getDurationMinutesTooltip() {
        return duration_minutes_tooltip;
    }

    public int getHealth() {
        return health;
    }

    public int getLifetime() {
        return lifetime;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getVisionRange() {
        return vision_range;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WardObserver))
            return false;
        if (object == this)
            return true;
        WardObserver otherObject = (WardObserver) object;
        return otherObject.getKey().equals(getKey());
    }

}
