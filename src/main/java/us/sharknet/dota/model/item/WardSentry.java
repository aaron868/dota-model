package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class WardSentry extends Item {

    private static WardSentry instance;

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
    private final int itemSupport;
    private final String key;
    private final String model;
    private final int duration_minutes_tooltip;
    private final int health;
    private final int lifetime;
    private final String localizedName;
    private final int true_sight_range;
    private final int vision_range;

    private WardSentry() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_OPTIONAL_UNIT_TARGET"};
        abilityCastPoint = 0;
        abilityCastRange = 500;
        abilityCooldown = 1;
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_NOT_CREEP_HERO";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        iD = 43;
        itemAliases = "sentry ward";
        itemCost = 200;
        itemDeclarations = "DECLARE_PURCHASES_TO_TEAMMATES";
        itemInitialCharges = 2;
        itemPermanent = 0;
        itemQuality = "consumable";
        itemShareability = "ITEM_FULLY_SHAREABLE_STACKING";
        itemShopTags = "consumable";
        itemStackable = 1;
        itemSupport = 1;
        key = "item_ward_sentry";
        model = "models/props_gameplay/sentry_ward_bundle.vmdl";
        duration_minutes_tooltip = 4;
        health = 200;
        lifetime = 240;
        localizedName = "Sentry Ward";
        true_sight_range = 850;
        vision_range = 0;
    }

    public static WardSentry instance() {
        if( instance == null ){
            instance = new WardSentry();
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

    public int getTrueSightRange() {
        return true_sight_range;
    }

    public int getVisionRange() {
        return vision_range;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WardSentry))
            return false;
        if (object == this)
            return true;
        WardSentry otherObject = (WardSentry) object;
        return otherObject.getKey().equals(getKey());
    }

}
