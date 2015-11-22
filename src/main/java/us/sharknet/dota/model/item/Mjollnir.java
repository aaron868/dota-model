package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Mjollnir extends Item {

    private static Mjollnir instance;

    private final String abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemDisassembleRule;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_attack_speed;
    private final int bonus_damage;
    private final int chain_chance;
    private final double chain_cooldown;
    private final int chain_damage;
    private final double chain_delay;
    private final int chain_radius;
    private final int chain_strikes;
    private final String localizedName;
    private final int static_chance;
    private final int static_cooldown;
    private final int static_damage;
    private final int static_duration;
    private final int static_primary_radius;
    private final int static_radius;
    private final int static_seconary_radius;
    private final int static_strikes;

    private Mjollnir() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = 0;
        abilityCastRange = 800;
        abilityCooldown = 35;
        abilityManaCost = 50;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 158;
        itemAliases = "mjollnir";
        itemCost = 5700;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemDisassembleRule = "DOTA_ITEM_DISASSEMBLE_ALWAYS";
        itemQuality = "artifact";
        itemShopTags = new String[]{"damage","attack_speed","unique"};
        key = "item_mjollnir";
        bonus_attack_speed = 80;
        bonus_damage = 24;
        chain_chance = 25;
        chain_cooldown = 0.0;
        chain_damage = 150;
        chain_delay = .25;
        chain_radius = 900;
        chain_strikes = 12;
        localizedName = "Mjollnir";
        static_chance = 20;
        static_cooldown = 1;
        static_damage = 200;
        static_duration = 15;
        static_primary_radius = 600;
        static_radius = 900;
        static_seconary_radius = 900;
        static_strikes = 4;
    }

    public static Mjollnir instance() {
        if( instance == null ){
            instance = new Mjollnir();
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

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getChainChance() {
        return chain_chance;
    }

    public double getChainCooldown() {
        return chain_cooldown;
    }

    public int getChainDamage() {
        return chain_damage;
    }

    public double getChainDelay() {
        return chain_delay;
    }

    public int getChainRadius() {
        return chain_radius;
    }

    public int getChainStrikes() {
        return chain_strikes;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getStaticChance() {
        return static_chance;
    }

    public int getStaticCooldown() {
        return static_cooldown;
    }

    public int getStaticDamage() {
        return static_damage;
    }

    public int getStaticDuration() {
        return static_duration;
    }

    public int getStaticPrimaryRadius() {
        return static_primary_radius;
    }

    public int getStaticRadius() {
        return static_radius;
    }

    public int getStaticSeconaryRadius() {
        return static_seconary_radius;
    }

    public int getStaticStrikes() {
        return static_strikes;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Mjollnir))
            return false;
        if (object == this)
            return true;
        Mjollnir otherObject = (Mjollnir) object;
        return otherObject.getKey().equals(getKey());
    }

}
