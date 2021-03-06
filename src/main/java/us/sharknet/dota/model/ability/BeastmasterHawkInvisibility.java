package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BeastmasterHawkInvisibility extends Ability {

    private static BeastmasterHawkInvisibility instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int fade_time;
    private final int[] fade_tooltip;
    private final int idle_invis_delay;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private BeastmasterHawkInvisibility() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5170;
        key = "beastmaster_hawk_invisibility";
        fade_time = 1;
        fade_tooltip = new int[]{0,0,4,4};
        idle_invis_delay = 3;
        localizedName = "Hawk Invisibility";
        ownerKey = "npc_dota_scout_hawk";
        ownerType = AbilityOwnerType.Summoned;
        passive = false;
        placeholder = false;
    }

    public static BeastmasterHawkInvisibility instance() {
        if( instance == null ){
            instance = new BeastmasterHawkInvisibility();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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
        if (!(object instanceof BeastmasterHawkInvisibility))
            return false;
        if (object == this)
            return true;
        BeastmasterHawkInvisibility otherObject = (BeastmasterHawkInvisibility) object;
        return otherObject.getKey().equals(getKey());
    }

}
