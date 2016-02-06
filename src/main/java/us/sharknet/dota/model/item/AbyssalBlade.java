package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class AbyssalBlade extends Item {

    private static AbyssalBlade instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final int cost;
    private final boolean disassemblable;
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
    private final int stun_duration;
    private final Vendor[] vendorLocations;

    private AbyssalBlade() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = 0;
        abilityCastRange = 140;
        abilityCooldown = 60;
        abilityManaCost = 150;
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 208;
        cost = 6750;
        disassemblable = true;
        key = "item_abyssal_blade";
        bash_chance_melee = 25;
        bash_chance_ranged = 10;
        bash_cooldown = 2.3;
        bash_duration = 1.4;
        bonus_chance_damage = 120;
        bonus_damage = 70;
        bonus_strength = 10;
        chargeable = false;
        components = new String[]{"item_basher","item_relic"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Abyssal Blade";
        maxCharges = 0;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        stun_duration = 2;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static AbyssalBlade instance() {
        if( instance == null ){
            instance = new AbyssalBlade();
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

    public String getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public int getStunDuration() {
        return stun_duration;
    }

    public Vendor[] getVendorLocations() {
        return vendorLocations;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AbyssalBlade))
            return false;
        if (object == this)
            return true;
        AbyssalBlade otherObject = (AbyssalBlade) object;
        return otherObject.getKey().equals(getKey());
    }

}
