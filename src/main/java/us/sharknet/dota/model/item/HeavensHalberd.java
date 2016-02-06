package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class HeavensHalberd extends Item {

    private static HeavensHalberd instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final int cost;
    private final boolean disassemblable;
    private final String key;
    private final int bonus_damage;
    private final int bonus_evasion;
    private final int bonus_strength;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int disarm_cast_range_tooltip;
    private final int disarm_melee;
    private final double disarm_range;
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

    private HeavensHalberd() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = 0;
        abilityCastRange = 600;
        abilityCooldown = 30;
        abilityManaCost = 100;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 210;
        cost = 3850;
        disassemblable = true;
        key = "item_heavens_halberd";
        bonus_damage = 25;
        bonus_evasion = 25;
        bonus_strength = 20;
        chargeable = false;
        components = new String[]{"item_sange","item_talisman_of_evasion"};
        consumable = false;
        disarm_cast_range_tooltip = 600;
        disarm_melee = 3;
        disarm_range = 4.5;
        initialCharges = 0;
        localizedName = "Heaven's Halberd";
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
    }

    public static HeavensHalberd instance() {
        if( instance == null ){
            instance = new HeavensHalberd();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
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

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusEvasion() {
        return bonus_evasion;
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

    public int getDisarmCastRangeTooltip() {
        return disarm_cast_range_tooltip;
    }

    public int getDisarmMelee() {
        return disarm_melee;
    }

    public double getDisarmRange() {
        return disarm_range;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof HeavensHalberd))
            return false;
        if (object == this)
            return true;
        HeavensHalberd otherObject = (HeavensHalberd) object;
        return otherObject.getKey().equals(getKey());
    }

}
