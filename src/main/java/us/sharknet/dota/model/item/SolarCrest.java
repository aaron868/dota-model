package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class SolarCrest extends Item {

    private static SolarCrest instance;

    private final String abilityBehavior;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final String abilitySharedCooldown;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final int cost;
    private final boolean disassemblable;
    private final String key;
    private final int allied_armor;
    private final int allied_evasion;
    private final int armor_reduction;
    private final int bonus_armor;
    private final int bonus_evasion;
    private final int bonus_mana_regen_pct;
    private final boolean chargeable;
    private final String[] components;
    private final boolean consumable;
    private final int duration;
    private final int enemy_armor_reduction_tooltip;
    private final int initialCharges;
    private final String localizedName;
    private final int maxCharges;
    private final int miss_chance;
    private final String[] partOf;
    private final boolean placeable;
    private final int placeableDuration;
    private final boolean placeholder;
    private final int quantity;
    private final boolean recipe;
    private final Shareablilty shareability;
    private final int valor_cast_range_tooltip;
    private final Vendor[] vendorLocations;

    private SolarCrest() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastRange = 1000;
        abilityCooldown = 7;
        abilitySharedCooldown = "medallion";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_BOTH";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 229;
        cost = 3000;
        disassemblable = true;
        key = "item_solar_crest";
        allied_armor = 10;
        allied_evasion = 25;
        armor_reduction = -10;
        bonus_armor = 10;
        bonus_evasion = 25;
        bonus_mana_regen_pct = 75;
        chargeable = false;
        components = new String[]{"item_medallion_of_courage","item_talisman_of_evasion"};
        consumable = false;
        duration = 7;
        enemy_armor_reduction_tooltip = 10;
        initialCharges = 0;
        localizedName = "Solar Crest";
        maxCharges = 0;
        miss_chance = 25;
        partOf = new String[0];
        placeable = false;
        placeableDuration = 0;
        placeholder = false;
        quantity = 1;
        recipe = false;
        shareability = Shareablilty.NOT_SHAREABLE;
        valor_cast_range_tooltip = 1000;
        vendorLocations = new Vendor[]{Vendor.FOUNTAIN_SHOP};
    }

    public static SolarCrest instance() {
        if( instance == null ){
            instance = new SolarCrest();
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

    public int getCost() {
        return cost;
    }

    public boolean isDisassemblable() {
        return disassemblable;
    }

    public String getKey() {
        return key;
    }

    public int getAlliedArmor() {
        return allied_armor;
    }

    public int getAlliedEvasion() {
        return allied_evasion;
    }

    public int getArmorReduction() {
        return armor_reduction;
    }

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getBonusEvasion() {
        return bonus_evasion;
    }

    public int getBonusManaRegenPct() {
        return bonus_mana_regen_pct;
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

    public int getDuration() {
        return duration;
    }

    public int getEnemyArmorReductionTooltip() {
        return enemy_armor_reduction_tooltip;
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

    public int getMissChance() {
        return miss_chance;
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

    public int getValorCastRangeTooltip() {
        return valor_cast_range_tooltip;
    }

    public Vendor[] getVendorLocations() {
        return vendorLocations;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SolarCrest))
            return false;
        if (object == this)
            return true;
        SolarCrest otherObject = (SolarCrest) object;
        return otherObject.getKey().equals(getKey());
    }

}
