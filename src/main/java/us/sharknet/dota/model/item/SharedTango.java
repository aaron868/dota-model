package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class SharedTango extends Item {

    private static SharedTango instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final int cost;
    private final boolean purchasable;
    private final boolean sellable;
    private final boolean stackable;
    private final String key;
    private final int buff_duration;
    private final int cast_range_ward;
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
    private final int total_heal;
    private final int total_heal_ward_tooltip;
    private final Vendor[] vendorLocations;

    private SharedTango() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = 0;
        abilityCastRange = 165;
        abilityCooldown = 6;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_CUSTOM";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_TREE","DOTA_UNIT_TARGET_CUSTOM"};
        iD = 241;
        cost = 30;
        purchasable = false;
        sellable = false;
        stackable = false;
        key = "item_tango_single";
        buff_duration = 16;
        cast_range_ward = 450;
        chargeable = false;
        components = new String[0];
        consumable = true;
        initialCharges = 0;
        localizedName = "Shared Tango";
        maxCharges = 0;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.FULLY_SHAREABLE;
        total_heal = 115;
        total_heal_ward_tooltip = 230;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static SharedTango instance() {
        if( instance == null ){
            instance = new SharedTango();
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

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getID() {
        return iD;
    }

    public int getCost() {
        return cost;
    }

    public boolean isPurchasable() {
        return purchasable;
    }

    public boolean isSellable() {
        return sellable;
    }

    public boolean isStackable() {
        return stackable;
    }

    public String getKey() {
        return key;
    }

    public int getBuffDuration() {
        return buff_duration;
    }

    public int getCastRangeWard() {
        return cast_range_ward;
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

    public int getTotalHeal() {
        return total_heal;
    }

    public int getTotalHealWardTooltip() {
        return total_heal_ward_tooltip;
    }

    public Vendor[] getVendorLocations() {
        return vendorLocations;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SharedTango))
            return false;
        if (object == this)
            return true;
        SharedTango otherObject = (SharedTango) object;
        return otherObject.getKey().equals(getKey());
    }

}
