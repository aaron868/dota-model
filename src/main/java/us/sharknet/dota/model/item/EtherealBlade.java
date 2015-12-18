package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class EtherealBlade extends Item {

    private static EtherealBlade instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilitySharedCooldown;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemDisassembleRule;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int blast_agility_multiplier;
    private final int blast_damage_base;
    private final int blast_movement_slow;
    private final int bonus_agility;
    private final int bonus_intellect;
    private final int bonus_strength;
    private final int duration;
    private final int duration_ally;
    private final int ethereal_damage_bonus;
    private final String localizedName;
    private final int projectile_speed;

    private EtherealBlade() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = 0;
        abilityCastRange = 800;
        abilityCooldown = 2;
        abilityManaCost = 100;
        abilitySharedCooldown = "ethereal";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY","DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_CREEP"};
        fightRecapLevel = 1;
        iD = 176;
        itemAliases = new String[]{"eb","ethereal blade"};
        itemCost = 4700;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemDisassembleRule = "DOTA_ITEM_DISASSEMBLE_ALWAYS";
        itemQuality = "epic";
        itemShopTags = new String[]{"agi","str","int","hard_to_tag"};
        key = "item_ethereal_blade";
        blast_agility_multiplier = 2;
        blast_damage_base = 75;
        blast_movement_slow = -80;
        bonus_agility = 40;
        bonus_intellect = 10;
        bonus_strength = 10;
        duration = 3;
        duration_ally = 4;
        ethereal_damage_bonus = -40;
        localizedName = "Ethereal Blade";
        projectile_speed = 1200;
    }

    public static EtherealBlade instance() {
        if( instance == null ){
            instance = new EtherealBlade();
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

    public String getAbilitySharedCooldown() {
        return abilitySharedCooldown;
    }

    public String[] getAbilityUnitTargetTeam() {
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

    public String[] getItemAliases() {
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

    public int getBlastAgilityMultiplier() {
        return blast_agility_multiplier;
    }

    public int getBlastDamageBase() {
        return blast_damage_base;
    }

    public int getBlastMovementSlow() {
        return blast_movement_slow;
    }

    public int getBonusAgility() {
        return bonus_agility;
    }

    public int getBonusIntellect() {
        return bonus_intellect;
    }

    public int getBonusStrength() {
        return bonus_strength;
    }

    public int getDuration() {
        return duration;
    }

    public int getDurationAlly() {
        return duration_ally;
    }

    public int getEtherealDamageBonus() {
        return ethereal_damage_bonus;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getProjectileSpeed() {
        return projectile_speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EtherealBlade))
            return false;
        if (object == this)
            return true;
        EtherealBlade otherObject = (EtherealBlade) object;
        return otherObject.getKey().equals(getKey());
    }

}
