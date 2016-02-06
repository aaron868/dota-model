package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class EulsScepterOfDivinity extends Item {

    private static EulsScepterOfDivinity instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_intellect;
    private final int bonus_mana_regen;
    private final int bonus_movement_speed;
    private final int cast_range_tooltip;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final double cyclone_duration;
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

    private EulsScepterOfDivinity() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = 0;
        abilityCastRange = 575;
        abilityCooldown = 23;
        abilityManaCost = 175;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_CUSTOM";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_CUSTOM";
        iD = 100;
        cost = 2825;
        key = "item_cyclone";
        bonus_intellect = 10;
        bonus_mana_regen = 150;
        bonus_movement_speed = 40;
        cast_range_tooltip = 575;
        chargeable = false;
        components = new String[]{"item_sobi_mask","item_staff_of_wizardry","item_void_stone","item_recipe_cyclone"};
        consumable = false;
        cyclone_duration = 2.5;
        initialCharges = 0;
        localizedName = "Eul's Scepter Of Divinity";
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

    public static EulsScepterOfDivinity instance() {
        if( instance == null ){
            instance = new EulsScepterOfDivinity();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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

    public String getAbilityUnitTargetType() {
        return abilityUnitTargetType;
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

    public int getBonusIntellect() {
        return bonus_intellect;
    }

    public int getBonusManaRegen() {
        return bonus_mana_regen;
    }

    public int getBonusMovementSpeed() {
        return bonus_movement_speed;
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

    public double getCycloneDuration() {
        return cyclone_duration;
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
        if (!(object instanceof EulsScepterOfDivinity))
            return false;
        if (object == this)
            return true;
        EulsScepterOfDivinity otherObject = (EulsScepterOfDivinity) object;
        return otherObject.getKey().equals(getKey());
    }

}
