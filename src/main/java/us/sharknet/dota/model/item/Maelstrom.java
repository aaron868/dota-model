package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Maelstrom extends Item {

    private static Maelstrom instance;

    private final String abilityBehavior;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_attack_speed;
    private final int bonus_damage;
    private final int chain_chance;
    private final int chain_cooldown;
    private final int chain_damage;
    private final double chain_delay;
    private final int chain_radius;
    private final int chain_strikes;
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

    private Maelstrom() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 166;
        cost = 2800;
        key = "item_maelstrom";
        bonus_attack_speed = 25;
        bonus_damage = 24;
        chain_chance = 25;
        chain_cooldown = 0;
        chain_damage = 120;
        chain_delay = .25;
        chain_radius = 900;
        chain_strikes = 4;
        chargeable = false;
        components = new String[]{"item_mithril_hammer","item_gloves","item_recipe_maelstrom"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Maelstrom";
        maxCharges = 0;
        partOf = new String[]{"item_mjollnir"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static Maelstrom instance() {
        if( instance == null ){
            instance = new Maelstrom();
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

    public int getChainChance() {
        return chain_chance;
    }

    public int getChainCooldown() {
        return chain_cooldown;
    }

    public int getChainDamage() {
        return chain_damage;
    }

    public double getChainDelay() {
        return chain_delay;
    }

    public int getChainRadius() {
        return chain_radius;
    }

    public int getChainStrikes() {
        return chain_strikes;
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
        if (!(object instanceof Maelstrom))
            return false;
        if (object == this)
            return true;
        Maelstrom otherObject = (Maelstrom) object;
        return otherObject.getKey().equals(getKey());
    }

}
