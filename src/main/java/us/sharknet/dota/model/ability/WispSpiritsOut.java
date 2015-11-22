package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WispSpiritsOut extends Ability {

    private static WispSpiritsOut instance;

    private final String[] abilityBehavior;
    private final int[] abilityCastPoint;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;

    private WispSpiritsOut() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_TOGGLE","DOTA_ABILITY_BEHAVIOR_HIDDEN"};
        abilityCastPoint = new int[]{0,0,0,0};
        iD = 5493;
        key = "wisp_spirits_out";
        maxLevel = 1;
        localizedName = "Spirits Out";
        owningHeroShortKey = "wisp";
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

    public int[] getAbilityCastPoint() {
        return abilityCastPoint;
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
        if (!(object instanceof WispSpiritsOut))
            return false;
        if (object == this)
            return true;
        WispSpiritsOut otherObject = (WispSpiritsOut) object;
        return otherObject.getKey().equals(getKey());
    }

}
