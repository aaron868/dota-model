package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WispSpiritsIn extends Ability {

    private static WispSpiritsIn instance;

    private final String[] abilityBehavior;
    private final int[] abilityCastPoint;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;

    private WispSpiritsIn() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_TOGGLE","DOTA_ABILITY_BEHAVIOR_HIDDEN"};
        abilityCastPoint = new int[]{0,0,0,0};
        iD = 5490;
        key = "wisp_spirits_in";
        maxLevel = 1;
        localizedName = "Spirits In";
        owningHeroShortKey = "wisp";
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
        if (!(object instanceof WispSpiritsIn))
            return false;
        if (object == this)
            return true;
        WispSpiritsIn otherObject = (WispSpiritsIn) object;
        return otherObject.getKey().equals(getKey());
    }

}
