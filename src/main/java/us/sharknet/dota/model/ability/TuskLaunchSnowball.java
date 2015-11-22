package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TuskLaunchSnowball extends Ability {

    private static TuskLaunchSnowball instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final String abilityTextureName;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String owningHeroShortKey;

    private TuskLaunchSnowball() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_IGNORE_PSEUDO_QUEUE"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityTextureName = "tusk_snowball";
        iD = 5641;
        key = "tusk_launch_snowball";
        localizedName = "Launch Showball";
        owningHeroShortKey = "tusk";
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

    public String getAbilityTextureName() {
        return abilityTextureName;
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
