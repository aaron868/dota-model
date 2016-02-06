package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class VladmirsOffering extends Item {

    private static VladmirsOffering instance;

    private final String abilityBehavior;
    private final int iD;
    private final int cost;
    private final String key;
    private final int armor_aura;
    private final int aura_radius;
    private final int bonus_all_stats;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int damage_aura;
    private final int hp_regen;
    private final int initialCharges;
    private final String localizedName;
    private final double mana_regen_aura;
    private final int maxCharges;
    private final String[] partOf;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int quantity;
    private final boolean recipe;
    private final Shareablilty shareability;
    private final int vampiric_aura;
    private final int vampiric_aura_ranged;
    private final Vendor[] vendorLocations;

    private VladmirsOffering() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 81;
        cost = 2300;
        key = "item_vladmir";
        armor_aura = 5;
        aura_radius = 900;
        bonus_all_stats = 2;
        chargeable = false;
        components = new String[]{"item_headdress","item_ring_of_basilius","item_lifesteal","item_recipe_vladmir"};
        consumable = false;
        damage_aura = 15;
        hp_regen = 3;
        initialCharges = 0;
        localizedName = "Vladmir's Offering";
        mana_regen_aura = .8;
        maxCharges = 0;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vampiric_aura = 15;
        vampiric_aura_ranged = 10;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static VladmirsOffering instance() {
        if( instance == null ){
            instance = new VladmirsOffering();
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

    public int getArmorAura() {
        return armor_aura;
    }

    public int getAuraRadius() {
        return aura_radius;
    }

    public int getBonusAllStats() {
        return bonus_all_stats;
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

    public int getDamageAura() {
        return damage_aura;
    }

    public int getHpRegen() {
        return hp_regen;
    }

    public int getInitialCharges() {
        return initialCharges;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public double getManaRegenAura() {
        return mana_regen_aura;
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

    public int getVampiricAura() {
        return vampiric_aura;
    }

    public int getVampiricAuraRanged() {
        return vampiric_aura_ranged;
    }

    public Vendor[] getVendorLocations() {
        return vendorLocations;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof VladmirsOffering))
            return false;
        if (object == this)
            return true;
        VladmirsOffering otherObject = (VladmirsOffering) object;
        return otherObject.getKey().equals(getKey());
    }

}
