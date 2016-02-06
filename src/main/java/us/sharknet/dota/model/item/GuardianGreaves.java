package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class GuardianGreaves extends Item {

    private static GuardianGreaves instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final int cost;
    private final String key;
    private final int aura_armor;
    private final int aura_armor_bonus;
    private final int aura_bonus_threshold;
    private final int aura_health_regen;
    private final int aura_health_regen_bonus;
    private final int aura_radius;
    private final int bonus_all_stats;
    private final int bonus_armor;
    private final int bonus_mana;
    private final int bonus_movement;
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
    private final int replenish_health;
    private final int replenish_mana;
    private final int replenish_radius;
    private final Shareablilty shareability;
    private final Vendor[] vendorLocations;

    private GuardianGreaves() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 40;
        abilityManaCost = 0;
        iD = 231;
        cost = 5250;
        key = "item_guardian_greaves";
        aura_armor = 2;
        aura_armor_bonus = 15;
        aura_bonus_threshold = 20;
        aura_health_regen = 4;
        aura_health_regen_bonus = 15;
        aura_radius = 900;
        bonus_all_stats = 5;
        bonus_armor = 5;
        bonus_mana = 250;
        bonus_movement = 55;
        chargeable = false;
        components = new String[]{"item_mekansm","item_arcane_boots","item_recipe_guardian_greaves"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Guardian Greaves";
        maxCharges = 0;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        replenish_health = 250;
        replenish_mana = 160;
        replenish_radius = 900;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static GuardianGreaves instance() {
        if( instance == null ){
            instance = new GuardianGreaves();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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

    public int getAuraArmor() {
        return aura_armor;
    }

    public int getAuraArmorBonus() {
        return aura_armor_bonus;
    }

    public int getAuraBonusThreshold() {
        return aura_bonus_threshold;
    }

    public int getAuraHealthRegen() {
        return aura_health_regen;
    }

    public int getAuraHealthRegenBonus() {
        return aura_health_regen_bonus;
    }

    public int getAuraRadius() {
        return aura_radius;
    }

    public int getBonusAllStats() {
        return bonus_all_stats;
    }

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getBonusMana() {
        return bonus_mana;
    }

    public int getBonusMovement() {
        return bonus_movement;
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

    public int getReplenishHealth() {
        return replenish_health;
    }

    public int getReplenishMana() {
        return replenish_mana;
    }

    public int getReplenishRadius() {
        return replenish_radius;
    }

    public Shareablilty getShareability() {
        return shareability;
    }

    public Vendor[] getVendorLocations() {
        return vendorLocations;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof GuardianGreaves))
            return false;
        if (object == this)
            return true;
        GuardianGreaves otherObject = (GuardianGreaves) object;
        return otherObject.getKey().equals(getKey());
    }

}
