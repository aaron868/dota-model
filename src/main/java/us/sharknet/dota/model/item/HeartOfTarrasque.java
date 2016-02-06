package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class HeartOfTarrasque extends Item {

    private static HeartOfTarrasque instance;

    private final String abilityBehavior;
    private final int abilityCooldown;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_health;
    private final int bonus_strength;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int cooldown_melee;
    private final int cooldown_ranged_tooltip;
    private final double health_regen_rate;
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

    private HeartOfTarrasque() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityCooldown = 7;
        iD = 114;
        cost = 5500;
        key = "item_heart";
        bonus_health = 300;
        bonus_strength = 40;
        chargeable = false;
        components = new String[]{"item_reaver","item_vitality_booster","item_recipe_heart"};
        consumable = false;
        cooldown_melee = 5;
        cooldown_ranged_tooltip = 7;
        health_regen_rate = 4.75;
        initialCharges = 0;
        localizedName = "Heart Of Tarrasque";
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

    public static HeartOfTarrasque instance() {
        if( instance == null ){
            instance = new HeartOfTarrasque();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
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

    public int getBonusHealth() {
        return bonus_health;
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

    public int getCooldownMelee() {
        return cooldown_melee;
    }

    public int getCooldownRangedTooltip() {
        return cooldown_ranged_tooltip;
    }

    public double getHealthRegenRate() {
        return health_regen_rate;
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
        if (!(object instanceof HeartOfTarrasque))
            return false;
        if (object == this)
            return true;
        HeartOfTarrasque otherObject = (HeartOfTarrasque) object;
        return otherObject.getKey().equals(getKey());
    }

}
