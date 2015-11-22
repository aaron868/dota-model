package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SvenWarcry extends Ability {

    private static SvenWarcry instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int abilityDuration;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final int duration_tooltip;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] warcry_armor;
    private final int warcry_movespeed;
    private final int warcry_radius;

    private SvenWarcry() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCooldown = new double[]{32.0,26.0,20.0,14.0};
        abilityDuration = 8;
        abilityManaCost = new int[]{25,25,25,25};
        iD = 596;
        key = "sven_warcry";
        duration_tooltip = 8;
        localizedName = "Warcry";
        owningHeroShortKey = "sven";
        warcry_armor = new int[]{5,10,15,20};
        warcry_movespeed = 12;
        warcry_radius = 9;
    }

    public static SvenWarcry instance() {
        if( instance == null ){
            instance = new SvenWarcry();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getDurationTooltip() {
        return duration_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getWarcryArmor() {
        return warcry_armor;
    }

    public int getWarcryMovespeed() {
        return warcry_movespeed;
    }

    public int getWarcryRadius() {
        return warcry_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SvenWarcry))
            return false;
        if (object == this)
            return true;
        SvenWarcry otherObject = (SvenWarcry) object;
        return otherObject.getKey().equals(getKey());
    }

}
