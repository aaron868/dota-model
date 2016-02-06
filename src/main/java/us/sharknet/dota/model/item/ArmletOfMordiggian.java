package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class ArmletOfMordiggian extends Item {

    private static ArmletOfMordiggian instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_armor;
    private final int bonus_attack_speed;
    private final int bonus_damage;
    private final int bonus_health_regen;
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
    private final double toggle_cooldown;
    private final int unholy_bonus_attack_speed;
    private final int unholy_bonus_damage;
    private final int unholy_bonus_strength;
    private final int unholy_health_drain_per_second_tooltip;
    private final int unholy_health_drain_per_tick;
    private final Vendor[] vendorLocations;

    private ArmletOfMordiggian() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_TOGGLE","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL"};
        abilityCooldown = 0;
        iD = 151;
        cost = 2320;
        key = "item_armlet";
        bonus_armor = 5;
        bonus_attack_speed = 25;
        bonus_damage = 9;
        bonus_health_regen = 7;
        chargeable = false;
        components = new String[]{"item_helm_of_iron_will","item_gloves","item_blades_of_attack","item_recipe_armlet"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Armlet Of Mordiggian";
        maxCharges = 0;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        toggle_cooldown = .36;
        unholy_bonus_attack_speed = 0;
        unholy_bonus_damage = 31;
        unholy_bonus_strength = 25;
        unholy_health_drain_per_second_tooltip = 40;
        unholy_health_drain_per_tick = 4;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static ArmletOfMordiggian instance() {
        if( instance == null ){
            instance = new ArmletOfMordiggian();
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

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusHealthRegen() {
        return bonus_health_regen;
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

    public double getToggleCooldown() {
        return toggle_cooldown;
    }

    public int getUnholyBonusAttackSpeed() {
        return unholy_bonus_attack_speed;
    }

    public int getUnholyBonusDamage() {
        return unholy_bonus_damage;
    }

    public int getUnholyBonusStrength() {
        return unholy_bonus_strength;
    }

    public int getUnholyHealthDrainPerSecondTooltip() {
        return unholy_health_drain_per_second_tooltip;
    }

    public int getUnholyHealthDrainPerTick() {
        return unholy_health_drain_per_tick;
    }

    public Vendor[] getVendorLocations() {
        return vendorLocations;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ArmletOfMordiggian))
            return false;
        if (object == this)
            return true;
        ArmletOfMordiggian otherObject = (ArmletOfMordiggian) object;
        return otherObject.getKey().equals(getKey());
    }

}
