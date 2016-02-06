package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class DustOfAppearance extends Item {

    private static DustOfAppearance instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final int cost;
    private final boolean stackable;
    private final String key;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int duration;
    private final int initialCharges;
    private final String localizedName;
    private final int maxCharges;
    private final int movespeed;
    private final String[] partOf;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int quantity;
    private final int radius;
    private final boolean recipe;
    private final Shareablilty shareability;
    private final Vendor[] vendorLocations;

    private DustOfAppearance() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 3;
        abilityManaCost = 5;
        iD = 40;
        cost = 180;
        stackable = true;
        key = "item_dust";
        chargeable = false;
        components = new String[0];
        consumable = true;
        duration = 12;
        initialCharges = 0;
        localizedName = "Dust Of Appearance";
        maxCharges = 0;
        movespeed = -20;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        radius = 1050;
        recipe = false;
        shareability = Shareablilty.FULLY_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static DustOfAppearance instance() {
        if( instance == null ){
            instance = new DustOfAppearance();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
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

    public int getMovespeed() {
        return movespeed;
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

    public int getRadius() {
        return radius;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DustOfAppearance))
            return false;
        if (object == this)
            return true;
        DustOfAppearance otherObject = (DustOfAppearance) object;
        return otherObject.getKey().equals(getKey());
    }

}
