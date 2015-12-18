package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class GlimmerCape extends Item {

    private static GlimmerCape instance;

    private final String[] abilityBehavior;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemDisassembleRule;
    private final String itemQuality;
    private final String key;
    private final int active_magical_armor;
    private final int bonus_attack_speed;
    private final int bonus_magical_armor;
    private final int duration;
    private final double fade_delay;
    private final String localizedName;

    private GlimmerCape() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_MOVEMENT"};
        abilityCastRange = 800;
        abilityCooldown = 16;
        abilityManaCost = 110;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        fightRecapLevel = 1;
        iD = 254;
        itemAliases = "glimmer cape";
        itemCost = 1950;
        itemDisassembleRule = "DOTA_ITEM_DISASSEMBLE_ALWAYS";
        itemQuality = "rare";
        key = "item_glimmer_cape";
        active_magical_armor = 45;
        bonus_attack_speed = 20;
        bonus_magical_armor = 15;
        duration = 5;
        fade_delay = .6;
        localizedName = "Glimmer Cape";
    }

    public static GlimmerCape instance() {
        if( instance == null ){
            instance = new GlimmerCape();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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

    public String getItemDisassembleRule() {
        return itemDisassembleRule;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public String getKey() {
        return key;
    }

    public int getActiveMagicalArmor() {
        return active_magical_armor;
    }

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int getBonusMagicalArmor() {
        return bonus_magical_armor;
    }

    public int getDuration() {
        return duration;
    }

    public double getFadeDelay() {
        return fade_delay;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof GlimmerCape))
            return false;
        if (object == this)
            return true;
        GlimmerCape otherObject = (GlimmerCape) object;
        return otherObject.getKey().equals(getKey());
    }

}
