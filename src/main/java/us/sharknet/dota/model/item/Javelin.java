package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Javelin extends Item {

    private static Javelin instance;

    private final String abilityBehavior;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_chance;
    private final int bonus_chance_damage;
    private final int bonus_damage;
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

    private Javelin() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 7;
        cost = 1500;
        key = "item_javelin";
        bonus_chance = 25;
        bonus_chance_damage = 85;
        bonus_damage = 10;
        chargeable = false;
        components = new String[0];
        consumable = false;
        initialCharges = 0;
        localizedName = "Javelin";
        maxCharges = 0;
        partOf = new String[]{"item_basher","item_monkey_king_bar","item_monkey_king_bar"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static Javelin instance() {
        if( instance == null ){
            instance = new Javelin();
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

    public int getBonusChance() {
        return bonus_chance;
    }

    public int getBonusChanceDamage() {
        return bonus_chance_damage;
    }

    public int getBonusDamage() {
        return bonus_damage;
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
        if (!(object instanceof Javelin))
            return false;
        if (object == this)
            return true;
        Javelin otherObject = (Javelin) object;
        return otherObject.getKey().equals(getKey());
    }

}
