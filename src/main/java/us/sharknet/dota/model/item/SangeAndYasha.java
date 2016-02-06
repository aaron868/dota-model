package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class SangeAndYasha extends Item {

    private static SangeAndYasha instance;

    private final String abilityBehavior;
    private final int iD;
    private final int cost;
    private final boolean disassemblable;
    private final String key;
    private final int bonus_agility;
    private final int bonus_attack_speed;
    private final int bonus_damage;
    private final int bonus_strength;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int initialCharges;
    private final String localizedName;
    private final int maim_chance;
    private final int maim_duration;
    private final int maim_slow_attack;
    private final int maim_slow_movement;
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

    private SangeAndYasha() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 154;
        cost = 4100;
        disassemblable = true;
        key = "item_sange_and_yasha";
        bonus_agility = 16;
        bonus_attack_speed = 16;
        bonus_damage = 16;
        bonus_strength = 16;
        chargeable = false;
        components = new String[]{"item_yasha","item_sange"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Sange And Yasha";
        maim_chance = 16;
        maim_duration = 5;
        maim_slow_attack = -32;
        maim_slow_movement = -32;
        maxCharges = 0;
        movement_speed_percent_bonus = 16;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static SangeAndYasha instance() {
        if( instance == null ){
            instance = new SangeAndYasha();
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

    public boolean isDisassemblable() {
        return disassemblable;
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

    public int getMaimChance() {
        return maim_chance;
    }

    public int getMaimDuration() {
        return maim_duration;
    }

    public int getMaimSlowAttack() {
        return maim_slow_attack;
    }

    public int getMaimSlowMovement() {
        return maim_slow_movement;
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
        if (!(object instanceof SangeAndYasha))
            return false;
        if (object == this)
            return true;
        SangeAndYasha otherObject = (SangeAndYasha) object;
        return otherObject.getKey().equals(getKey());
    }

}
