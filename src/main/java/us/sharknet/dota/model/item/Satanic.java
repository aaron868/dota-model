package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Satanic extends Item {

    private static Satanic instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_armor;
    private final int bonus_damage;
    private final int bonus_strength;
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
    private final double unholy_duration;
    private final int unholy_lifesteal_percent;
    private final int unholy_lifesteal_total_tooltip;
    private final Vendor[] vendorLocations;

    private Satanic() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 35;
        iD = 156;
        cost = 5900;
        key = "item_satanic";
        bonus_armor = 5;
        bonus_damage = 20;
        bonus_strength = 25;
        chargeable = false;
        components = new String[]{"item_reaver","item_helm_of_the_dominator","item_recipe_satanic"};
        consumable = false;
        initialCharges = 0;
        lifesteal_percent = 25;
        localizedName = "Satanic";
        maxCharges = 0;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        unholy_duration = 4.5;
        unholy_lifesteal_percent = 175;
        unholy_lifesteal_total_tooltip = 200;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static Satanic instance() {
        if( instance == null ){
            instance = new Satanic();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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

    public int getBonusArmor() {
        return bonus_armor;
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

    public double getUnholyDuration() {
        return unholy_duration;
    }

    public int getUnholyLifestealPercent() {
        return unholy_lifesteal_percent;
    }

    public int getUnholyLifestealTotalTooltip() {
        return unholy_lifesteal_total_tooltip;
    }

    public Vendor[] getVendorLocations() {
        return vendorLocations;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Satanic))
            return false;
        if (object == this)
            return true;
        Satanic otherObject = (Satanic) object;
        return otherObject.getKey().equals(getKey());
    }

}
