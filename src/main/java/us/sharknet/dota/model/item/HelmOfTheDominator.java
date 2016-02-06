package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class HelmOfTheDominator extends Item {

    private static HelmOfTheDominator instance;

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
    private final boolean disassemblable;
    private final String key;
    private final int bonus_armor;
    private final int bonus_damage;
    private final int bonus_regen;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int dominate_duration;
    private final int health_min;
    private final int initialCharges;
    private final int lifesteal_percent;
    private final String localizedName;
    private final int maxCharges;
    private final String[] partOf;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int quantity;
    private final boolean recipe;
    private final Shareablilty shareability;
    private final int speed_base;
    private final Vendor[] vendorLocations;

    private HelmOfTheDominator() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = 0;
        abilityCastRange = 700;
        abilityCooldown = 6;
        abilityManaCost = 75;
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_NOT_ANCIENTS","DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES"};
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_CREEP";
        iD = 164;
        cost = 1800;
        disassemblable = true;
        key = "item_helm_of_the_dominator";
        bonus_armor = 5;
        bonus_damage = 20;
        bonus_regen = 3;
        chargeable = false;
        components = new String[]{"item_lifesteal","item_helm_of_iron_will"};
        consumable = false;
        dominate_duration = 12;
        health_min = 1400;
        initialCharges = 0;
        lifesteal_percent = 15;
        localizedName = "Helm Of The Dominator";
        maxCharges = 0;
        partOf = new String[]{"item_satanic"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        speed_base = 350;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static HelmOfTheDominator instance() {
        if( instance == null ){
            instance = new HelmOfTheDominator();
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

    public boolean isDisassemblable() {
        return disassemblable;
    }

    public String getKey() {
        return key;
    }

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusRegen() {
        return bonus_regen;
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

    public int getDominateDuration() {
        return dominate_duration;
    }

    public int getHealthMin() {
        return health_min;
    }

    public int getInitialCharges() {
        return initialCharges;
    }

    public int getLifestealPercent() {
        return lifesteal_percent;
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

    public int getSpeedBase() {
        return speed_base;
    }

    public Vendor[] getVendorLocations() {
        return vendorLocations;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof HelmOfTheDominator))
            return false;
        if (object == this)
            return true;
        HelmOfTheDominator otherObject = (HelmOfTheDominator) object;
        return otherObject.getKey().equals(getKey());
    }

}
