package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PuckPhaseShift extends Ability {

    private static PuckPhaseShift instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityChannelTime;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final double[] duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private PuckPhaseShift() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_MOVEMENT","DOTA_ABILITY_BEHAVIOR_CHANNELLED","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK","DOTA_ABILITY_BEHAVIOR_ROOT_DISABLES"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityChannelTime = new double[]{0.75,1.50,2.25,3.25};
        abilityCooldown = new double[]{6.0,6.0,6.0,6.0};
        abilityManaCost = new int[]{0,0,0,0};
        iD = 5072;
        key = "puck_phase_shift";
        duration = new double[]{0.75,1.5,2.25,3.25};
        localizedName = "Phase Shift";
        ownerKey = "npc_dota_hero_puck";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static PuckPhaseShift instance() {
        if( instance == null ){
            instance = new PuckPhaseShift();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityChannelTime() {
        return abilityChannelTime;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public double[] getDuration() {
        return duration;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PuckPhaseShift))
            return false;
        if (object == this)
            return true;
        PuckPhaseShift otherObject = (PuckPhaseShift) object;
        return otherObject.getKey().equals(getKey());
    }

}
