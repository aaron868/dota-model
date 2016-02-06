package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class TranquilBoots extends Item {

    private static TranquilBoots instance;

    private final String abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_armor;
    private final int bonus_health_regen;
    private final int bonus_movement_speed;
    private final int break_count;
    private final int break_threshold;
    private final int break_time;
    private final int broken_movement_speed;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int heal_amount;
    private final int heal_duration;
    private final double heal_interval;
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

    private TranquilBoots() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityCooldown = 13;
        abilityManaCost = 0;
        iD = 214;
        cost = 925;
        key = "item_tranquil_boots";
        bonus_armor = 3;
        bonus_health_regen = 12;
        bonus_movement_speed = 85;
        break_count = 1;
        break_threshold = 20;
        break_time = 13;
        broken_movement_speed = 55;
        chargeable = false;
        components = new String[]{"item_boots","item_ring_of_protection","item_ring_of_regen"};
        consumable = false;
        heal_amount = 250;
        heal_duration = 2;
        heal_interval = .334;
        initialCharges = 0;
        localizedName = "Tranquil Boots";
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

    public static TranquilBoots instance() {
        if( instance == null ){
            instance = new TranquilBoots();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
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

    public int getBonusHealthRegen() {
        return bonus_health_regen;
    }

    public int getBonusMovementSpeed() {
        return bonus_movement_speed;
    }

    public int getBreakCount() {
        return break_count;
    }

    public int getBreakThreshold() {
        return break_threshold;
    }

    public int getBreakTime() {
        return break_time;
    }

    public int getBrokenMovementSpeed() {
        return broken_movement_speed;
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

    public int getHealAmount() {
        return heal_amount;
    }

    public int getHealDuration() {
        return heal_duration;
    }

    public double getHealInterval() {
        return heal_interval;
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
        if (!(object instanceof TranquilBoots))
            return false;
        if (object == this)
            return true;
        TranquilBoots otherObject = (TranquilBoots) object;
        return otherObject.getKey().equals(getKey());
    }

}
