package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RingOfHealth extends Item {

    private static RingOfHealth instance;

    private final String abilityBehavior;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_health_regen;
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

    private RingOfHealth() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 56;
        cost = 850;
        key = "item_ring_of_health";
        bonus_health_regen = 5;
        chargeable = false;
        components = new String[0];
        consumable = false;
        initialCharges = 0;
        localizedName = "Ring Of Health";
        maxCharges = 0;
        partOf = new String[]{"item_hood_of_defiance","item_vanguard","item_pers","item_aether_lens"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.PARTIALLY_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.SIDE_SHOP,Vendor. FOUNTAIN_SHOP};
    }

    public static RingOfHealth instance() {
        if( instance == null ){
            instance = new RingOfHealth();
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

    public int getBonusHealthRegen() {
        return bonus_health_regen;
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
        if (!(object instanceof RingOfHealth))
            return false;
        if (object == this)
            return true;
        RingOfHealth otherObject = (RingOfHealth) object;
        return otherObject.getKey().equals(getKey());
    }

}
