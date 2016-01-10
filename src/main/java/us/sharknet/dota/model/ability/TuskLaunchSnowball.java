package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TuskLaunchSnowball extends Ability {

    private static TuskLaunchSnowball instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private TuskLaunchSnowball() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_IGNORE_PSEUDO_QUEUE"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        iD = 5641;
        key = "tusk_launch_snowball";
        localizedName = "Launch Snowball";
        ownerKey = "npc_dota_hero_tusk";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static TuskLaunchSnowball instance() {
        if( instance == null ){
            instance = new TuskLaunchSnowball();
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
        if (!(object instanceof TuskLaunchSnowball))
            return false;
        if (object == this)
            return true;
        TuskLaunchSnowball otherObject = (TuskLaunchSnowball) object;
        return otherObject.getKey().equals(getKey());
    }

}
