package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class HoodOfDefiance extends Item {

    private static HoodOfDefiance instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final int cost;
    private final String key;
    private final int barrier_block;
    private final int barrier_duration;
    private final int bonus_health_regen;
    private final int bonus_spell_resist;
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

    private HoodOfDefiance() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 6;
        abilityManaCost = 75;
        iD = 131;
        cost = 2100;
        key = "item_hood_of_defiance";
        barrier_block = 325;
        barrier_duration = 12;
        bonus_health_regen = 9;
        bonus_spell_resist = 30;
        chargeable = false;
        components = new String[]{"item_ring_of_health","item_cloak","item_ring_of_regen","item_ring_of_regen"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Hood Of Defiance";
        maxCharges = 0;
        partOf = new String[]{"item_pipe"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static HoodOfDefiance instance() {
        if( instance == null ){
            instance = new HoodOfDefiance();
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

    public int getBarrierBlock() {
        return barrier_block;
    }

    public int getBarrierDuration() {
        return barrier_duration;
    }

    public int getBonusHealthRegen() {
        return bonus_health_regen;
    }

    public int getBonusSpellResist() {
        return bonus_spell_resist;
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
        if (!(object instanceof HoodOfDefiance))
            return false;
        if (object == this)
            return true;
        HoodOfDefiance otherObject = (HoodOfDefiance) object;
        return otherObject.getKey().equals(getKey());
    }

}
