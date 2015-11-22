package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class QueenofpainShadowStrike extends Ability {

    private static QueenofpainShadowStrike instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] cast_range_tooltip;
    private final int[] duration_damage;
    private final int duration_tooltip;
    private final String localizedName;
    private final int[] movement_slow;
    private final String owningHeroShortKey;
    private final int projectile_speed;
    private final int[] strike_damage;

    private QueenofpainShadowStrike() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.452,0.452,0.452,0.452};
        abilityCastRange = new int[]{450,475,500,525};
        abilityCooldown = new double[]{16.0,12.0,8.0,4.0};
        abilityDuration = new double[]{15.0,15.0,15.0,15.0};
        abilityManaCost = 110;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5173;
        key = "queenofpain_shadow_strike";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        cast_range_tooltip = new int[]{450,475,500,525};
        duration_damage = new int[]{30,40,50,60};
        duration_tooltip = 15;
        localizedName = "Shadow Strike";
        movement_slow = new int[]{-20,-30,-40,-50};
        owningHeroShortKey = "queenofpain";
        projectile_speed = 900;
        strike_damage = new int[]{50,75,100,125};
    }

    public static QueenofpainShadowStrike instance() {
        if( instance == null ){
            instance = new QueenofpainShadowStrike();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int[] getCastRangeTooltip() {
        return cast_range_tooltip;
    }

    public int[] getDurationDamage() {
        return duration_damage;
    }

    public int getDurationTooltip() {
        return duration_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMovementSlow() {
        return movement_slow;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getProjectileSpeed() {
        return projectile_speed;
    }

    public int[] getStrikeDamage() {
        return strike_damage;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof QueenofpainShadowStrike))
            return false;
        if (object == this)
            return true;
        QueenofpainShadowStrike otherObject = (QueenofpainShadowStrike) object;
        return otherObject.getKey().equals(getKey());
    }

}
