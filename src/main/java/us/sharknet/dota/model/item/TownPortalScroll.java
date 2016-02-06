package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class TownPortalScroll extends Item {

    private static TownPortalScroll instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityChannelTime;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilitySharedCooldown;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final int cost;
    private final boolean stackable;
    private final String key;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int initialCharges;
    private final String localizedName;
    private final int maxCharges;
    private final int maximum_distance;
    private final int minimun_distance;
    private final String[] partOf;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int quantity;
    private final boolean recipe;
    private final Shareablilty shareability;
    private final Vendor[] vendorLocations;
    private final int vision_radius;

    private TownPortalScroll() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_CHANNELLED","DOTA_ABILITY_BEHAVIOR_NOASSIST","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = 0;
        abilityCastRange = 0;
        abilityChannelTime = 3;
        abilityCooldown = 7;
        abilityManaCost = 75;
        abilitySharedCooldown = "teleport";
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_INVULNERABLE";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_BUILDING";
        iD = 46;
        cost = 75;
        stackable = true;
        key = "item_tpscroll";
        chargeable = false;
        components = new String[0];
        consumable = true;
        initialCharges = 0;
        localizedName = "Town Portal Scroll";
        maxCharges = 0;
        maximum_distance = 575;
        minimun_distance = 70;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.FULLY_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.SIDE_SHOP,Vendor. FOUNTAIN_SHOP};
        vision_radius = 200;
    }

    public static TownPortalScroll instance() {
        if( instance == null ){
            instance = new TownPortalScroll();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityChannelTime() {
        return abilityChannelTime;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilitySharedCooldown() {
        return abilitySharedCooldown;
    }

    public String getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getID() {
        return iD;
    }

    public int getCost() {
        return cost;
    }

    public boolean isStackable() {
        return stackable;
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

    public int getInitialCharges() {
        return initialCharges;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaxCharges() {
        return maxCharges;
    }

    public int getMaximumDistance() {
        return maximum_distance;
    }

    public int getMinimunDistance() {
        return minimun_distance;
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

    public int getVisionRadius() {
        return vision_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TownPortalScroll))
            return false;
        if (object == this)
            return true;
        TownPortalScroll otherObject = (TownPortalScroll) object;
        return otherObject.getKey().equals(getKey());
    }

}
