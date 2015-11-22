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
    private final int fightRecapLevel;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemDisassembleRule;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int allied_armor;
    private final int allied_evasion;
    private final int armor_reduction;
    private final int bonus_armor;
    private final int bonus_evasion;
    private final int bonus_mana_regen_pct;
    private final int duration;
    private final int enemy_armor_reduction_tooltip;
    private final String localizedName;
    private final int miss_chance;
    private final int valor_cast_range_tooltip;

    private SolarCrest() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastRange = 1000;
        abilityCooldown = 7;
        abilitySharedCooldown = "medallion";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_BOTH";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 229;
        itemAliases = "solar crest";
        itemCost = 3000;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemDisassembleRule = "DOTA_ITEM_DISASSEMBLE_ALWAYS";
        itemQuality = "rare";
        itemShopTags = new String[]{"armor","regen_mana","hard_to_tag"};
        key = "item_solar_crest";
        allied_armor = 10;
        allied_evasion = 25;
        armor_reduction = -10;
        bonus_armor = 10;
        bonus_evasion = 25;
        bonus_mana_regen_pct = 75;
        duration = 7;
        enemy_armor_reduction_tooltip = 10;
        localizedName = "Solar Crest";
        miss_chance = 25;
        valor_cast_range_tooltip = 1000;
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

    public int getFightRecapLevel() {
        return fightRecapLevel;
    }

    public int getID() {
        return iD;
    }

    public String getItemAliases() {
        return itemAliases;
    }

    public int getItemCost() {
        return itemCost;
    }

    public String[] getItemDeclarations() {
        return itemDeclarations;
    }

    public String getItemDisassembleRule() {
        return itemDisassembleRule;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public String[] getItemShopTags() {
        return itemShopTags;
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

    public int getDuration() {
        return duration;
    }

    public int getEnemyArmorReductionTooltip() {
        return enemy_armor_reduction_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMissChance() {
        return miss_chance;
    }

    public int getValorCastRangeTooltip() {
        return valor_cast_range_tooltip;
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
