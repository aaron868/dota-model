package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WispSpiritsOut extends Ability {

    private static WispSpiritsOut instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private WispSpiritsOut() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_TOGGLE","DOTA_ABILITY_BEHAVIOR_HIDDEN"};
        abilityCastPoint = new double[]{0,0,0,0};
        iD = 5493;
        key = "wisp_spirits_out";
        localizedName = "Spirits Out";
        ownerKey = "npc_dota_hero_wisp";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static WispSpiritsOut instance() {
        if( instance == null ){
            instance = new WispSpiritsOut();
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
        if (!(object instanceof WispSpiritsOut))
            return false;
        if (object == this)
            return true;
        WispSpiritsOut otherObject = (WispSpiritsOut) object;
        return otherObject.getKey().equals(getKey());
    }

}
