package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class WardSlot extends Item {

    private static WardSlot instance;

    private final String[] abilityBehavior;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final int cost;
    private final boolean disassemblable;
    private final boolean purchasable;
    private final String key;
    private final int bonus_health;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int creation_delay;
    private final int initialCharges;
    private final int lifetime_observer;
    private final int lifetime_sentry;
    private final String localizedName;
    private final int maxCharges;
    private final int observer_cost;
    private final int observer_duration_minutes_tooltip;
    private final int observer_vision_range_tooltip;
    private final String[] partOf;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int quantity;
    private final boolean recipe;
    private final int sentry_cost;
    private final int sentry_duration_minutes_tooltip;
    private final Shareablilty shareability;
    private final int true_sight_range;
    private final Vendor[] vendorLocations;

    private WardSlot() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_OPTIONAL_UNIT_TARGET"};
        abilityCastRange = 500;
        abilityCooldown = 0;
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_NOT_CREEP_HERO";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        iD = 218;
        cost = 275;
        disassemblable = false;
        purchasable = false;
        key = "item_ward_dispenser";
        bonus_health = 100;
        chargeable = false;
        components = new String[0];
        consumable = false;
        creation_delay = 0;
        initialCharges = 0;
        lifetime_observer = 420;
        lifetime_sentry = 240;
        localizedName = "Ward Slot";
        maxCharges = 0;
        observer_cost = 75;
        observer_duration_minutes_tooltip = 7;
        observer_vision_range_tooltip = 1600;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = true;
        quantity = 1;
        recipe = false;
        sentry_cost = 100;
        sentry_duration_minutes_tooltip = 4;
        shareability = Shareablilty.NOT_SHAREABLE;
        true_sight_range = 850;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static WardSlot instance() {
        if( instance == null ){
            instance = new WardSlot();
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

    public int getCost() {
        return cost;
    }

    public boolean isDisassemblable() {
        return disassemblable;
    }

    public boolean isPurchasable() {
        return purchasable;
    }

    public String getKey() {
        return key;
    }

    public int getBonusHealth() {
        return bonus_health;
    }

    public boolean isChargeable() {
        return chargeable;
    }

    public String[] getComponents() {
        return components;
    }

    public boolean isConsumable() {
        return consumable;
    }

    public int getCreationDelay() {
        return creation_delay;
    }

    public int getInitialCharges() {
        return initialCharges;
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

    public int getMaxCharges() {
        return maxCharges;
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

    public String[] getPartOf() {
        return partOf;
    }

    public boolean isPlaceable() {
        return placeable;
    }

    public int getPlaceableDuration() {
        return placeableDuration;
    }

    public boolean isPlaceholder() {
        return placeholder;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isRecipe() {
        return recipe;
    }

    public int getSentryCost() {
        return sentry_cost;
    }

    public int getSentryDurationMinutesTooltip() {
        return sentry_duration_minutes_tooltip;
    }

    public Shareablilty getShareability() {
        return shareability;
    }

    public int getTrueSightRange() {
        return true_sight_range;
    }

    public Vendor[] getVendorLocations() {
        return vendorLocations;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WardSlot))
            return false;
        if (object == this)
            return true;
        WardSlot otherObject = (WardSlot) object;
        return otherObject.getKey().equals(getKey());
    }

}
