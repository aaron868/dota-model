package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ClinkzDeathPact extends Ability {

    private static ClinkzDeathPact instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String[] abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final double[] damage_gain_pct;
    private final int duration;
    private final int[] health_gain_pct;
    private final String localizedName;
    private final String owningHeroShortKey;

    private ClinkzDeathPact() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{0.5,0.5,0.5};
        abilityCastRange = 4;
        abilityCooldown = new double[]{45.0,35.0,25.0};
        abilityManaCost = new int[]{100,100,100};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_NOT_ANCIENTS","DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES","DOTA_UNIT_TARGET_FLAG_NOT_CREEP_HERO"};
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_BOTH";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_CREEP";
        iD = 5262;
        key = "clinkz_death_pact";
        damage_gain_pct = new double[]{5.0,6.5,8.0};
        duration = 35;
        health_gain_pct = new int[]{50,65,80};
        localizedName = "Death Pact";
        owningHeroShortKey = "clinkz";
    }

    public static ClinkzDeathPact instance() {
        if( instance == null ){
            instance = new ClinkzDeathPact();
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

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public double[] getDamageGainPct() {
        return damage_gain_pct;
    }

    public int getDuration() {
        return duration;
    }

    public int[] getHealthGainPct() {
        return health_gain_pct;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ClinkzDeathPact))
            return false;
        if (object == this)
            return true;
        ClinkzDeathPact otherObject = (ClinkzDeathPact) object;
        return otherObject.getKey().equals(getKey());
    }

}
