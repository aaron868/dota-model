package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Buckler extends Item {

    private static Buckler instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_all_stats;
    private final int bonus_aoe_armor;
    private final int bonus_aoe_duration;
    private final int bonus_aoe_duration_hero;
    private final int bonus_aoe_radius;
    private final int bonus_armor;
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

    private Buckler() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 25;
        abilityManaCost = 10;
        iD = 86;
        cost = 800;
        key = "item_buckler";
        bonus_all_stats = 2;
        bonus_aoe_armor = 2;
        bonus_aoe_duration = 3;
        bonus_aoe_duration_hero = 25;
        bonus_aoe_radius = 900;
        bonus_armor = 5;
        chargeable = false;
        components = new String[]{"item_chainmail","item_branches","item_recipe_buckler"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Buckler";
        maxCharges = 0;
        partOf = new String[]{"item_mekansm","item_crimson_guard"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static Buckler instance() {
        if( instance == null ){
            instance = new Buckler();
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

    public int getBonusAllStats() {
        return bonus_all_stats;
    }

    public int getBonusAoeArmor() {
        return bonus_aoe_armor;
    }

    public int getBonusAoeDuration() {
        return bonus_aoe_duration;
    }

    public int getBonusAoeDurationHero() {
        return bonus_aoe_duration_hero;
    }

    public int getBonusAoeRadius() {
        return bonus_aoe_radius;
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
        if (!(object instanceof Buckler))
            return false;
        if (object == this)
            return true;
        Buckler otherObject = (Buckler) object;
        return otherObject.getKey().equals(getKey());
    }

}
