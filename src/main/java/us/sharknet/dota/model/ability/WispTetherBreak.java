package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WispTetherBreak extends Ability {

    private static WispTetherBreak instance;

    private final String[] abilityBehavior;
    private final int[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;

    private WispTetherBreak() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new int[]{0,0,0,0};
        abilityCooldown = new double[]{1.0,1.0,1.0,1.0};
        iD = 5489;
        key = "wisp_tether_break";
        maxLevel = 1;
        localizedName = "Tether Break";
        owningHeroShortKey = "wisp";
    }

    public static WispTetherBreak instance() {
        if( instance == null ){
            instance = new WispTetherBreak();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
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
        if (!(object instanceof WispTetherBreak))
            return false;
        if (object == this)
            return true;
        WispTetherBreak otherObject = (WispTetherBreak) object;
        return otherObject.getKey().equals(getKey());
    }

}
