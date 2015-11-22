package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BeastmasterCallOfTheWild extends Ability {

    private static BeastmasterCallOfTheWild instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final String key;
    private final int[] boar_duration;
    private final int[] hawk_daysight_tooltip;
    private final int[] hawk_duration;
    private final int[] hawk_hp_tooltip;
    private final int[] hawk_nightsight_tooltip;
    private final int[] hawk_speed_tooltip;
    private final String localizedName;
    private final String owningHeroShortKey;

    private BeastmasterCallOfTheWild() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = .3;
        abilityCooldown = 4;
        abilityManaCost = 15;
        iD = 5169;
        key = "beastmaster_call_of_the_wild";
        boar_duration = new int[]{60,60,60,60};
        hawk_daysight_tooltip = new int[]{700,1000,1300,1600};
        hawk_duration = new int[]{60,60,60,60};
        hawk_hp_tooltip = new int[]{40,60,80,100};
        hawk_nightsight_tooltip = new int[]{700,800,900,1000};
        hawk_speed_tooltip = new int[]{250,275,300,325};
        localizedName = "Call Of The Wild";
        owningHeroShortKey = "beastmaster";
    }

    public static BeastmasterCallOfTheWild instance() {
        if( instance == null ){
            instance = new BeastmasterCallOfTheWild();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int[] getBoarDuration() {
        return boar_duration;
    }

    public int[] getHawkDaysightTooltip() {
        return hawk_daysight_tooltip;
    }

    public int[] getHawkDuration() {
        return hawk_duration;
    }

    public int[] getHawkHpTooltip() {
        return hawk_hp_tooltip;
    }

    public int[] getHawkNightsightTooltip() {
        return hawk_nightsight_tooltip;
    }

    public int[] getHawkSpeedTooltip() {
        return hawk_speed_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BeastmasterCallOfTheWild))
            return false;
        if (object == this)
            return true;
        BeastmasterCallOfTheWild otherObject = (BeastmasterCallOfTheWild) object;
        return otherObject.getKey().equals(getKey());
    }

}
