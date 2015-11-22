package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BeastmasterHawkInvisibility extends Ability {

    private static BeastmasterHawkInvisibility instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int fade_time;
    private final int[] fade_tooltip;
    private final int idle_invis_delay;
    private final String localizedName;
    private final String owningHeroShortKey;

    private BeastmasterHawkInvisibility() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 517;
        key = "beastmaster_hawk_invisibility";
        fade_time = 1;
        fade_tooltip = new int[]{0,0,4,4};
        idle_invis_delay = 3;
        localizedName = "Hawk Invisibility";
        owningHeroShortKey = "beastmaster";
    }

    public static BeastmasterHawkInvisibility instance() {
        if( instance == null ){
            instance = new BeastmasterHawkInvisibility();
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

    public int getFadeTime() {
        return fade_time;
    }

    public int[] getFadeTooltip() {
        return fade_tooltip;
    }

    public int getIdleInvisDelay() {
        return idle_invis_delay;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BeastmasterHawkInvisibility))
            return false;
        if (object == this)
            return true;
        BeastmasterHawkInvisibility otherObject = (BeastmasterHawkInvisibility) object;
        return otherObject.getKey().equals(getKey());
    }

}
