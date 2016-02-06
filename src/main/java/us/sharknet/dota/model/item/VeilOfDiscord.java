package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class VeilOfDiscord extends Item {

    private static VeilOfDiscord instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final int cost;
    private final String key;
    private final int bonus_agi;
    private final int bonus_armor;
    private final int bonus_damage;
    private final int bonus_health_regen;
    private final int bonus_int;
    private final int bonus_str;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int debuff_radius;
    private final int initialCharges;
    private final String localizedName;
    private final int maxCharges;
    private final String[] partOf;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int quantity;
    private final boolean recipe;
    private final int resist_debuff;
    private final int resist_debuff_duration;
    private final Shareablilty shareability;
    private final Vendor[] vendorLocations;

    private VeilOfDiscord() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_DONT_CANCEL_MOVEMENT"};
        abilityCastPoint = 0;
        abilityCastRange = 1000;
        abilityCooldown = 20;
        abilityManaCost = 50;
        iD = 190;
        cost = 2270;
        key = "item_veil_of_discord";
        bonus_agi = 6;
        bonus_armor = 6;
        bonus_damage = 6;
        bonus_health_regen = 6;
        bonus_int = 18;
        bonus_str = 6;
        chargeable = false;
        components = new String[]{"item_helm_of_iron_will","item_null_talisman","item_robe","item_robe"};
        consumable = false;
        debuff_radius = 600;
        initialCharges = 0;
        localizedName = "Veil Of Discord";
        maxCharges = 0;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        resist_debuff = -25;
        resist_debuff_duration = 16;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static VeilOfDiscord instance() {
        if( instance == null ){
            instance = new VeilOfDiscord();
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

    public int getBonusAgi() {
        return bonus_agi;
    }

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusHealthRegen() {
        return bonus_health_regen;
    }

    public int getBonusInt() {
        return bonus_int;
    }

    public int getBonusStr() {
        return bonus_str;
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

    public int getDebuffRadius() {
        return debuff_radius;
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

    public int getResistDebuff() {
        return resist_debuff;
    }

    public int getResistDebuffDuration() {
        return resist_debuff_duration;
    }

    public Shareablilty getShareability() {
        return shareability;
    }

    public Vendor[] getVendorLocations() {
        return vendorLocations;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof VeilOfDiscord))
            return false;
        if (object == this)
            return true;
        VeilOfDiscord otherObject = (VeilOfDiscord) object;
        return otherObject.getKey().equals(getKey());
    }

}
