package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AbaddonBorrowedTime extends Ability {

    private static AbaddonBorrowedTime instance;

    private final String[] abilityBehavior;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final double[] duration;
    private final double[] duration_scepter;
    private final int hp_threshold;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double redirect;
    private final int redirect_pct_tooltip_scepter;
    private final int redirect_range_tooltip_scepter;

    private AbaddonBorrowedTime() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_IGNORE_PSEUDO_QUEUE"};
        abilityCooldown = new double[]{60.0,50.0,40.0};
        abilityManaCost = new int[]{0,0,0};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        fightRecapLevel = 2;
        iD = 5588;
        key = "abaddon_borrowed_time";
        duration = new double[]{4.0,5.0,6.0};
        duration_scepter = new double[]{5.0,6.0,7.0};
        hp_threshold = 400;
        localizedName = "Borrowed Time";
        owningHeroShortKey = "abaddon";
        redirect = .5;
        redirect_pct_tooltip_scepter = 50;
        redirect_range_tooltip_scepter = 9;
    }

    public static AbaddonBorrowedTime instance() {
        if( instance == null ){
            instance = new AbaddonBorrowedTime();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
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

    public int getFightRecapLevel() {
        return fightRecapLevel;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public double[] getDuration() {
        return duration;
    }

    public double[] getDurationScepter() {
        return duration_scepter;
    }

    public int getHpThreshold() {
        return hp_threshold;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double getRedirect() {
        return redirect;
    }

    public int getRedirectPctTooltipScepter() {
        return redirect_pct_tooltip_scepter;
    }

    public int getRedirectRangeTooltipScepter() {
        return redirect_range_tooltip_scepter;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AbaddonBorrowedTime))
            return false;
        if (object == this)
            return true;
        AbaddonBorrowedTime otherObject = (AbaddonBorrowedTime) object;
        return otherObject.getKey().equals(getKey());
    }

}
