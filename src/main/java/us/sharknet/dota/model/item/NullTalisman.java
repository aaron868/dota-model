package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class NullTalisman extends Item {

    private static NullTalisman instance;

    private final String abilityBehavior;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_agility;
    private final int bonus_damage;
    private final int bonus_intellect;
    private final int bonus_strength;
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

    private NullTalisman() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 77;
        cost = 470;
        key = "item_null_talisman";
        bonus_agility = 3;
        bonus_damage = 3;
        bonus_intellect = 6;
        bonus_strength = 3;
        chargeable = false;
        components = new String[]{"item_circlet","item_mantle","item_recipe_null_talisman"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Null Talisman";
        maxCharges = 0;
        partOf = new String[]{"item_dagon","item_veil_of_discord"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static NullTalisman instance() {
        if( instance == null ){
            instance = new NullTalisman();
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

    public int getBonusAgility() {
        return bonus_agility;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusIntellect() {
        return bonus_intellect;
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
        if (!(object instanceof NullTalisman))
            return false;
        if (object == this)
            return true;
        NullTalisman otherObject = (NullTalisman) object;
        return otherObject.getKey().equals(getKey());
    }

}
