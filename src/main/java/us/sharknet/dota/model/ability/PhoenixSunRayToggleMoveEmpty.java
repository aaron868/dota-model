package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PhoenixSunRayToggleMoveEmpty extends Ability {

    private static PhoenixSunRayToggleMoveEmpty instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;

    private PhoenixSunRayToggleMoveEmpty() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE"};
        iD = 5629;
        key = "phoenix_sun_ray_toggle_move_empty";
        maxLevel = 0;
        localizedName = "Sun Ray Move Empty";
        owningHeroShortKey = "phoenix";
    }

    public static PhoenixSunRayToggleMoveEmpty instance() {
        if( instance == null ){
            instance = new PhoenixSunRayToggleMoveEmpty();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PhoenixSunRayToggleMoveEmpty))
            return false;
        if (object == this)
            return true;
        PhoenixSunRayToggleMoveEmpty otherObject = (PhoenixSunRayToggleMoveEmpty) object;
        return otherObject.getKey().equals(getKey());
    }

}
