package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class MonkeyKingBar extends Item {

    private static MonkeyKingBar instance;

    private final String abilityBehavior;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bash_chance;
    private final int bash_damage;
    private final double bash_stun;
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

    private MonkeyKingBar() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 135;
        cost = 5400;
        key = "item_monkey_king_bar";
        bash_chance = 35;
        bash_damage = 160;
        bash_stun = .1;
        bonus_attack_speed = 15;
        bonus_damage = 66;
        chargeable = false;
        components = new String[]{"item_demon_edge","item_javelin","item_javelin"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Monkey King Bar";
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

    public static MonkeyKingBar instance() {
        if( instance == null ){
            instance = new MonkeyKingBar();
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

    public int getBashChance() {
        return bash_chance;
    }

    public int getBashDamage() {
        return bash_damage;
    }

    public double getBashStun() {
        return bash_stun;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MonkeyKingBar))
            return false;
        if (object == this)
            return true;
        MonkeyKingBar otherObject = (MonkeyKingBar) object;
        return otherObject.getKey().equals(getKey());
    }

}
