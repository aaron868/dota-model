package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class DiffusalBlade1 extends Item {

    private static DiffusalBlade1 instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilitySharedCooldown;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final int itemBaseLevel;
    private final int cost;
    private final String key;
    private final int bonus_agility;
    private final int bonus_intellect;
    private final int cast_range_tooltip;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int damage_per_burn;
    private final int feedback_mana_burn;
    private final int feedback_mana_burn_ranged;
    private final int initialCharges;
    private final String localizedName;
    private final int maxCharges;
    private final String[] partOf;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int purge_rate;
    private final int purge_root_duration;
    private final int purge_slow_duration;
    private final int purge_summoned_damage;
    private final int quantity;
    private final boolean recipe;
    private final Shareablilty shareability;
    private final Vendor[] vendorLocations;

    private DiffusalBlade1() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = 0;
        abilityCastRange = 600;
        abilityCooldown = 0;
        abilityManaCost = 0;
        abilitySharedCooldown = "diffusal";
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_INVULNERABLE";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_BOTH";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 174;
        itemBaseLevel = 1;
        cost = 3150;
        key = "item_diffusal_blade";
        bonus_agility = 25;
        bonus_intellect = 10;
        cast_range_tooltip = 600;
        chargeable = true;
        components = new String[]{"item_blade_of_alacrity","item_blade_of_alacrity","item_robe","item_recipe_diffusal_blade"};
        consumable = false;
        damage_per_burn = 1;
        feedback_mana_burn = 25;
        feedback_mana_burn_ranged = 25;
        initialCharges = 8;
        localizedName = "Diffusal Blade 1";
        maxCharges = 8;
        partOf = new String[]{"item_diffusal_blade_2"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        purge_rate = 5;
        purge_root_duration = 3;
        purge_slow_duration = 4;
        purge_summoned_damage = 99999;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static DiffusalBlade1 instance() {
        if( instance == null ){
            instance = new DiffusalBlade1();
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

    public String getAbilitySharedCooldown() {
        return abilitySharedCooldown;
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

    public int getItemBaseLevel() {
        return itemBaseLevel;
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

    public int getBonusIntellect() {
        return bonus_intellect;
    }

    public int getCastRangeTooltip() {
        return cast_range_tooltip;
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

    public int getDamagePerBurn() {
        return damage_per_burn;
    }

    public int getFeedbackManaBurn() {
        return feedback_mana_burn;
    }

    public int getFeedbackManaBurnRanged() {
        return feedback_mana_burn_ranged;
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

    public int getPurgeRate() {
        return purge_rate;
    }

    public int getPurgeRootDuration() {
        return purge_root_duration;
    }

    public int getPurgeSlowDuration() {
        return purge_slow_duration;
    }

    public int getPurgeSummonedDamage() {
        return purge_summoned_damage;
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
        if (!(object instanceof DiffusalBlade1))
            return false;
        if (object == this)
            return true;
        DiffusalBlade1 otherObject = (DiffusalBlade1) object;
        return otherObject.getKey().equals(getKey());
    }

}
