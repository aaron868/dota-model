package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PhoenixIcarusDiveStop extends Ability {

    private static PhoenixIcarusDiveStop instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private PhoenixIcarusDiveStop() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        iD = 5624;
        key = "phoenix_icarus_dive_stop";
        localizedName = "Icarus Dive Stop";
        ownerKey = "npc_dota_hero_phoenix";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static PhoenixIcarusDiveStop instance() {
        if( instance == null ){
            instance = new PhoenixIcarusDiveStop();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PhoenixIcarusDiveStop))
            return false;
        if (object == this)
            return true;
        PhoenixIcarusDiveStop otherObject = (PhoenixIcarusDiveStop) object;
        return otherObject.getKey().equals(getKey());
    }

}
