package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TinkerRearm extends Ability {

    private static TinkerRearm instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityChannelTime;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final double[] channel_tooltip;
    private final String localizedName;
    private final String owningHeroShortKey;

    private TinkerRearm() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_CHANNELLED"};
        abilityCastPoint = new double[]{0.53,0.53,0.53,0.53};
        abilityChannelTime = new double[]{3.0,1.5,0.75};
        abilityCooldown = new double[]{0.0,0.0,0.0};
        abilityManaCost = new int[]{125,225,325};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5153;
        key = "tinker_rearm";
        channel_tooltip = new double[]{3.0,1.5,0.75};
        localizedName = "Rearm";
        owningHeroShortKey = "tinker";
    }

    public static TinkerRearm instance() {
        if( instance == null ){
            instance = new TinkerRearm();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityChannelTime() {
        return abilityChannelTime;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public double[] getChannelTooltip() {
        return channel_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TinkerRearm))
            return false;
        if (object == this)
            return true;
        TinkerRearm otherObject = (TinkerRearm) object;
        return otherObject.getKey().equals(getKey());
    }

}
