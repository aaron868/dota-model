package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class BlackKingBar extends Item {

    private static BlackKingBar instance;

    private final String[] abilityBehavior;
    private final int[] abilityCooldown;
    private final int iD;
    private final int cost;
    private final boolean sellable;
    private final String key;
    private final int bonus_damage;
    private final int bonus_strength;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final double[] duration;
    private final int initialCharges;
    private final String localizedName;
    private final int maxCharges;
    private final int max_level;
    private final int model_scale;
    private final String[] partOf;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int quantity;
    private final boolean recipe;
    private final Shareablilty shareability;
    private final Vendor[] vendorLocations;

    private BlackKingBar() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = new int[]{80,75,70,65,60,55};
        iD = 116;
        cost = 3975;
        sellable = true;
        key = "item_black_king_bar";
        bonus_damage = 24;
        bonus_strength = 10;
        chargeable = false;
        components = new String[]{"item_ogre_axe","item_mithril_hammer","item_recipe_black_king_bar"};
        consumable = false;
        duration = new double[]{10.0,9.0,8.0,7.0,6.0,5.0};
        initialCharges = 0;
        localizedName = "Black King Bar";
        maxCharges = 0;
        max_level = 6;
        model_scale = 30;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static BlackKingBar instance() {
        if( instance == null ){
            instance = new BlackKingBar();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getID() {
        return iD;
    }

    public int getCost() {
        return cost;
    }

    public boolean isSellable() {
        return sellable;
    }

    public String getKey() {
        return key;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusStrength() {
        return bonus_strength;
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

    public double[] getDuration() {
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

    public int getMaxLevel() {
        return max_level;
    }

    public int getModelScale() {
        return model_scale;
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
        if (!(object instanceof BlackKingBar))
            return false;
        if (object == this)
            return true;
        BlackKingBar otherObject = (BlackKingBar) object;
        return otherObject.getKey().equals(getKey());
    }

}
