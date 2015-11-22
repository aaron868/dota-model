package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class AbyssalBlade extends Item {

    private static AbyssalBlade instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetFlags;
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
    private final int bash_chance_melee;
    private final int bash_chance_ranged;
    private final double bash_cooldown;
    private final double bash_duration;
    private final int bonus_chance_damage;
    private final int bonus_damage;
    private final int bonus_strength;
    private final String localizedName;
    private final int stun_duration;

    private AbyssalBlade() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = 0;
        abilityCastRange = 14;
        abilityCooldown = 6;
        abilityManaCost = 15;
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 28;
        itemAliases = "abyssal blade";
        itemCost = 675;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemDisassembleRule = "DOTA_ITEM_DISASSEMBLE_ALWAYS";
        itemQuality = "epic";
        itemShopTags = new String[]{"damage","str","hard_to_tag"};
        key = "item_abyssal_blade";
        bash_chance_melee = 25;
        bash_chance_ranged = 1;
        bash_cooldown = 2.3;
        bash_duration = 1.4;
        bonus_chance_damage = 6;
        bonus_damage = 85;
        bonus_strength = 1;
        localizedName = "Abyssal Blade";
        stun_duration = 2;
    }

    public static AbyssalBlade instance() {
        if( instance == null ){
            instance = new AbyssalBlade();
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

    public int getBashChanceMelee() {
        return bash_chance_melee;
    }

    public int getBashChanceRanged() {
        return bash_chance_ranged;
    }

    public double getBashCooldown() {
        return bash_cooldown;
    }

    public double getBashDuration() {
        return bash_duration;
    }

    public int getBonusChanceDamage() {
        return bonus_chance_damage;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusStrength() {
        return bonus_strength;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getStunDuration() {
        return stun_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AbyssalBlade))
            return false;
        if (object == this)
            return true;
        AbyssalBlade otherObject = (AbyssalBlade) object;
        return otherObject.getKey().equals(getKey());
    }

}
