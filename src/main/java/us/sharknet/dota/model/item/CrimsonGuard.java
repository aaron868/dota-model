package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class CrimsonGuard extends Item {

    private static CrimsonGuard instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int iD;
    private final int cost;
    private final String key;
    private final int block_chance_active;
    private final int block_damage_melee;
    private final int block_damage_melee_active;
    private final int block_damage_ranged;
    private final int block_damage_ranged_active;
    private final int bonus_all_stats;
    private final int bonus_aoe_armor;
    private final int bonus_aoe_radius;
    private final int bonus_armor;
    private final int bonus_health;
    private final int bonus_health_regen;
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
    private final boolean recipe;
    private final Shareablilty shareability;
    private final Vendor[] vendorLocations;

    private CrimsonGuard() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 6;
        iD = 242;
        cost = 3550;
        key = "item_crimson_guard";
        block_chance_active = 100;
        block_damage_melee = 32;
        block_damage_melee_active = 55;
        block_damage_ranged = 16;
        block_damage_ranged_active = 55;
        bonus_all_stats = 2;
        bonus_aoe_armor = 2;
        bonus_aoe_radius = 900;
        bonus_armor = 5;
        bonus_health = 250;
        bonus_health_regen = 6;
        chargeable = false;
        components = new String[]{"item_vanguard","item_buckler","item_recipe_crimson_guard"};
        consumable = false;
        duration = 10;
        initialCharges = 0;
        localizedName = "Crimson Guard";
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

    public static CrimsonGuard instance() {
        if( instance == null ){
            instance = new CrimsonGuard();
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

    public int getBlockChanceActive() {
        return block_chance_active;
    }

    public int getBlockDamageMelee() {
        return block_damage_melee;
    }

    public int getBlockDamageMeleeActive() {
        return block_damage_melee_active;
    }

    public int getBlockDamageRanged() {
        return block_damage_ranged;
    }

    public int getBlockDamageRangedActive() {
        return block_damage_ranged_active;
    }

    public int getBonusAllStats() {
        return bonus_all_stats;
    }

    public int getBonusAoeArmor() {
        return bonus_aoe_armor;
    }

    public int getBonusAoeRadius() {
        return bonus_aoe_radius;
    }

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getBonusHealth() {
        return bonus_health;
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
        if (!(object instanceof CrimsonGuard))
            return false;
        if (object == this)
            return true;
        CrimsonGuard otherObject = (CrimsonGuard) object;
        return otherObject.getKey().equals(getKey());
    }

}
