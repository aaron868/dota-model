package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RingOfBasilius extends Item {

    private static RingOfBasilius instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final int cost;
    private final boolean disassemblable;
    private final String key;
    private final int aura_bonus_armor;
    private final double aura_mana_regen;
    private final int aura_radius;
    private final int bonus_armor;
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

    private RingOfBasilius() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_TOGGLE"};
        iD = 88;
        cost = 500;
        disassemblable = true;
        key = "item_ring_of_basilius";
        aura_bonus_armor = 2;
        aura_mana_regen = .65;
        aura_radius = 900;
        bonus_armor = 1;
        bonus_damage = 6;
        chargeable = false;
        components = new String[]{"item_sobi_mask","item_ring_of_protection"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Ring Of Basilius";
        maxCharges = 0;
        partOf = new String[]{"item_vladmir","item_ring_of_aquila"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static RingOfBasilius instance() {
        if( instance == null ){
            instance = new RingOfBasilius();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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

    public int getAuraBonusArmor() {
        return aura_bonus_armor;
    }

    public double getAuraManaRegen() {
        return aura_mana_regen;
    }

    public int getAuraRadius() {
        return aura_radius;
    }

    public int getBonusArmor() {
        return bonus_armor;
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
        if (!(object instanceof RingOfBasilius))
            return false;
        if (object == this)
            return true;
        RingOfBasilius otherObject = (RingOfBasilius) object;
        return otherObject.getKey().equals(getKey());
    }

}
