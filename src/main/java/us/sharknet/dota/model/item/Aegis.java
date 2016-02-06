package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Aegis extends Item {

    private static Aegis instance;

    private final String abilityBehavior;
    private final int iD;
    private final int cost;
    private final boolean droppable;
    private final boolean deniable;
    private final boolean purchasable;
    private final boolean sellable;
    private final String key;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int disappear_time;
    private final int disappear_time_minutes_tooltip;
    private final int initialCharges;
    private final String localizedName;
    private final int maxCharges;
    private final String[] partOf;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int quantity;
    private final boolean recipe;
    private final int reincarnate_time;
    private final Shareablilty shareability;
    private final Vendor[] vendorLocations;

    private Aegis() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 117;
        cost = 0;
        droppable = false;
        deniable = true;
        purchasable = false;
        sellable = false;
        key = "item_aegis";
        chargeable = false;
        components = new String[0];
        consumable = false;
        disappear_time = 3;
        disappear_time_minutes_tooltip = 5;
        initialCharges = 0;
        localizedName = "Aegis";
        maxCharges = 0;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        reincarnate_time = 5;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.ROSHAN_DEATH};
    }

    public static Aegis instance() {
        if( instance == null ){
            instance = new Aegis();
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

    public boolean isDroppable() {
        return droppable;
    }

    public boolean isDeniable() {
        return deniable;
    }

    public boolean isPurchasable() {
        return purchasable;
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

    public int getDisappearTime() {
        return disappear_time;
    }

    public int getDisappearTimeMinutesTooltip() {
        return disappear_time_minutes_tooltip;
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

    public int getReincarnateTime() {
        return reincarnate_time;
    }

    public Shareablilty getShareability() {
        return shareability;
    }

    public Vendor[] getVendorLocations() {
        return vendorLocations;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Aegis))
            return false;
        if (object == this)
            return true;
        Aegis otherObject = (Aegis) object;
        return otherObject.getKey().equals(getKey());
    }

}
