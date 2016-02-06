package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class SkullBasher extends Item {

    private static SkullBasher instance;

    private final String abilityBehavior;
    private final double abilityCooldown;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bash_chance_melee;
    private final int bash_chance_ranged;
    private final double bash_cooldown;
    private final double bash_duration;
    private final int bonus_chance_damage;
    private final int bonus_damage;
    private final int bonus_strength;
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

    private SkullBasher() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityCooldown = 2.3;
        iD = 143;
        cost = 2950;
        key = "item_basher";
        bash_chance_melee = 25;
        bash_chance_ranged = 10;
        bash_cooldown = 2.3;
        bash_duration = 1.4;
        bonus_chance_damage = 120;
        bonus_damage = 10;
        bonus_strength = 10;
        chargeable = false;
        components = new String[]{"item_belt_of_strength","item_javelin","item_recipe_basher"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Skull Basher";
        maxCharges = 0;
        partOf = new String[]{"item_abyssal_blade"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static SkullBasher instance() {
        if( instance == null ){
            instance = new SkullBasher();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCooldown() {
        return abilityCooldown;
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

    public int getBashChanceMelee() {
        return bash_chance_melee;
    }

    public int getBashChanceRanged() {
        return bash_chance_ranged;
    }

    public double getBashCooldown() {
        return bash_cooldown;
    }

    public double getBashDuration() {
        return bash_duration;
    }

    public int getBonusChanceDamage() {
        return bonus_chance_damage;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusStrength() {
        return bonus_strength;
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
        if (!(object instanceof SkullBasher))
            return false;
        if (object == this)
            return true;
        SkullBasher otherObject = (SkullBasher) object;
        return otherObject.getKey().equals(getKey());
    }

}
