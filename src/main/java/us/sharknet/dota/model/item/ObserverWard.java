package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class ObserverWard extends Item {

    private static ObserverWard instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final int cost;
    private final boolean stackable;
    private final String key;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int duration_minutes_tooltip;
    private final int health;
    private final int initialCharges;
    private final int lifetime;
    private final String localizedName;
    private final int maxCharges;
    private final String[] partOf;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int quantity;
    private final boolean recipe;
    private final Shareablilty shareability;
    private final Vendor[] vendorLocations;
    private final int vision_range;

    private ObserverWard() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_OPTIONAL_UNIT_TARGET"};
        abilityCastPoint = 0;
        abilityCastRange = 500;
        abilityCooldown = 1;
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_NOT_CREEP_HERO";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        iD = 42;
        cost = 75;
        stackable = true;
        key = "item_ward_observer";
        chargeable = false;
        components = new String[0];
        consumable = false;
        duration_minutes_tooltip = 7;
        health = 200;
        initialCharges = 0;
        lifetime = 420;
        localizedName = "Observer Ward";
        maxCharges = 0;
        partOf = new String[0];
        placeable = true;
        placeableDuration = 420;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.FULLY_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
        vision_range = 1600;
    }

    public static ObserverWard instance() {
        if( instance == null ){
            instance = new ObserverWard();
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

    public int getCost() {
        return cost;
    }

    public boolean isStackable() {
        return stackable;
    }

    public String getKey() {
        return key;
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

    public int getDurationMinutesTooltip() {
        return duration_minutes_tooltip;
    }

    public int getHealth() {
        return health;
    }

    public int getInitialCharges() {
        return initialCharges;
    }

    public int getLifetime() {
        return lifetime;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaxCharges() {
        return maxCharges;
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

    public Shareablilty getShareability() {
        return shareability;
    }

    public Vendor[] getVendorLocations() {
        return vendorLocations;
    }

    public int getVisionRange() {
        return vision_range;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ObserverWard))
            return false;
        if (object == this)
            return true;
        ObserverWard otherObject = (ObserverWard) object;
        return otherObject.getKey().equals(getKey());
    }

}
