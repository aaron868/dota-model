package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DrowRangerFrostArrows extends Ability {

    private static DrowRangerFrostArrows instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int frost_arrows_creep_duration;
    private final double frost_arrows_hero_duration_tooltip;
    private final int[] frost_arrows_movement_speed;
    private final String localizedName;
    private final String owningHeroShortKey;

    private DrowRangerFrostArrows() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_AUTOCAST","DOTA_ABILITY_BEHAVIOR_ATTACK"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = 625;
        abilityCooldown = new double[]{0.0,0.0,0.0,0.0};
        abilityDamage = new int[]{0,0,0,0};
        abilityDuration = new double[]{1.5,1.5,1.5,1.5};
        abilityManaCost = new int[]{12,12,12,12};
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 519;
        key = "drow_ranger_frost_arrows";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        frost_arrows_creep_duration = 7;
        frost_arrows_hero_duration_tooltip = 1.5;
        frost_arrows_movement_speed = new int[]{-15,-30,-45,-60};
        localizedName = "Frost Arrows";
        owningHeroShortKey = "drow_ranger";
    }

    public static DrowRangerFrostArrows instance() {
        if( instance == null ){
            instance = new DrowRangerFrostArrows();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
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

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int getFrostArrowsCreepDuration() {
        return frost_arrows_creep_duration;
    }

    public double getFrostArrowsHeroDurationTooltip() {
        return frost_arrows_hero_duration_tooltip;
    }

    public int[] getFrostArrowsMovementSpeed() {
        return frost_arrows_movement_speed;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DrowRangerFrostArrows))
            return false;
        if (object == this)
            return true;
        DrowRangerFrostArrows otherObject = (DrowRangerFrostArrows) object;
        return otherObject.getKey().equals(getKey());
    }

}
