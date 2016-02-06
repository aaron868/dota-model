package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class LotusOrb extends Item {

    private static LotusOrb instance;

    private final String abilityBehavior;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final int cost;
    private final boolean disassemblable;
    private final String key;
    private final int active_duration;
    private final int bonus_armor;
    private final int bonus_damage;
    private final int bonus_health_regen;
    private final int bonus_mana_regen;
    private final int cast_range_tooltip;
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

    private LotusOrb() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastRange = 900;
        abilityCooldown = 15;
        abilityManaCost = 75;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        iD = 226;
        cost = 4000;
        disassemblable = true;
        key = "item_lotus_orb";
        active_duration = 6;
        bonus_armor = 10;
        bonus_damage = 10;
        bonus_health_regen = 5;
        bonus_mana_regen = 125;
        cast_range_tooltip = 9;
        chargeable = false;
        components = new String[]{"item_pers","item_platemail","item_recipe_lotus_orb"};
        consumable = false;
        initialCharges = 0;
        localizedName = "Lotus Orb";
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

    public static LotusOrb instance() {
        if( instance == null ){
            instance = new LotusOrb();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
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

    public boolean isDisassemblable() {
        return disassemblable;
    }

    public String getKey() {
        return key;
    }

    public int getActiveDuration() {
        return active_duration;
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

    public int getBonusManaRegen() {
        return bonus_mana_regen;
    }

    public int getCastRangeTooltip() {
        return cast_range_tooltip;
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
        if (!(object instanceof LotusOrb))
            return false;
        if (object == this)
            return true;
        LotusOrb otherObject = (LotusOrb) object;
        return otherObject.getKey().equals(getKey());
    }

}
