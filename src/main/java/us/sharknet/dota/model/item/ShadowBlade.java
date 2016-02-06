package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class ShadowBlade extends Item {

    private static ShadowBlade instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilitySharedCooldown;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_attack_speed;
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
    private final int windwalk_bonus_damage;
    private final int windwalk_duration;
    private final double windwalk_fade_time;
    private final int windwalk_movement_speed;

    private ShadowBlade() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL"};
        abilityCooldown = 28;
        abilityManaCost = 75;
        abilitySharedCooldown = "shadow_blade";
        iD = 152;
        cost = 2800;
        key = "item_invis_sword";
        bonus_attack_speed = 30;
        bonus_damage = 22;
        chargeable = false;
        components = new String[]{"item_shadow_amulet","item_claymore"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Shadow Blade";
        maxCharges = 0;
        partOf = new String[]{"item_silver_edge"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
        windwalk_bonus_damage = 175;
        windwalk_duration = 14;
        windwalk_fade_time = .3;
        windwalk_movement_speed = 20;
    }

    public static ShadowBlade instance() {
        if( instance == null ){
            instance = new ShadowBlade();
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

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
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

    public int getWindwalkBonusDamage() {
        return windwalk_bonus_damage;
    }

    public int getWindwalkDuration() {
        return windwalk_duration;
    }

    public double getWindwalkFadeTime() {
        return windwalk_fade_time;
    }

    public int getWindwalkMovementSpeed() {
        return windwalk_movement_speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ShadowBlade))
            return false;
        if (object == this)
            return true;
        ShadowBlade otherObject = (ShadowBlade) object;
        return otherObject.getKey().equals(getKey());
    }

}
