package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PhoenixSunRayToggleMove extends Ability {

    private static PhoenixSunRayToggleMove instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String owningHeroShortKey;

    private PhoenixSunRayToggleMove() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        iD = 5628;
        key = "phoenix_sun_ray_toggle_move";
        localizedName = "Sun Ray Move";
        owningHeroShortKey = "phoenix";
    }

    public static PhoenixSunRayToggleMove instance() {
        if( instance == null ){
            instance = new PhoenixSunRayToggleMove();
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
        if (!(object instanceof PhoenixSunRayToggleMove))
            return false;
        if (object == this)
            return true;
        PhoenixSunRayToggleMove otherObject = (PhoenixSunRayToggleMove) object;
        return otherObject.getKey().equals(getKey());
    }

}
