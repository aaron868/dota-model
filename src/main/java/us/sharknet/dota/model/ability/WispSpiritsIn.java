package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WispSpiritsIn extends Ability {

    private static WispSpiritsIn instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private WispSpiritsIn() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_TOGGLE","DOTA_ABILITY_BEHAVIOR_HIDDEN"};
        abilityCastPoint = new double[]{0,0,0,0};
        iD = 5490;
        key = "wisp_spirits_in";
        localizedName = "Spirits In";
        ownerKey = "npc_dota_hero_wisp";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static WispSpiritsIn instance() {
        if( instance == null ){
            instance = new WispSpiritsIn();
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
        if (!(object instanceof WispSpiritsIn))
            return false;
        if (object == this)
            return true;
        WispSpiritsIn otherObject = (WispSpiritsIn) object;
        return otherObject.getKey().equals(getKey());
    }

}
