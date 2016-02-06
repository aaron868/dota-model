package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class PowerTreads extends Item {

    private static PowerTreads instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_attack_speed;
    private final int bonus_damage;
    private final int bonus_movement_speed;
    private final int bonus_stat;
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

    private PowerTreads() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        iD = 63;
        cost = 1350;
        key = "item_power_treads";
        bonus_attack_speed = 25;
        bonus_damage = 0;
        bonus_movement_speed = 45;
        bonus_stat = 9;
        chargeable = false;
        components = new String[]{"item_boots","item_gloves","item_belt_of_strength"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Power Treads";
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

    public static PowerTreads instance() {
        if( instance == null ){
            instance = new PowerTreads();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusMovementSpeed() {
        return bonus_movement_speed;
    }

    public int getBonusStat() {
        return bonus_stat;
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
        if (!(object instanceof PowerTreads))
            return false;
        if (object == this)
            return true;
        PowerTreads otherObject = (PowerTreads) object;
        return otherObject.getKey().equals(getKey());
    }

}
