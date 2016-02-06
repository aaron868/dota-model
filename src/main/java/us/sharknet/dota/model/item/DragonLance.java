package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class DragonLance extends Item {

    private static DragonLance instance;

    private final String abilityBehavior;
    private final int iD;
    private final int cost;
    private final boolean disassemblable;
    private final String key;
    private final int base_attack_range;
    private final int bonus_damage;
    private final int bonus_speed;
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

    private DragonLance() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 236;
        cost = 1875;
        disassemblable = true;
        key = "item_dragon_lance";
        base_attack_range = 130;
        bonus_damage = 10;
        bonus_speed = 10;
        bonus_strength = 10;
        chargeable = false;
        components = new String[]{"item_quarterstaff","item_ogre_axe"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Dragon Lance";
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

    public static DragonLance instance() {
        if( instance == null ){
            instance = new DragonLance();
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

    public boolean isDisassemblable() {
        return disassemblable;
    }

    public String getKey() {
        return key;
    }

    public int getBaseAttackRange() {
        return base_attack_range;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusSpeed() {
        return bonus_speed;
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
        if (!(object instanceof DragonLance))
            return false;
        if (object == this)
            return true;
        DragonLance otherObject = (DragonLance) object;
        return otherObject.getKey().equals(getKey());
    }

}
