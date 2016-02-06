package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Perseverance extends Item {

    private static Perseverance instance;

    private final String abilityBehavior;
    private final int iD;
    private final int cost;
    private final boolean disassemblable;
    private final String key;
    private final int bonus_damage;
    private final int bonus_health_regen;
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

    private Perseverance() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 69;
        cost = 1700;
        disassemblable = true;
        key = "item_pers";
        bonus_damage = 10;
        bonus_health_regen = 5;
        bonus_mana_regen = 125;
        chargeable = false;
        components = new String[]{"item_ring_of_health","item_void_stone"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Perseverance";
        maxCharges = 0;
        partOf = new String[]{"item_bfury","item_sphere","item_lotus_orb","item_refresher","item_refresher"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.PARTIALLY_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static Perseverance instance() {
        if( instance == null ){
            instance = new Perseverance();
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

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusHealthRegen() {
        return bonus_health_regen;
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
        if (!(object instanceof Perseverance))
            return false;
        if (object == this)
            return true;
        Perseverance otherObject = (Perseverance) object;
        return otherObject.getKey().equals(getKey());
    }

}
