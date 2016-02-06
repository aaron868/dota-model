package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class GemOfTrueSight extends Item {

    private static GemOfTrueSight instance;

    private final String abilityBehavior;
    private final int iD;
    private final int cost;
    private final boolean deniable;
    private final boolean sellable;
    private final String key;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int initialCharges;
    private final String localizedName;
    private final int maxCharges;
    private final String[] partOf;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int quantity;
    private final int radius;
    private final boolean recipe;
    private final Shareablilty shareability;
    private final Vendor[] vendorLocations;

    private GemOfTrueSight() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 30;
        cost = 900;
        deniable = false;
        sellable = false;
        key = "item_gem";
        chargeable = false;
        components = new String[0];
        consumable = false;
        initialCharges = 0;
        localizedName = "Gem Of True Sight";
        maxCharges = 0;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        radius = 1100;
        recipe = false;
        shareability = Shareablilty.PARTIALLY_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static GemOfTrueSight instance() {
        if( instance == null ){
            instance = new GemOfTrueSight();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getID() {
        return iD;
    }

    public int getCost() {
        return cost;
    }

    public boolean isDeniable() {
        return deniable;
    }

    public boolean isSellable() {
        return sellable;
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
        if (!(object instanceof GemOfTrueSight))
            return false;
        if (object == this)
            return true;
        GemOfTrueSight otherObject = (GemOfTrueSight) object;
        return otherObject.getKey().equals(getKey());
    }

}
