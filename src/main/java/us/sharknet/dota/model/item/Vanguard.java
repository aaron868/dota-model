package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Vanguard extends Item {

    private static Vanguard instance;

    private final String abilityBehavior;
    private final int iD;
    private final int cost;
    private final String key;
    private final int block_damage_melee;
    private final int block_damage_ranged;
    private final int bonus_health;
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
    private final Vendor[] vendorLocations;

    private Vanguard() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 125;
        cost = 2150;
        key = "item_vanguard";
        block_damage_melee = 32;
        block_damage_ranged = 16;
        bonus_health = 250;
        bonus_health_regen = 6;
        chargeable = false;
        components = new String[]{"item_ring_of_health","item_vitality_booster","item_stout_shield"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Vanguard";
        maxCharges = 0;
        partOf = new String[]{"item_crimson_guard"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static Vanguard instance() {
        if( instance == null ){
            instance = new Vanguard();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
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

    public int getBlockDamageMelee() {
        return block_damage_melee;
    }

    public int getBlockDamageRanged() {
        return block_damage_ranged;
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
        if (!(object instanceof Vanguard))
            return false;
        if (object == this)
            return true;
        Vanguard otherObject = (Vanguard) object;
        return otherObject.getKey().equals(getKey());
    }

}
