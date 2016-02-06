package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Dagon5 extends Item {

    private static Dagon5 instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final double abilityCooldown;
    private final int abilityManaCost;
    private final String abilitySharedCooldown;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final int itemBaseLevel;
    private final int cost;
    private final String key;
    private final int bonus_all_stats;
    private final int bonus_damage;
    private final int bonus_intellect;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int damage;
    private final int damage_delay;
    private final int initialCharges;
    private final String localizedName;
    private final int maxCharges;
    private final String[] partOf;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int quantity;
    private final int range_tooltip;
    private final boolean recipe;
    private final Shareablilty shareability;
    private final Vendor[] vendorLocations;

    private Dagon5() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = 0;
        abilityCastRange = 800;
        abilityCooldown = 15.0;
        abilityManaCost = 180;
        abilitySharedCooldown = "dagon";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 204;
        itemBaseLevel = 5;
        cost = 7720;
        key = "item_dagon_5";
        bonus_all_stats = 3;
        bonus_damage = 9;
        bonus_intellect = 25;
        chargeable = false;
        components = new String[]{"item_dagon_4","item_recipe_dagon_5"};
        consumable = false;
        damage = 800;
        damage_delay = 0;
        initialCharges = 0;
        localizedName = "Dagon 5";
        maxCharges = 0;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        range_tooltip = 800;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static Dagon5 instance() {
        if( instance == null ){
            instance = new Dagon5();
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

    public double getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilitySharedCooldown() {
        return abilitySharedCooldown;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getID() {
        return iD;
    }

    public int getItemBaseLevel() {
        return itemBaseLevel;
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

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusIntellect() {
        return bonus_intellect;
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

    public int getDamage() {
        return damage;
    }

    public int getDamageDelay() {
        return damage_delay;
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

    public int getRangeTooltip() {
        return range_tooltip;
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
        if (!(object instanceof Dagon5))
            return false;
        if (object == this)
            return true;
        Dagon5 otherObject = (Dagon5) object;
        return otherObject.getKey().equals(getKey());
    }

}
