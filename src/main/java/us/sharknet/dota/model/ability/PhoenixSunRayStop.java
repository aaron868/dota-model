package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PhoenixSunRayStop extends Ability {

    private static PhoenixSunRayStop instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String owningHeroShortKey;

    private PhoenixSunRayStop() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        iD = 5627;
        key = "phoenix_sun_ray_stop";
        localizedName = "Sun Ray Stop";
        owningHeroShortKey = "phoenix";
    }

    public static PhoenixSunRayStop instance() {
        if( instance == null ){
            instance = new PhoenixSunRayStop();
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

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PhoenixSunRayStop))
            return false;
        if (object == this)
            return true;
        PhoenixSunRayStop otherObject = (PhoenixSunRayStop) object;
        return otherObject.getKey().equals(getKey());
    }

}
