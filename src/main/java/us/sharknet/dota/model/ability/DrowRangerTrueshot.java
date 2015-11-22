package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DrowRangerTrueshot extends Ability {

    private static DrowRangerTrueshot instance;

    private final String[] abilityBehavior;
    private final int[] abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityDuration;
    private final String abilityUnitTargetTeam;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double[] trueshot_ranged_damage;

    private DrowRangerTrueshot() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new int[]{0,0,0,0};
        abilityCastRange = 0;
        abilityCooldown = 1;
        abilityDuration = 3;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        iD = 521;
        key = "drow_ranger_trueshot";
        localizedName = "Trueshot";
        owningHeroShortKey = "drow_ranger";
        trueshot_ranged_damage = new double[]{20.0,26.0,32.0,38.0};
    }

    public static DrowRangerTrueshot instance() {
        if( instance == null ){
            instance = new DrowRangerTrueshot();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityDuration() {
        return abilityDuration;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double[] getTrueshotRangedDamage() {
        return trueshot_ranged_damage;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DrowRangerTrueshot))
            return false;
        if (object == this)
            return true;
        DrowRangerTrueshot otherObject = (DrowRangerTrueshot) object;
        return otherObject.getKey().equals(getKey());
    }

}
