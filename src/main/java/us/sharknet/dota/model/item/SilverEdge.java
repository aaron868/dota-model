package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class SilverEdge extends Item {

    private static SilverEdge instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilitySharedCooldown;
    private final int iD;
    private final int cost;
    private final String key;
    private final int backstab_duration;
    private final int backstab_duration_range;
    private final int backstab_reduction;
    private final int backstab_slow;
    private final int bonus_attack_speed;
    private final int bonus_damage;
    private final int bonus_strength;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int initialCharges;
    private final String localizedName;
    private final int maim_attack_speed;
    private final int maim_chance;
    private final int maim_duration;
    private final int maim_movement_speed;
    private final int maxCharges;
    private final String[] partOf;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int quantity;
    private final boolean recipe;
    private final Shareablilty shareability;
    private final Vendor[] vendorLocations;
    private final int windwalk_bonus_damage;
    private final int windwalk_duration;
    private final double windwalk_fade_time;
    private final int windwalk_movement_speed;

    private SilverEdge() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL"};
        abilityCooldown = 24;
        abilityManaCost = 75;
        abilitySharedCooldown = "shadow_blade";
        iD = 249;
        cost = 5450;
        key = "item_silver_edge";
        backstab_duration = 5;
        backstab_duration_range = 5;
        backstab_reduction = -40;
        backstab_slow = 0;
        bonus_attack_speed = 30;
        bonus_damage = 32;
        bonus_strength = 16;
        chargeable = false;
        components = new String[]{"item_invis_sword","item_sange","item_recipe_silver_edge"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Silver Edge";
        maim_attack_speed = -20;
        maim_chance = 15;
        maim_duration = 4;
        maim_movement_speed = -20;
        maxCharges = 0;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
        windwalk_bonus_damage = 225;
        windwalk_duration = 14;
        windwalk_fade_time = .3;
        windwalk_movement_speed = 20;
    }

    public static SilverEdge instance() {
        if( instance == null ){
            instance = new SilverEdge();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilitySharedCooldown() {
        return abilitySharedCooldown;
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

    public int getBackstabDuration() {
        return backstab_duration;
    }

    public int getBackstabDurationRange() {
        return backstab_duration_range;
    }

    public int getBackstabReduction() {
        return backstab_reduction;
    }

    public int getBackstabSlow() {
        return backstab_slow;
    }

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
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

    public int getMaimAttackSpeed() {
        return maim_attack_speed;
    }

    public int getMaimChance() {
        return maim_chance;
    }

    public int getMaimDuration() {
        return maim_duration;
    }

    public int getMaimMovementSpeed() {
        return maim_movement_speed;
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

    public int getWindwalkBonusDamage() {
        return windwalk_bonus_damage;
    }

    public int getWindwalkDuration() {
        return windwalk_duration;
    }

    public double getWindwalkFadeTime() {
        return windwalk_fade_time;
    }

    public int getWindwalkMovementSpeed() {
        return windwalk_movement_speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SilverEdge))
            return false;
        if (object == this)
            return true;
        SilverEdge otherObject = (SilverEdge) object;
        return otherObject.getKey().equals(getKey());
    }

}
