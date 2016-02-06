package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class DrumOfEndurance extends Item {

    private static DrumOfEndurance instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_attack_speed_pct;
    private final int bonus_aura_attack_speed_pct;
    private final int bonus_aura_movement_speed_pct;
    private final int bonus_damage;
    private final int bonus_movement_speed_pct;
    private final int bonus_stats;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int duration;
    private final int initialCharges;
    private final String localizedName;
    private final int maxCharges;
    private final String[] partOf;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int quantity;
    private final int radius;
    private final boolean recipe;
    private final Shareablilty shareability;
    private final Vendor[] vendorLocations;

    private DrumOfEndurance() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 3;
        iD = 185;
        cost = 1850;
        key = "item_ancient_janggo";
        bonus_attack_speed_pct = 25;
        bonus_aura_attack_speed_pct = 5;
        bonus_aura_movement_speed_pct = 5;
        bonus_damage = 3;
        bonus_movement_speed_pct = 13;
        bonus_stats = 9;
        chargeable = true;
        components = new String[]{"item_robe","item_bracer","item_recipe_ancient_janggo"};
        consumable = false;
        duration = 6;
        initialCharges = 6;
        localizedName = "Drum Of Endurance";
        maxCharges = 6;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        radius = 900;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static DrumOfEndurance instance() {
        if( instance == null ){
            instance = new DrumOfEndurance();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
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

    public int getBonusAttackSpeedPct() {
        return bonus_attack_speed_pct;
    }

    public int getBonusAuraAttackSpeedPct() {
        return bonus_aura_attack_speed_pct;
    }

    public int getBonusAuraMovementSpeedPct() {
        return bonus_aura_movement_speed_pct;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusMovementSpeedPct() {
        return bonus_movement_speed_pct;
    }

    public int getBonusStats() {
        return bonus_stats;
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

    public int getDuration() {
        return duration;
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

    public int getRadius() {
        return radius;
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
        if (!(object instanceof DrumOfEndurance))
            return false;
        if (object == this)
            return true;
        DrumOfEndurance otherObject = (DrumOfEndurance) object;
        return otherObject.getKey().equals(getKey());
    }

}
