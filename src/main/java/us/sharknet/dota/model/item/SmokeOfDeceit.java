package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class SmokeOfDeceit extends Item {

    private static SmokeOfDeceit instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int iD;
    private final int cost;
    private final boolean stackable;
    private final String key;
    private final int application_radius;
    private final int bonus_movement_speed;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int duration;
    private final int initialCharges;
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
    private final int visibility_radius;

    private SmokeOfDeceit() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCooldown = 9;
        iD = 188;
        cost = 50;
        stackable = true;
        key = "item_smoke_of_deceit";
        application_radius = 1200;
        bonus_movement_speed = 15;
        chargeable = false;
        components = new String[0];
        consumable = true;
        duration = 35;
        initialCharges = 0;
        localizedName = "Smoke Of Deceit";
        maxCharges = 0;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.FULLY_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
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

    public int getApplicationRadius() {
        return application_radius;
    }

    public int getBonusMovementSpeed() {
        return bonus_movement_speed;
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

    public int getDuration() {
        return duration;
    }

    public int getInitialCharges() {
        return initialCharges;
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
