package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class WardDispenser extends Item {

    private static WardDispenser instance;

    private final String[] abilityBehavior;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemDeclarations;
    private final String itemDisassembleRule;
    private final int itemPurchasable;
    private final String itemQuality;
    private final String itemShareability;
    private final String key;
    private final int bonus_health;
    private final double creation_delay;
    private final int lifetime_observer;
    private final int lifetime_sentry;
    private final String localizedName;
    private final int observer_cost;
    private final int observer_duration_minutes_tooltip;
    private final int observer_vision_range_tooltip;
    private final int sentry_cost;
    private final int sentry_duration_minutes_tooltip;
    private final int true_sight_range;

    private WardDispenser() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_OPTIONAL_UNIT_TARGET"};
        abilityCastRange = 5;
        abilityCooldown = 0;
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_NOT_CREEP_HERO";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        iD = 218;
        itemAliases = "ward";
        itemCost = 275;
        itemDeclarations = "DECLARE_PURCHASES_TO_SPECTATORS";
        itemDisassembleRule = "DOTA_ITEM_DISASSEMBLE_NEVER";
        itemPurchasable = 0;
        itemQuality = "common";
        itemShareability = "ITEM_FULLY_SHAREABLE_STACKING";
        key = "item_ward_dispenser";
        bonus_health = 1;
        creation_delay = 0.0;
        lifetime_observer = 42;
        lifetime_sentry = 24;
        localizedName = "Ward Slot";
        observer_cost = 75;
        observer_duration_minutes_tooltip = 7;
        observer_vision_range_tooltip = 16;
        sentry_cost = 1;
        sentry_duration_minutes_tooltip = 4;
        true_sight_range = 85;
    }

    public static WardDispenser instance() {
        if( instance == null ){
            instance = new WardDispenser();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
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

    public String getItemDisassembleRule() {
        return itemDisassembleRule;
    }

    public int getItemPurchasable() {
        return itemPurchasable;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public String getItemShareability() {
        return itemShareability;
    }

    public String getKey() {
        return key;
    }

    public int getBonusHealth() {
        return bonus_health;
    }

    public double getCreationDelay() {
        return creation_delay;
    }

    public int getLifetimeObserver() {
        return lifetime_observer;
    }

    public int getLifetimeSentry() {
        return lifetime_sentry;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getObserverCost() {
        return observer_cost;
    }

    public int getObserverDurationMinutesTooltip() {
        return observer_duration_minutes_tooltip;
    }

    public int getObserverVisionRangeTooltip() {
        return observer_vision_range_tooltip;
    }

    public int getSentryCost() {
        return sentry_cost;
    }

    public int getSentryDurationMinutesTooltip() {
        return sentry_duration_minutes_tooltip;
    }

    public int getTrueSightRange() {
        return true_sight_range;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WardDispenser))
            return false;
        if (object == this)
            return true;
        WardDispenser otherObject = (WardDispenser) object;
        return otherObject.getKey().equals(getKey());
    }

}
