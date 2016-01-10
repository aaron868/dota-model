package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DrowRangerTrueshot extends Ability {

    private static DrowRangerTrueshot instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final String[] abilityUnitTargetTeam;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double[] trueshot_ranged_damage;

    private DrowRangerTrueshot() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCastRange = new int[]{0,0,0,0};
        abilityCooldown = new double[]{100,100,100,100};
        abilityDuration = new double[]{3,3,3,3};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        iD = 5021;
        key = "drow_ranger_trueshot";
        localizedName = "Precision Aura";
        ownerKey = "npc_dota_hero_drow_ranger";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
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

    public String[] getAbilityUnitTargetTeam() {
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

    public String getOwnerKey() {
        return ownerKey;
    }

    public AbilityOwnerType getOwnerType() {
        return ownerType;
    }

    public boolean isPassive() {
        return passive;
    }

    public boolean isPlaceholder() {
        return placeholder;
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
