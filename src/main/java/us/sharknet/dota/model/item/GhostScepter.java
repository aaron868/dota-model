package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class GhostScepter extends Item {

    private static GhostScepter instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final String abilitySharedCooldown;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_all_stats;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int duration;
    private final int extra_spell_damage_percent;
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

    private GhostScepter() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCooldown = 3;
        abilitySharedCooldown = "ethereal";
        iD = 37;
        cost = 1500;
        key = "item_ghost";
        bonus_all_stats = 5;
        chargeable = false;
        components = new String[0];
        consumable = false;
        duration = 4;
        extra_spell_damage_percent = -40;
        initialCharges = 0;
        localizedName = "Ghost Scepter";
        maxCharges = 0;
        partOf = new String[]{"item_ethereal_blade"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static GhostScepter instance() {
        if( instance == null ){
            instance = new GhostScepter();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public String getAbilitySharedCooldown() {
        return abilitySharedCooldown;
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

    public int getExtraSpellDamagePercent() {
        return extra_spell_damage_percent;
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
        if (!(object instanceof GhostScepter))
            return false;
        if (object == this)
            return true;
        GhostScepter otherObject = (GhostScepter) object;
        return otherObject.getKey().equals(getKey());
    }

}
