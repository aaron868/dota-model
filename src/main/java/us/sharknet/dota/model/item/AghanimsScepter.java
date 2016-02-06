package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class AghanimsScepter extends Item {

    private static AghanimsScepter instance;

    private final String abilityBehavior;
    private final int abilityCastRange;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_all_stats;
    private final int bonus_health;
    private final int bonus_mana;
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
    private final Vendor[] vendorLocations;

    private AghanimsScepter() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityCastRange = 600;
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_NOT_CREEP_HERO";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        iD = 108;
        cost = 4200;
        key = "item_ultimate_scepter";
        bonus_all_stats = 10;
        bonus_health = 200;
        bonus_mana = 150;
        chargeable = false;
        components = new String[]{"item_point_booster","item_staff_of_wizardry","item_ogre_axe","item_blade_of_alacrity"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Aghanim's Scepter";
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

    public static AghanimsScepter instance() {
        if( instance == null ){
            instance = new AghanimsScepter();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public String getAbilityUnitTargetFlags() {
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
        if (!(object instanceof AghanimsScepter))
            return false;
        if (object == this)
            return true;
        AghanimsScepter otherObject = (AghanimsScepter) object;
        return otherObject.getKey().equals(getKey());
    }

}
