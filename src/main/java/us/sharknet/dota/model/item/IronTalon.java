package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class IronTalon extends Item {

    private static IronTalon instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final int cost;
    private final String key;
    private final int alternative_cooldown;
    private final int bonus_armor;
    private final int cast_range_ward;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int creep_damage_pct;
    private final int damage_bonus;
    private final int damage_bonus_ranged;
    private final int initialCharges;
    private final String localizedName;
    private final int maxCharges;
    private final String[] partOf;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int quantity;
    private final int quelling_range_tooltip;
    private final boolean recipe;
    private final Shareablilty shareability;
    private final Vendor[] vendorLocations;

    private IronTalon() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = 0;
        abilityCastRange = 350;
        abilityCooldown = 14;
        abilityManaCost = 0;
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_PREFER_ENEMIES";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_CUSTOM";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_TREE","DOTA_UNIT_TARGET_CUSTOM"};
        iD = 239;
        cost = 500;
        key = "item_iron_talon";
        alternative_cooldown = 4;
        bonus_armor = 2;
        cast_range_ward = 450;
        chargeable = false;
        components = new String[]{"item_quelling_blade","item_ring_of_protection","item_recipe_iron_talon"};
        consumable = false;
        creep_damage_pct = 40;
        damage_bonus = 140;
        damage_bonus_ranged = 115;
        initialCharges = 0;
        localizedName = "Iron Talon";
        maxCharges = 0;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        quelling_range_tooltip = 350;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static IronTalon instance() {
        if( instance == null ){
            instance = new IronTalon();
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

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public int getCost() {
        return cost;
    }

    public String getKey() {
        return key;
    }

    public int getAlternativeCooldown() {
        return alternative_cooldown;
    }

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getCastRangeWard() {
        return cast_range_ward;
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

    public int getCreepDamagePct() {
        return creep_damage_pct;
    }

    public int getDamageBonus() {
        return damage_bonus;
    }

    public int getDamageBonusRanged() {
        return damage_bonus_ranged;
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

    public int getQuellingRangeTooltip() {
        return quelling_range_tooltip;
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
        if (!(object instanceof IronTalon))
            return false;
        if (object == this)
            return true;
        IronTalon otherObject = (IronTalon) object;
        return otherObject.getKey().equals(getKey());
    }

}
