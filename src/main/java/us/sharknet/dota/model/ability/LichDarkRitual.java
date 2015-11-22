package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LichDarkRitual extends Ability {

    private static LichDarkRitual instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final int[] health_conversion;
    private final String localizedName;
    private final String owningHeroShortKey;

    private LichDarkRitual() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{0.4,0.4,0.4,0.4};
        abilityCastRange = 400;
        abilityCooldown = new int[]{44,36,28,20};
        abilityManaCost = new int[]{25,25,25,25};
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_NOT_SUMMONED","DOTA_UNIT_TARGET_FLAG_NOT_ANCIENTS","DOTA_UNIT_TARGET_FLAG_NOT_CREEP_HERO"};
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_BASIC";
        iD = 5136;
        key = "lich_dark_ritual";
        health_conversion = new int[]{25,40,55,70};
        localizedName = "Sacrifice";
        owningHeroShortKey = "lich";
    }

    public static LichDarkRitual instance() {
        if( instance == null ){
            instance = new LichDarkRitual();
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

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public int[] getHealthConversion() {
        return health_conversion;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LichDarkRitual))
            return false;
        if (object == this)
            return true;
        LichDarkRitual otherObject = (LichDarkRitual) object;
        return otherObject.getKey().equals(getKey());
    }

}
