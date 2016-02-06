package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class SoulRing extends Item {

    private static SoulRing instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final int cost;
    private final String key;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int duration;
    private final int health_regen;
    private final int health_sacrifice;
    private final int initialCharges;
    private final String localizedName;
    private final int mana_gain;
    private final int mana_regen;
    private final int maxCharges;
    private final String[] partOf;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int quantity;
    private final boolean recipe;
    private final Shareablilty shareability;
    private final Vendor[] vendorLocations;

    private SoulRing() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCooldown = 3;
        abilityManaCost = 0;
        iD = 178;
        cost = 800;
        key = "item_soul_ring";
        chargeable = false;
        components = new String[]{"item_ring_of_regen","item_sobi_mask","item_recipe_soul_ring"};
        consumable = false;
        duration = 10;
        health_regen = 3;
        health_sacrifice = 150;
        initialCharges = 0;
        localizedName = "Soul Ring";
        mana_gain = 150;
        mana_regen = 50;
        maxCharges = 0;
        partOf = new String[]{"item_bloodstone"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static SoulRing instance() {
        if( instance == null ){
            instance = new SoulRing();
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

    public int getHealthRegen() {
        return health_regen;
    }

    public int getHealthSacrifice() {
        return health_sacrifice;
    }

    public int getInitialCharges() {
        return initialCharges;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getManaGain() {
        return mana_gain;
    }

    public int getManaRegen() {
        return mana_regen;
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
        if (!(object instanceof SoulRing))
            return false;
        if (object == this)
            return true;
        SoulRing otherObject = (SoulRing) object;
        return otherObject.getKey().equals(getKey());
    }

}
