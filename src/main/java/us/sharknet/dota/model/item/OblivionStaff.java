package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class OblivionStaff extends Item {

    private static OblivionStaff instance;

    private final String abilityBehavior;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_attack_speed;
    private final int bonus_damage;
    private final int bonus_intellect;
    private final int bonus_mana_regen;
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

    private OblivionStaff() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 67;
        cost = 1650;
        key = "item_oblivion_staff";
        bonus_attack_speed = 10;
        bonus_damage = 15;
        bonus_intellect = 6;
        bonus_mana_regen = 75;
        chargeable = false;
        components = new String[]{"item_quarterstaff","item_sobi_mask","item_robe"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Oblivion Staff";
        maxCharges = 0;
        partOf = new String[]{"item_orchid","item_orchid"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static OblivionStaff instance() {
        if( instance == null ){
            instance = new OblivionStaff();
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

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusIntellect() {
        return bonus_intellect;
    }

    public int getBonusManaRegen() {
        return bonus_mana_regen;
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
        if (!(object instanceof OblivionStaff))
            return false;
        if (object == this)
            return true;
        OblivionStaff otherObject = (OblivionStaff) object;
        return otherObject.getKey().equals(getKey());
    }

}
