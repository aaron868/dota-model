package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Dagon5Recipe extends Item {

    private static Dagon5Recipe instance;

    private final int iD;
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

    private Dagon5Recipe() {
        iD = 200;
        cost = 1250;
        key = "item_recipe_dagon_5";
        chargeable = false;
        components = new String[0];
        consumable = false;
        initialCharges = 0;
        localizedName = "Dagon 5 Recipe";
        maxCharges = 0;
        partOf = new String[]{"item_dagon_5"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = true;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static Dagon5Recipe instance() {
        if( instance == null ){
            instance = new Dagon5Recipe();
        }
        return instance;
    }

    public int getID() {
        return iD;
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
        if (!(object instanceof Dagon5Recipe))
            return false;
        if (object == this)
            return true;
        Dagon5Recipe otherObject = (Dagon5Recipe) object;
        return otherObject.getKey().equals(getKey());
    }

}
