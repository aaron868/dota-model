package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class StoutShield extends Item {

    private static StoutShield instance;

    private final String abilityBehavior;
    private final int iD;
    private final int cost;
    private final String key;
    private final int block_chance;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int damage_block_melee;
    private final int damage_block_ranged;
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

    private StoutShield() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 182;
        cost = 200;
        key = "item_stout_shield";
        block_chance = 50;
        chargeable = false;
        components = new String[0];
        consumable = false;
        damage_block_melee = 16;
        damage_block_ranged = 8;
        initialCharges = 0;
        localizedName = "Stout Shield";
        maxCharges = 0;
        partOf = new String[]{"item_vanguard","item_poor_mans_shield"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.SIDE_SHOP,Vendor. FOUNTAIN_SHOP};
    }

    public static StoutShield instance() {
        if( instance == null ){
            instance = new StoutShield();
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

    public int getBlockChance() {
        return block_chance;
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

    public int getDamageBlockMelee() {
        return damage_block_melee;
    }

    public int getDamageBlockRanged() {
        return damage_block_ranged;
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
        if (!(object instanceof StoutShield))
            return false;
        if (object == this)
            return true;
        StoutShield otherObject = (StoutShield) object;
        return otherObject.getKey().equals(getKey());
    }

}
