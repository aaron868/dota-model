package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class ArcaneBoots extends Item {

    private static ArcaneBoots instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final int cost;
    private final boolean disassemblable;
    private final String key;
    private final int bonus_mana;
    private final int bonus_movement;
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
    private final int replenish_amount;
    private final int replenish_radius;
    private final Shareablilty shareability;
    private final Vendor[] vendorLocations;

    private ArcaneBoots() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 55;
        abilityManaCost = 0;
        iD = 180;
        cost = 1300;
        disassemblable = true;
        key = "item_arcane_boots";
        bonus_mana = 250;
        bonus_movement = 50;
        chargeable = false;
        components = new String[]{"item_boots","item_energy_booster"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Arcane Boots";
        maxCharges = 0;
        partOf = new String[]{"item_guardian_greaves"};
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        replenish_amount = 135;
        replenish_radius = 900;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static ArcaneBoots instance() {
        if( instance == null ){
            instance = new ArcaneBoots();
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

    public boolean isDisassemblable() {
        return disassemblable;
    }

    public String getKey() {
        return key;
    }

    public int getBonusMana() {
        return bonus_mana;
    }

    public int getBonusMovement() {
        return bonus_movement;
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

    public int getReplenishAmount() {
        return replenish_amount;
    }

    public int getReplenishRadius() {
        return replenish_radius;
    }

    public Shareablilty getShareability() {
        return shareability;
    }

    public Vendor[] getVendorLocations() {
        return vendorLocations;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ArcaneBoots))
            return false;
        if (object == this)
            return true;
        ArcaneBoots otherObject = (ArcaneBoots) object;
        return otherObject.getKey().equals(getKey());
    }

}
