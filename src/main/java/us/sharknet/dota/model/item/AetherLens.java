package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class AetherLens extends Item {

    private static AetherLens instance;

    private final String abilityBehavior;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_health_regen;
    private final int bonus_mana;
    private final int cast_range_bonus;
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
    private final int spell_amp;
    private final Vendor[] vendorLocations;

    private AetherLens() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 232;
        cost = 2300;
        key = "item_aether_lens";
        bonus_health_regen = 8;
        bonus_mana = 250;
        cast_range_bonus = 200;
        chargeable = false;
        components = new String[]{"item_energy_booster","item_ring_of_health","item_recipe_aether_lens"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Aether Lens";
        maxCharges = 0;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        spell_amp = 8;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static AetherLens instance() {
        if( instance == null ){
            instance = new AetherLens();
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

    public int getBonusMana() {
        return bonus_mana;
    }

    public int getCastRangeBonus() {
        return cast_range_bonus;
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

    public int getSpellAmp() {
        return spell_amp;
    }

    public Vendor[] getVendorLocations() {
        return vendorLocations;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AetherLens))
            return false;
        if (object == this)
            return true;
        AetherLens otherObject = (AetherLens) object;
        return otherObject.getKey().equals(getKey());
    }

}
