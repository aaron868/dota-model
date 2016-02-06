package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class TalismanOfEvasion extends Item {

    private static TalismanOfEvasion instance;

    private final String abilityBehavior;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_evasion;
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

    private TalismanOfEvasion() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 32;
        cost = 1800;
        key = "item_talisman_of_evasion";
        bonus_evasion = 25;
        chargeable = false;
        components = new String[0];
        consumable = false;
        initialCharges = 0;
        localizedName = "Talisman Of Evasion";
        maxCharges = 0;
        partOf = new String[]{"item_solar_crest","item_heavens_halberd","item_butterfly"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.SECRET_SHOP};
    }

    public static TalismanOfEvasion instance() {
        if( instance == null ){
            instance = new TalismanOfEvasion();
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

    public int getBonusEvasion() {
        return bonus_evasion;
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
        if (!(object instanceof TalismanOfEvasion))
            return false;
        if (object == this)
            return true;
        TalismanOfEvasion otherObject = (TalismanOfEvasion) object;
        return otherObject.getKey().equals(getKey());
    }

}
