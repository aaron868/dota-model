package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Crystalys extends Item {

    private static Crystalys instance;

    private final String abilityBehavior;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_damage;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int crit_chance;
    private final int crit_multiplier;
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

    private Crystalys() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 149;
        cost = 2120;
        key = "item_lesser_crit";
        bonus_damage = 30;
        chargeable = false;
        components = new String[]{"item_broadsword","item_blades_of_attack","item_recipe_lesser_crit"};
        consumable = false;
        crit_chance = 20;
        crit_multiplier = 175;
        initialCharges = 0;
        localizedName = "Crystalys ";
        maxCharges = 0;
        partOf = new String[]{"item_greater_crit"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static Crystalys instance() {
        if( instance == null ){
            instance = new Crystalys();
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

    public int getCritChance() {
        return crit_chance;
    }

    public int getCritMultiplier() {
        return crit_multiplier;
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
        if (!(object instanceof Crystalys))
            return false;
        if (object == this)
            return true;
        Crystalys otherObject = (Crystalys) object;
        return otherObject.getKey().equals(getKey());
    }

}
