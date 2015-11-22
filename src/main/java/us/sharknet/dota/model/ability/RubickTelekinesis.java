package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RubickTelekinesis extends Ability {

    private static RubickTelekinesis instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] cast_range_tooltip;
    private final double[] fall_duration;
    private final double[] lift_duration;
    private final String localizedName;
    private final int[] max_land_distance;
    private final int max_land_distance_allied;
    private final String owningHeroShortKey;
    private final int[] radius;
    private final double[] stun_duration;

    private RubickTelekinesis() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.1,0.1,0.1,0.1};
        abilityCastRange = new int[]{550,575,600,625};
        abilityCooldown = 22;
        abilityManaCost = new int[]{120,120,120,120};
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5448;
        key = "rubick_telekinesis";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        cast_range_tooltip = new int[]{550,575,600,625};
        fall_duration = new double[]{0.3,0.3,0.3,0.3};
        lift_duration = new double[]{1.5,1.75,2.0,2.25};
        localizedName = "Telekinesis";
        max_land_distance = new int[]{375,375,375,375};
        max_land_distance_allied = 950;
        owningHeroShortKey = "rubick";
        radius = new int[]{325,325,325,325};
        stun_duration = new double[]{1.0,1.25,1.5,1.75};
    }

    public static RubickTelekinesis instance() {
        if( instance == null ){
            instance = new RubickTelekinesis();
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

    public int getAbilityCooldown() {
        return abilityCooldown;
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

    public int[] getCastRangeTooltip() {
        return cast_range_tooltip;
    }

    public double[] getFallDuration() {
        return fall_duration;
    }

    public double[] getLiftDuration() {
        return lift_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMaxLandDistance() {
        return max_land_distance;
    }

    public int getMaxLandDistanceAllied() {
        return max_land_distance_allied;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
        return radius;
    }

    public double[] getStunDuration() {
        return stun_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RubickTelekinesis))
            return false;
        if (object == this)
            return true;
        RubickTelekinesis otherObject = (RubickTelekinesis) object;
        return otherObject.getKey().equals(getKey());
    }

}
