package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LegionCommanderDuel extends Ability {

    private static LegionCommanderDuel instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int abilityModifierSupportValue;
    private final String abilityType;
    private final String[] abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] reward_damage;

    private LegionCommanderDuel() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 150;
        abilityCooldown = new double[]{50.0,50.0,50.0};
        abilityManaCost = new int[]{75,75,75};
        abilityModifierSupportValue = 3;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES","DOTA_UNIT_TARGET_FLAG_NOT_CREEP_HERO"};
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        fightRecapLevel = 2;
        iD = 5598;
        key = "legion_commander_duel";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        duration = new double[]{4.0,4.75,5.5};
        localizedName = "Duel";
        owningHeroShortKey = "legion_commander";
        reward_damage = new int[]{10,14,18};
    }

    public static LegionCommanderDuel instance() {
        if( instance == null ){
            instance = new LegionCommanderDuel();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public String[] getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRewardDamage() {
        return reward_damage;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LegionCommanderDuel))
            return false;
        if (object == this)
            return true;
        LegionCommanderDuel otherObject = (LegionCommanderDuel) object;
        return otherObject.getKey().equals(getKey());
    }

}
