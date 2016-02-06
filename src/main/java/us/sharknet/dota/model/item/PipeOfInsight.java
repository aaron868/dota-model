package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class PipeOfInsight extends Item {

    private static PipeOfInsight instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final int cost;
    private final String key;
    private final int aura_health_regen;
    private final int aura_radius;
    private final int barrier_block;
    private final int barrier_block_creep;
    private final int barrier_debuff_duration;
    private final int barrier_duration;
    private final int barrier_radius;
    private final int bonus_all_stats;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int health_regen;
    private final int initialCharges;
    private final String localizedName;
    private final int magic_resistance;
    private final int magic_resistance_aura;
    private final int maxCharges;
    private final String[] partOf;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int quantity;
    private final boolean recipe;
    private final Shareablilty shareability;
    private final Vendor[] vendorLocations;

    private PipeOfInsight() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 6;
        abilityManaCost = 100;
        iD = 90;
        cost = 3500;
        key = "item_pipe";
        aura_health_regen = 4;
        aura_radius = 900;
        barrier_block = 400;
        barrier_block_creep = 400;
        barrier_debuff_duration = 5;
        barrier_duration = 12;
        barrier_radius = 900;
        bonus_all_stats = 0;
        chargeable = false;
        components = new String[]{"item_hood_of_defiance","item_headdress","item_recipe_pipe"};
        consumable = false;
        health_regen = 9;
        initialCharges = 0;
        localizedName = "Pipe Of Insight";
        magic_resistance = 30;
        magic_resistance_aura = 10;
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

    public static PipeOfInsight instance() {
        if( instance == null ){
            instance = new PipeOfInsight();
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

    public int getBarrierBlock() {
        return barrier_block;
    }

    public int getBarrierBlockCreep() {
        return barrier_block_creep;
    }

    public int getBarrierDebuffDuration() {
        return barrier_debuff_duration;
    }

    public int getBarrierDuration() {
        return barrier_duration;
    }

    public int getBarrierRadius() {
        return barrier_radius;
    }

    public int getBonusAllStats() {
        return bonus_all_stats;
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

    public int getHealthRegen() {
        return health_regen;
    }

    public int getInitialCharges() {
        return initialCharges;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMagicResistance() {
        return magic_resistance;
    }

    public int getMagicResistanceAura() {
        return magic_resistance_aura;
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
        if (!(object instanceof PipeOfInsight))
            return false;
        if (object == this)
            return true;
        PipeOfInsight otherObject = (PipeOfInsight) object;
        return otherObject.getKey().equals(getKey());
    }

}
