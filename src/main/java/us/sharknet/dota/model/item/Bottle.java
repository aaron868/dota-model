package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Bottle extends Item {

    private static Bottle instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final double abilityCooldown;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final int cost;
    private final boolean stackable;
    private final String key;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int health_restore;
    private final int initialCharges;
    private final String localizedName;
    private final int mana_restore;
    private final int maxCharges;
    private final int movement_speed_percent_bonus;
    private final String[] partOf;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int quantity;
    private final boolean recipe;
    private final double restore_time;
    private final Shareablilty shareability;
    private final Vendor[] vendorLocations;

    private Bottle() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_OPTIONAL_UNIT_TARGET"};
        abilityCastPoint = 0;
        abilityCastRange = 350;
        abilityCooldown = .5;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        iD = 41;
        cost = 660;
        stackable = false;
        key = "item_bottle";
        chargeable = true;
        components = new String[0];
        consumable = false;
        health_restore = 90;
        initialCharges = 3;
        localizedName = "Bottle";
        mana_restore = 60;
        maxCharges = 3;
        movement_speed_percent_bonus = -30;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        restore_time = 2.5;
        shareability = Shareablilty.PARTIALLY_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.SIDE_SHOP,Vendor. FOUNTAIN_SHOP};
    }

    public static Bottle instance() {
        if( instance == null ){
            instance = new Bottle();
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

    public double getAbilityCooldown() {
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

    public boolean isChargeable() {
        return chargeable;
    }

    public String[] getComponents() {
        return components;
    }

    public boolean isConsumable() {
        return consumable;
    }

    public int getHealthRestore() {
        return health_restore;
    }

    public int getInitialCharges() {
        return initialCharges;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getManaRestore() {
        return mana_restore;
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

    public double getRestoreTime() {
        return restore_time;
    }

    public Shareablilty getShareability() {
        return shareability;
    }

    public Vendor[] getVendorLocations() {
        return vendorLocations;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Bottle))
            return false;
        if (object == this)
            return true;
        Bottle otherObject = (Bottle) object;
        return otherObject.getKey().equals(getKey());
    }

}
