package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Yasha extends Item {

    private static Yasha instance;

    private final String abilityBehavior;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_agility;
    private final int bonus_attack_speed;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int initialCharges;
    private final String localizedName;
    private final int maxCharges;
    private final int movement_speed_percent_bonus;
    private final String[] partOf;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int quantity;
    private final boolean recipe;
    private final Shareablilty shareability;
    private final Vendor[] vendorLocations;

    private Yasha() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 170;
        cost = 2050;
        key = "item_yasha";
        bonus_agility = 16;
        bonus_attack_speed = 15;
        chargeable = false;
        components = new String[]{"item_blade_of_alacrity","item_boots_of_elves","item_recipe_yasha"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Yasha";
        maxCharges = 0;
        movement_speed_percent_bonus = 8;
        partOf = new String[]{"item_manta","item_sange_and_yasha"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static Yasha instance() {
        if( instance == null ){
            instance = new Yasha();
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

    public int getBonusAgility() {
        return bonus_agility;
    }

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
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

    public int getMovementSpeedPercentBonus() {
        return movement_speed_percent_bonus;
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
        if (!(object instanceof Yasha))
            return false;
        if (object == this)
            return true;
        Yasha otherObject = (Yasha) object;
        return otherObject.getKey().equals(getKey());
    }

}
