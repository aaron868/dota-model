package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Mekansm extends Item {

    private static Mekansm instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final int cost;
    private final String key;
    private final int aura_health_regen;
    private final int aura_radius;
    private final int bonus_all_stats;
    private final int bonus_armor;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int heal_amount;
    private final int heal_armor_duration;
    private final int heal_bonus_armor;
    private final int heal_radius;
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

    private Mekansm() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 65;
        abilityManaCost = 225;
        iD = 79;
        cost = 2300;
        key = "item_mekansm";
        aura_health_regen = 4;
        aura_radius = 900;
        bonus_all_stats = 5;
        bonus_armor = 5;
        chargeable = false;
        components = new String[]{"item_headdress","item_buckler","item_recipe_mekansm"};
        consumable = false;
        heal_amount = 250;
        heal_armor_duration = 25;
        heal_bonus_armor = 2;
        heal_radius = 900;
        initialCharges = 0;
        localizedName = "Mekansm";
        maxCharges = 0;
        partOf = new String[]{"item_guardian_greaves"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static Mekansm instance() {
        if( instance == null ){
            instance = new Mekansm();
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

    public int getAuraHealthRegen() {
        return aura_health_regen;
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

    public int getHealArmorDuration() {
        return heal_armor_duration;
    }

    public int getHealBonusArmor() {
        return heal_bonus_armor;
    }

    public int getHealRadius() {
        return heal_radius;
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
        if (!(object instanceof Mekansm))
            return false;
        if (object == this)
            return true;
        Mekansm otherObject = (Mekansm) object;
        return otherObject.getKey().equals(getKey());
    }

}
