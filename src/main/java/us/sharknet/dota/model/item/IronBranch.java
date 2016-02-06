package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class IronBranch extends Item {

    private static IronBranch instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_all_stats;
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
    private final int tree_duration;
    private final Vendor[] vendorLocations;

    private IronBranch() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_POINT";
        abilityCastPoint = 0;
        abilityCastRange = 200;
        abilityCooldown = 0;
        iD = 16;
        cost = 50;
        key = "item_branches";
        bonus_all_stats = 1;
        chargeable = false;
        components = new String[0];
        consumable = false;
        initialCharges = 0;
        localizedName = "Iron Branch";
        maxCharges = 0;
        partOf = new String[]{"item_headdress","item_buckler","item_magic_wand","item_magic_wand"};
        placeable = true;
        placeableDuration = 20;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        tree_duration = 20;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static IronBranch instance() {
        if( instance == null ){
            instance = new IronBranch();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
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

    public int getTreeDuration() {
        return tree_duration;
    }

    public Vendor[] getVendorLocations() {
        return vendorLocations;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof IronBranch))
            return false;
        if (object == this)
            return true;
        IronBranch otherObject = (IronBranch) object;
        return otherObject.getKey().equals(getKey());
    }

}
