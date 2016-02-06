package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class MaskOfMadness extends Item {

    private static MaskOfMadness instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final int cost;
    private final String key;
    private final int berserk_bonus_attack_speed;
    private final int berserk_bonus_movement_speed;
    private final int berserk_duration;
    private final int berserk_extra_damage;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int initialCharges;
    private final int lifesteal_percent;
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

    private MaskOfMadness() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL"};
        abilityCooldown = 25;
        abilityManaCost = 25;
        iD = 172;
        cost = 1800;
        key = "item_mask_of_madness";
        berserk_bonus_attack_speed = 100;
        berserk_bonus_movement_speed = 17;
        berserk_duration = 12;
        berserk_extra_damage = 30;
        chargeable = false;
        components = new String[]{"item_lifesteal","item_recipe_mask_of_madness"};
        consumable = false;
        initialCharges = 0;
        lifesteal_percent = 20;
        localizedName = "Mask Of Madness";
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

    public static MaskOfMadness instance() {
        if( instance == null ){
            instance = new MaskOfMadness();
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

    public int getBerserkBonusAttackSpeed() {
        return berserk_bonus_attack_speed;
    }

    public int getBerserkBonusMovementSpeed() {
        return berserk_bonus_movement_speed;
    }

    public int getBerserkDuration() {
        return berserk_duration;
    }

    public int getBerserkExtraDamage() {
        return berserk_extra_damage;
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

    public int getLifestealPercent() {
        return lifesteal_percent;
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
        if (!(object instanceof MaskOfMadness))
            return false;
        if (object == this)
            return true;
        MaskOfMadness otherObject = (MaskOfMadness) object;
        return otherObject.getKey().equals(getKey());
    }

}
