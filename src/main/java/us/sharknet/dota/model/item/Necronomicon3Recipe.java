package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Necronomicon3Recipe extends Item {

    private static Necronomicon3Recipe instance;

    private final int iD;
    private final int itemBaseLevel;
    private final int cost;
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
    private final boolean recipe;
    private final Shareablilty shareability;
    private final Vendor[] vendorLocations;

    private Necronomicon3Recipe() {
        iD = 192;
        itemBaseLevel = 3;
        cost = 0;
        key = "item_recipe_necronomicon_3";
        chargeable = false;
        components = new String[0];
        consumable = false;
        initialCharges = 0;
        localizedName = "Necronomicon 3 Recipe";
        maxCharges = 0;
        partOf = new String[]{"item_necronomicon_3"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = true;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static Necronomicon3Recipe instance() {
        if( instance == null ){
            instance = new Necronomicon3Recipe();
        }
        return instance;
    }

    public int getID() {
        return iD;
    }

    public int getItemBaseLevel() {
        return itemBaseLevel;
    }

    public int getCost() {
        return cost;
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
        if (!(object instanceof Necronomicon3Recipe))
            return false;
        if (object == this)
            return true;
        Necronomicon3Recipe otherObject = (Necronomicon3Recipe) object;
        return otherObject.getKey().equals(getKey());
    }

}
