package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class EyeOfSkadi extends Item {

    private static EyeOfSkadi instance;

    private final String abilityBehavior;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_all_stats;
    private final int bonus_health;
    private final int bonus_mana;
    private final boolean chargeable;
    private final int cold_attack_speed;
    private final int cold_duration_melee;
    private final double cold_duration_ranged;
    private final int cold_movement_speed;
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
    private final Vendor[] vendorLocations;

    private EyeOfSkadi() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 160;
        cost = 5675;
        key = "item_skadi";
        bonus_all_stats = 25;
        bonus_health = 250;
        bonus_mana = 250;
        chargeable = false;
        cold_attack_speed = -45;
        cold_duration_melee = 5;
        cold_duration_ranged = 2.5;
        cold_movement_speed = -35;
        components = new String[]{"item_ultimate_orb","item_ultimate_orb","item_point_booster","item_orb_of_venom"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Eye Of Skadi";
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

    public static EyeOfSkadi instance() {
        if( instance == null ){
            instance = new EyeOfSkadi();
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

    public String getKey() {
        return key;
    }

    public int getBonusAllStats() {
        return bonus_all_stats;
    }

    public int getBonusHealth() {
        return bonus_health;
    }

    public int getBonusMana() {
        return bonus_mana;
    }

    public boolean isChargeable() {
        return chargeable;
    }

    public int getColdAttackSpeed() {
        return cold_attack_speed;
    }

    public int getColdDurationMelee() {
        return cold_duration_melee;
    }

    public double getColdDurationRanged() {
        return cold_duration_ranged;
    }

    public int getColdMovementSpeed() {
        return cold_movement_speed;
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

    public Vendor[] getVendorLocations() {
        return vendorLocations;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EyeOfSkadi))
            return false;
        if (object == this)
            return true;
        EyeOfSkadi otherObject = (EyeOfSkadi) object;
        return otherObject.getKey().equals(getKey());
    }

}
