package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class HandOfMidas extends Item {

    private static HandOfMidas instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String[] abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_attack_speed;
    private final int bonus_gold;
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
    private final int transmute_cast_range_tooltip;
    private final Vendor[] vendorLocations;
    private final double xp_multiplier;

    private HandOfMidas() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = 0;
        abilityCastRange = 600;
        abilityCooldown = 1;
        abilityManaCost = 0;
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_NOT_ANCIENTS","DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES"};
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_CREEP";
        iD = 65;
        cost = 2050;
        key = "item_hand_of_midas";
        bonus_attack_speed = 30;
        bonus_gold = 190;
        chargeable = false;
        components = new String[]{"item_gloves","item_recipe_hand_of_midas"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Hand Of Midas";
        maxCharges = 0;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        transmute_cast_range_tooltip = 600;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
        xp_multiplier = 2.5;
    }

    public static HandOfMidas instance() {
        if( instance == null ){
            instance = new HandOfMidas();
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

    public String[] getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int getBonusGold() {
        return bonus_gold;
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

    public int getTransmuteCastRangeTooltip() {
        return transmute_cast_range_tooltip;
    }

    public Vendor[] getVendorLocations() {
        return vendorLocations;
    }

    public double getXpMultiplier() {
        return xp_multiplier;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof HandOfMidas))
            return false;
        if (object == this)
            return true;
        HandOfMidas otherObject = (HandOfMidas) object;
        return otherObject.getKey().equals(getKey());
    }

}
