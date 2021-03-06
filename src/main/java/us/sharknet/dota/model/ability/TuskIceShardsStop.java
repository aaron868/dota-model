package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TuskIceShardsStop extends Ability {

    private static TuskIceShardsStop instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private TuskIceShardsStop() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        iD = 5668;
        key = "tusk_ice_shards_stop";
        localizedName = "Ice Shards Stop";
        ownerKey = "npc_dota_hero_tusk";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
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
        if (!(object instanceof TuskIceShardsStop))
            return false;
        if (object == this)
            return true;
        TuskIceShardsStop otherObject = (TuskIceShardsStop) object;
        return otherObject.getKey().equals(getKey());
    }

}
