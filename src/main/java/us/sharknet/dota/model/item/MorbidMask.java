package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class MorbidMask extends Item {

    private static MorbidMask instance;

    private final String abilityBehavior;
    private final int iD;
    private final int cost;
    private final String key;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int initialCharges;
    private final int lifesteal_percent;
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

    private MorbidMask() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 26;
        cost = 900;
        key = "item_lifesteal";
        chargeable = false;
        components = new String[0];
        consumable = false;
        initialCharges = 0;
        lifesteal_percent = 15;
        localizedName = "Morbid Mask";
        maxCharges = 0;
        partOf = new String[]{"item_vladmir","item_helm_of_the_dominator","item_mask_of_madness"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.SIDE_SHOP,Vendor. FOUNTAIN_SHOP};
    }

    public static MorbidMask instance() {
        if( instance == null ){
            instance = new MorbidMask();
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

    public int getLifestealPercent() {
        return lifesteal_percent;
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
        if (!(object instanceof MorbidMask))
            return false;
        if (object == this)
            return true;
        MorbidMask otherObject = (MorbidMask) object;
        return otherObject.getKey().equals(getKey());
    }

}
