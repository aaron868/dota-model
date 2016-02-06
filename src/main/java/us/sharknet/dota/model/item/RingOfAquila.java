package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RingOfAquila extends Item {

    private static RingOfAquila instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final int cost;
    private final boolean disassemblable;
    private final String key;
    private final int aura_bonus_armor;
    private final double aura_mana_regen;
    private final int aura_radius;
    private final int bonus_agility;
    private final int bonus_armor;
    private final int bonus_damage;
    private final int bonus_intellect;
    private final int bonus_strength;
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

    private RingOfAquila() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_TOGGLE"};
        iD = 212;
        cost = 985;
        disassemblable = true;
        key = "item_ring_of_aquila";
        aura_bonus_armor = 2;
        aura_mana_regen = .65;
        aura_radius = 900;
        bonus_agility = 9;
        bonus_armor = 1;
        bonus_damage = 9;
        bonus_intellect = 3;
        bonus_strength = 3;
        chargeable = false;
        components = new String[]{"item_wraith_band","item_ring_of_basilius"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Ring Of Aquila";
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

    public static RingOfAquila instance() {
        if( instance == null ){
            instance = new RingOfAquila();
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

    public int getBonusAgility() {
        return bonus_agility;
    }

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusIntellect() {
        return bonus_intellect;
    }

    public int getBonusStrength() {
        return bonus_strength;
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
        if (!(object instanceof RingOfAquila))
            return false;
        if (object == this)
            return true;
        RingOfAquila otherObject = (RingOfAquila) object;
        return otherObject.getKey().equals(getKey());
    }

}
