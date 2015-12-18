package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LunaEclipse extends Ability {

    private static LunaEclipse instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] beam_interval;
    private final double beam_interval_scepter;
    private final int[] beams;
    private final int[] beams_scepter;
    private final int cast_range_tooltip_scepter;
    private final double[] duration_tooltip;
    private final double[] duration_tooltip_scepter;
    private final int hit_count;
    private final int[] hit_count_scepter;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;

    private LunaEclipse() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = new double[]{0.6,0.6,0.6};
        abilityCastRange = 2500;
        abilityCooldown = 14;
        abilityManaCost = new int[]{150,200,250};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 2;
        iD = 5225;
        key = "luna_eclipse";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        beam_interval = new double[]{0.6,0.6,0.6};
        beam_interval_scepter = .3;
        beams = new int[]{5,8,11};
        beams_scepter = new int[]{6,12,18};
        cast_range_tooltip_scepter = 2500;
        duration_tooltip = new double[]{2.4,4.2,6.0};
        duration_tooltip_scepter = new double[]{1.8,3.6,5.4};
        hit_count = 5;
        hit_count_scepter = new int[]{6,12,18};
        localizedName = "Eclipse";
        owningHeroShortKey = "luna";
        radius = new int[]{675,675,675};
    }

    public static LunaEclipse instance() {
        if( instance == null ){
            instance = new LunaEclipse();
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

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
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

    public double[] getBeamInterval() {
        return beam_interval;
    }

    public double getBeamIntervalScepter() {
        return beam_interval_scepter;
    }

    public int[] getBeams() {
        return beams;
    }

    public int[] getBeamsScepter() {
        return beams_scepter;
    }

    public int getCastRangeTooltipScepter() {
        return cast_range_tooltip_scepter;
    }

    public double[] getDurationTooltip() {
        return duration_tooltip;
    }

    public double[] getDurationTooltipScepter() {
        return duration_tooltip_scepter;
    }

    public int getHitCount() {
        return hit_count;
    }

    public int[] getHitCountScepter() {
        return hit_count_scepter;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LunaEclipse))
            return false;
        if (object == this)
            return true;
        LunaEclipse otherObject = (LunaEclipse) object;
        return otherObject.getKey().equals(getKey());
    }

}
