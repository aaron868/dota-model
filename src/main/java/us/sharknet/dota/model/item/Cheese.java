package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Cheese extends Item {

    private static Cheese instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int iD;
    private final int cost;
    private final boolean purchasable;
    private final boolean stackable;
    private final String key;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int health_restore;
    private final int initialCharges;
    private final String localizedName;
    private final int mana_restore;
    private final int maxCharges;
    private final String[] partOf;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int quantity;
    private final boolean recipe;
    private final Shareablilty shareability;
    private final Vendor[] vendorLocations;

    private Cheese() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 4;
        iD = 33;
        cost = 1000;
        purchasable = false;
        stackable = true;
        key = "item_cheese";
        chargeable = false;
        components = new String[0];
        consumable = true;
        health_restore = 2500;
        initialCharges = 0;
        localizedName = "Cheese";
        mana_restore = 1000;
        maxCharges = 0;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.FULLY_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.ROSHAN_DEATH};
    }

    public static Cheese instance() {
        if( instance == null ){
            instance = new Cheese();
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

    public boolean isPurchasable() {
        return purchasable;
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

    public int getHealthRestore() {
        return health_restore;
    }

    public int getInitialCharges() {
        return initialCharges;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getManaRestore() {
        return mana_restore;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Cheese))
            return false;
        if (object == this)
            return true;
        Cheese otherObject = (Cheese) object;
        return otherObject.getKey().equals(getKey());
    }

}
