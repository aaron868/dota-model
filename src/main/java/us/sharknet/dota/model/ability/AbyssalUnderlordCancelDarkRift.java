package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AbyssalUnderlordCancelDarkRift extends Ability {

    private static AbyssalUnderlordCancelDarkRift instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;

    private AbyssalUnderlordCancelDarkRift() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5617;
        key = "abyssal_underlord_cancel_dark_rift";
        maxLevel = 1;
        localizedName = "Cancel Dark Rift";
        owningHeroShortKey = "abyssal_underlord";
    }

    public static AbyssalUnderlordCancelDarkRift instance() {
        if( instance == null ){
            instance = new AbyssalUnderlordCancelDarkRift();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public String getAbilityType() {
        return abilityType;
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
        if (!(object instanceof AbyssalUnderlordCancelDarkRift))
            return false;
        if (object == this)
            return true;
        AbyssalUnderlordCancelDarkRift otherObject = (AbyssalUnderlordCancelDarkRift) object;
        return otherObject.getKey().equals(getKey());
    }

}
