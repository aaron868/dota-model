package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Desolator extends Item {

    private static Desolator instance;

    private final String abilityBehavior;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_damage;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int corruption_armor;
    private final int corruption_duration;
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

    private Desolator() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 168;
        cost = 3500;
        key = "item_desolator";
        bonus_damage = 50;
        chargeable = false;
        components = new String[]{"item_mithril_hammer","item_mithril_hammer","item_recipe_desolator"};
        consumable = false;
        corruption_armor = -7;
        corruption_duration = 15;
        initialCharges = 0;
        localizedName = "Desolator";
        maxCharges = 0;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static Desolator instance() {
        if( instance == null ){
            instance = new Desolator();
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

    public int getBonusDamage() {
        return bonus_damage;
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

    public int getCorruptionArmor() {
        return corruption_armor;
    }

    public int getCorruptionDuration() {
        return corruption_duration;
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
        if (!(object instanceof Desolator))
            return false;
        if (object == this)
            return true;
        Desolator otherObject = (Desolator) object;
        return otherObject.getKey().equals(getKey());
    }

}
