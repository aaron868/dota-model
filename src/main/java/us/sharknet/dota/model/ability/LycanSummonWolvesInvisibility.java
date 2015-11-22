package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LycanSummonWolvesInvisibility extends Ability {

    private static LycanSummonWolvesInvisibility instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final double fade_delay;
    private final double[] fade_time;
    private final String localizedName;
    private final String owningHeroShortKey;

    private LycanSummonWolvesInvisibility() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 55;
        key = "lycan_summon_wolves_invisibility";
        fade_delay = 1.7;
        fade_time = new double[]{0.0,0.0,0.0};
        localizedName = "Summon Wolves Invisibility";
        owningHeroShortKey = "lycan";
    }

    public static LycanSummonWolvesInvisibility instance() {
        if( instance == null ){
            instance = new LycanSummonWolvesInvisibility();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public double getFadeDelay() {
        return fade_delay;
    }

    public double[] getFadeTime() {
        return fade_time;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LycanSummonWolvesInvisibility))
            return false;
        if (object == this)
            return true;
        LycanSummonWolvesInvisibility otherObject = (LycanSummonWolvesInvisibility) object;
        return otherObject.getKey().equals(getKey());
    }

}
