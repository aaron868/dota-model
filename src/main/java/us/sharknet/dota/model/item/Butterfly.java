package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Butterfly extends Item {

    private static Butterfly instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_agility;
    private final int bonus_attack_speed;
    private final int bonus_damage;
    private final int bonus_evasion;
    private final int bonus_move_speed;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int duration;
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

    private Butterfly() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 35;
        iD = 139;
        cost = 5875;
        key = "item_butterfly";
        bonus_agility = 30;
        bonus_attack_speed = 30;
        bonus_damage = 30;
        bonus_evasion = 35;
        bonus_move_speed = 35;
        chargeable = false;
        components = new String[]{"item_eagle","item_talisman_of_evasion","item_quarterstaff"};
        consumable = false;
        duration = 4;
        initialCharges = 0;
        localizedName = "Butterfly";
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

    public static Butterfly instance() {
        if( instance == null ){
            instance = new Butterfly();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
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

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusEvasion() {
        return bonus_evasion;
    }

    public int getBonusMoveSpeed() {
        return bonus_move_speed;
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
        if (!(object instanceof Butterfly))
            return false;
        if (object == this)
            return true;
        Butterfly otherObject = (Butterfly) object;
        return otherObject.getKey().equals(getKey());
    }

}
