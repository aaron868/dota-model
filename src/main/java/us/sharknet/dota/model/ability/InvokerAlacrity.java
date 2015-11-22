package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class InvokerAlacrity extends Ability {

    private static InvokerAlacrity instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final String hotKeyOverride;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String spellImmunityType;
    private final int[] bonus_attack_speed;
    private final int[] bonus_damage;
    private final int duration;
    private final String localizedName;
    private final String owningHeroShortKey;

    private InvokerAlacrity() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = 0;
        abilityCastRange = 650;
        abilityCooldown = 15;
        abilityManaCost = 45;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_CREEP"};
        hotKeyOverride = "Z";
        iD = 5384;
        key = "invoker_alacrity";
        maxLevel = 1;
        spellImmunityType = "SPELL_IMMUNITY_ALLIES_YES";
        bonus_attack_speed = new int[]{30,40,50,60,70,80,90,100};
        bonus_damage = new int[]{30,40,50,60,70,80,90,100};
        duration = 9;
        localizedName = "Alacrity";
        owningHeroShortKey = "invoker";
    }

    public static InvokerAlacrity instance() {
        if( instance == null ){
            instance = new InvokerAlacrity();
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

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public String getHotKeyOverride() {
        return hotKeyOverride;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int[] getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int[] getBonusDamage() {
        return bonus_damage;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof InvokerAlacrity))
            return false;
        if (object == this)
            return true;
        InvokerAlacrity otherObject = (InvokerAlacrity) object;
        return otherObject.getKey().equals(getKey());
    }

}
