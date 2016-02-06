package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Headdress extends Item {

    private static Headdress instance;

    private final String abilityBehavior;
    private final int iD;
    private final int cost;
    private final String key;
    private final int aura_health_regen;
    private final int aura_radius;
    private final int bonus_all_stats;
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

    private Headdress() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 94;
        cost = 600;
        key = "item_headdress";
        aura_health_regen = 3;
        aura_radius = 900;
        bonus_all_stats = 2;
        chargeable = false;
        components = new String[]{"item_ring_of_regen","item_branches","item_recipe_headdress"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Headdress";
        maxCharges = 0;
        partOf = new String[]{"item_mekansm","item_pipe","item_vladmir"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static Headdress instance() {
        if( instance == null ){
            instance = new Headdress();
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

    public int getAuraHealthRegen() {
        return aura_health_regen;
    }

    public int getAuraRadius() {
        return aura_radius;
    }

    public int getBonusAllStats() {
        return bonus_all_stats;
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
        if (!(object instanceof Headdress))
            return false;
        if (object == this)
            return true;
        Headdress otherObject = (Headdress) object;
        return otherObject.getKey().equals(getKey());
    }

}
