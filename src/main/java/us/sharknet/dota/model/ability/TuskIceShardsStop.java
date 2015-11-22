package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TuskIceShardsStop extends Ability {

    private static TuskIceShardsStop instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String owningHeroShortKey;

    private TuskIceShardsStop() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        iD = 5668;
        key = "tusk_ice_shards_stop";
        localizedName = "Ice Shards Stop";
        owningHeroShortKey = "tusk";
    }

    public static TuskIceShardsStop instance() {
        if( instance == null ){
            instance = new TuskIceShardsStop();
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
        if (!(object instanceof TuskIceShardsStop))
            return false;
        if (object == this)
            return true;
        TuskIceShardsStop otherObject = (TuskIceShardsStop) object;
        return otherObject.getKey().equals(getKey());
    }

}
