package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class UrnOfShadows extends Item {

    private static UrnOfShadows instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final int cost;
    private final boolean stackable;
    private final String key;
    private final int bonus_strength;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int initialCharges;
    private final String localizedName;
    private final int mana_regen;
    private final int maxCharges;
    private final String[] partOf;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int quantity;
    private final boolean recipe;
    private final Shareablilty shareability;
    private final int soul_additional_charges;
    private final int soul_damage_amount;
    private final int soul_damage_duration;
    private final int soul_heal_amount;
    private final int soul_heal_duration;
    private final double soul_heal_interval;
    private final int soul_initial_charge;
    private final int soul_radius;
    private final int soul_release_range_tooltip;
    private final Vendor[] vendorLocations;

    private UrnOfShadows() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = 0;
        abilityCastRange = 950;
        abilityCooldown = 7;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_BOTH";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        iD = 92;
        cost = 875;
        stackable = false;
        key = "item_urn_of_shadows";
        bonus_strength = 6;
        chargeable = true;
        components = new String[]{"item_sobi_mask","item_gauntlets","item_gauntlets","item_recipe_urn_of_shadows"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Urn Of Shadows";
        mana_regen = 50;
        maxCharges = 9999;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        soul_additional_charges = 1;
        soul_damage_amount = 150;
        soul_damage_duration = 8;
        soul_heal_amount = 400;
        soul_heal_duration = 8;
        soul_heal_interval = .25;
        soul_initial_charge = 2;
        soul_radius = 1400;
        soul_release_range_tooltip = 950;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static UrnOfShadows instance() {
        if( instance == null ){
            instance = new UrnOfShadows();
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

    public boolean isStackable() {
        return stackable;
    }

    public String getKey() {
        return key;
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

    public int getManaRegen() {
        return mana_regen;
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

    public int getSoulAdditionalCharges() {
        return soul_additional_charges;
    }

    public int getSoulDamageAmount() {
        return soul_damage_amount;
    }

    public int getSoulDamageDuration() {
        return soul_damage_duration;
    }

    public int getSoulHealAmount() {
        return soul_heal_amount;
    }

    public int getSoulHealDuration() {
        return soul_heal_duration;
    }

    public double getSoulHealInterval() {
        return soul_heal_interval;
    }

    public int getSoulInitialCharge() {
        return soul_initial_charge;
    }

    public int getSoulRadius() {
        return soul_radius;
    }

    public int getSoulReleaseRangeTooltip() {
        return soul_release_range_tooltip;
    }

    public Vendor[] getVendorLocations() {
        return vendorLocations;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof UrnOfShadows))
            return false;
        if (object == this)
            return true;
        UrnOfShadows otherObject = (UrnOfShadows) object;
        return otherObject.getKey().equals(getKey());
    }

}
