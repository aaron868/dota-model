package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class HeavensHalberd extends Item {

    private static HeavensHalberd instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
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
    private final int bonus_damage;
    private final int bonus_evasion;
    private final int bonus_strength;
    private final int disarm_cast_range_tooltip;
    private final int disarm_melee;
    private final double disarm_range;
    private final String localizedName;
    private final int maim_attack_speed;
    private final int maim_chance;
    private final int maim_duration;
    private final int maim_movement_speed;

    private HeavensHalberd() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = 0;
        abilityCastRange = 600;
        abilityCooldown = 30;
        abilityManaCost = 100;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 210;
        itemAliases = "heaven's halberd";
        itemCost = 3850;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemDisassembleRule = "DOTA_ITEM_DISASSEMBLE_ALWAYS";
        itemQuality = "artifact";
        itemShopTags = new String[]{"str","damage","evasion"};
        key = "item_heavens_halberd";
        bonus_damage = 25;
        bonus_evasion = 25;
        bonus_strength = 20;
        disarm_cast_range_tooltip = 600;
        disarm_melee = 3;
        disarm_range = 4.5;
        localizedName = "Heaven's Halberd";
        maim_attack_speed = -20;
        maim_chance = 15;
        maim_duration = 4;
        maim_movement_speed = -20;
    }

    public static HeavensHalberd instance() {
        if( instance == null ){
            instance = new HeavensHalberd();
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

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusEvasion() {
        return bonus_evasion;
    }

    public int getBonusStrength() {
        return bonus_strength;
    }

    public int getDisarmCastRangeTooltip() {
        return disarm_cast_range_tooltip;
    }

    public int getDisarmMelee() {
        return disarm_melee;
    }

    public double getDisarmRange() {
        return disarm_range;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaimAttackSpeed() {
        return maim_attack_speed;
    }

    public int getMaimChance() {
        return maim_chance;
    }

    public int getMaimDuration() {
        return maim_duration;
    }

    public int getMaimMovementSpeed() {
        return maim_movement_speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof HeavensHalberd))
            return false;
        if (object == this)
            return true;
        HeavensHalberd otherObject = (HeavensHalberd) object;
        return otherObject.getKey().equals(getKey());
    }

}
