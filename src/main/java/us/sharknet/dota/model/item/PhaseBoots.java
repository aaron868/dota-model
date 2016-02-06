package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class PhaseBoots extends Item {

    private static PhaseBoots instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_attack_speed;
    private final int bonus_damage;
    private final int bonus_movement_speed;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int initialCharges;
    private final String localizedName;
    private final int maxCharges;
    private final String[] partOf;
    private final double phase_duration;
    private final int phase_movement_speed;
    private final int phase_movement_speed_range;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int quantity;
    private final boolean recipe;
    private final Shareablilty shareability;
    private final Vendor[] vendorLocations;

    private PhaseBoots() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL"};
        abilityCooldown = 8;
        iD = 50;
        cost = 1240;
        key = "item_phase_boots";
        bonus_attack_speed = 0;
        bonus_damage = 24;
        bonus_movement_speed = 45;
        chargeable = false;
        components = new String[]{"item_boots","item_blades_of_attack","item_blades_of_attack"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Phase Boots";
        maxCharges = 0;
        partOf = new String[0];
        phase_duration = 2.5;
        phase_movement_speed = 24;
        phase_movement_speed_range = 20;
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static PhaseBoots instance() {
        if( instance == null ){
            instance = new PhaseBoots();
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

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusMovementSpeed() {
        return bonus_movement_speed;
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

    public double getPhaseDuration() {
        return phase_duration;
    }

    public int getPhaseMovementSpeed() {
        return phase_movement_speed;
    }

    public int getPhaseMovementSpeedRange() {
        return phase_movement_speed_range;
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
        if (!(object instanceof PhaseBoots))
            return false;
        if (object == this)
            return true;
        PhaseBoots otherObject = (PhaseBoots) object;
        return otherObject.getKey().equals(getKey());
    }

}
