package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class ScytheOfVyse extends Item {

    private static ScytheOfVyse instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_agility;
    private final int bonus_intellect;
    private final int bonus_mana_regen;
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
    private final double sheep_duration;
    private final int sheep_movement_speed;
    private final Vendor[] vendorLocations;

    private ScytheOfVyse() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = 0;
        abilityCastRange = 800;
        abilityCooldown = 25;
        abilityManaCost = 100;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 96;
        cost = 5650;
        key = "item_sheepstick";
        bonus_agility = 10;
        bonus_intellect = 35;
        bonus_mana_regen = 150;
        bonus_strength = 10;
        chargeable = false;
        components = new String[]{"item_mystic_staff","item_ultimate_orb","item_void_stone"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Scythe Of Vyse";
        maxCharges = 0;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        sheep_duration = 3.5;
        sheep_movement_speed = 14;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static ScytheOfVyse instance() {
        if( instance == null ){
            instance = new ScytheOfVyse();
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

    public String getKey() {
        return key;
    }

    public int getBonusAgility() {
        return bonus_agility;
    }

    public int getBonusIntellect() {
        return bonus_intellect;
    }

    public int getBonusManaRegen() {
        return bonus_mana_regen;
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

    public double getSheepDuration() {
        return sheep_duration;
    }

    public int getSheepMovementSpeed() {
        return sheep_movement_speed;
    }

    public Vendor[] getVendorLocations() {
        return vendorLocations;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ScytheOfVyse))
            return false;
        if (object == this)
            return true;
        ScytheOfVyse otherObject = (ScytheOfVyse) object;
        return otherObject.getKey().equals(getKey());
    }

}
