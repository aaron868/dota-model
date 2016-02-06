package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class MagicWand extends Item {

    private static MagicWand instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final String abilitySharedCooldown;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_all_stats;
    private final int charge_radius;
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
    private final int restore_per_charge;
    private final Shareablilty shareability;
    private final Vendor[] vendorLocations;

    private MagicWand() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 13;
        abilitySharedCooldown = "magicwand";
        iD = 36;
        cost = 465;
        key = "item_magic_wand";
        bonus_all_stats = 4;
        charge_radius = 1200;
        chargeable = true;
        components = new String[]{"item_circlet","item_branches","item_branches","item_magic_stick"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Magic Wand";
        maxCharges = 17;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        restore_per_charge = 15;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static MagicWand instance() {
        if( instance == null ){
            instance = new MagicWand();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public String getAbilitySharedCooldown() {
        return abilitySharedCooldown;
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

    public int getBonusAllStats() {
        return bonus_all_stats;
    }

    public int getChargeRadius() {
        return charge_radius;
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

    public int getRestorePerCharge() {
        return restore_per_charge;
    }

    public Shareablilty getShareability() {
        return shareability;
    }

    public Vendor[] getVendorLocations() {
        return vendorLocations;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MagicWand))
            return false;
        if (object == this)
            return true;
        MagicWand otherObject = (MagicWand) object;
        return otherObject.getKey().equals(getKey());
    }

}
