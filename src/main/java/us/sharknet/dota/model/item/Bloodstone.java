package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Bloodstone extends Item {

    private static Bloodstone instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_damage;
    private final int bonus_health;
    private final int bonus_health_regen;
    private final int bonus_mana;
    private final int bonus_mana_regen;
    private final int charge_range;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int death_gold_reduction;
    private final int heal_on_death_base;
    private final int heal_on_death_per_charge;
    private final int heal_on_death_range;
    private final int initialCharges;
    private final String localizedName;
    private final int maxCharges;
    private final double on_death_removal;
    private final String[] partOf;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int quantity;
    private final boolean recipe;
    private final int respawn_time_reduction;
    private final Shareablilty shareability;
    private final Vendor[] vendorLocations;

    private Bloodstone() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_POINT";
        abilityCastPoint = 0;
        abilityCastRange = 150;
        abilityCooldown = 3;
        iD = 121;
        cost = 4900;
        key = "item_bloodstone";
        bonus_damage = 0;
        bonus_health = 500;
        bonus_health_regen = 9;
        bonus_mana = 400;
        bonus_mana_regen = 200;
        charge_range = 1600;
        chargeable = true;
        components = new String[]{"item_soul_ring","item_soul_booster","item_recipe_bloodstone"};
        consumable = false;
        death_gold_reduction = 0;
        heal_on_death_base = 500;
        heal_on_death_per_charge = 30;
        heal_on_death_range = 1675;
        initialCharges = 8;
        localizedName = "Bloodstone";
        maxCharges = 9999;
        on_death_removal = .67;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        respawn_time_reduction = 3;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static Bloodstone instance() {
        if( instance == null ){
            instance = new Bloodstone();
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

    public int getID() {
        return iD;
    }

    public int getCost() {
        return cost;
    }

    public String getKey() {
        return key;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusHealth() {
        return bonus_health;
    }

    public int getBonusHealthRegen() {
        return bonus_health_regen;
    }

    public int getBonusMana() {
        return bonus_mana;
    }

    public int getBonusManaRegen() {
        return bonus_mana_regen;
    }

    public int getChargeRange() {
        return charge_range;
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

    public int getDeathGoldReduction() {
        return death_gold_reduction;
    }

    public int getHealOnDeathBase() {
        return heal_on_death_base;
    }

    public int getHealOnDeathPerCharge() {
        return heal_on_death_per_charge;
    }

    public int getHealOnDeathRange() {
        return heal_on_death_range;
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

    public double getOnDeathRemoval() {
        return on_death_removal;
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

    public int getRespawnTimeReduction() {
        return respawn_time_reduction;
    }

    public Shareablilty getShareability() {
        return shareability;
    }

    public Vendor[] getVendorLocations() {
        return vendorLocations;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Bloodstone))
            return false;
        if (object == this)
            return true;
        Bloodstone otherObject = (Bloodstone) object;
        return otherObject.getKey().equals(getKey());
    }

}
