package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LegionCommanderMomentOfCourage extends Ability {

    private static LegionCommanderMomentOfCourage instance;

    private final String abilityBehavior;
    private final double[] abilityCooldown;
    private final int iD;
    private final String key;
    private final int buff_duration;
    private final int[] hp_leech_percent;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int trigger_chance;

    private LegionCommanderMomentOfCourage() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityCooldown = new double[]{2.7,2.1,1.5,0.9};
        iD = 5597;
        key = "legion_commander_moment_of_courage";
        buff_duration = 1;
        hp_leech_percent = new int[]{55,65,75,85};
        localizedName = "Moment Of Courage";
        owningHeroShortKey = "legion_commander";
        trigger_chance = 25;
    }

    public static LegionCommanderMomentOfCourage instance() {
        if( instance == null ){
            instance = new LegionCommanderMomentOfCourage();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
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

    public int getBuffDuration() {
        return buff_duration;
    }

    public int[] getHpLeechPercent() {
        return hp_leech_percent;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getTriggerChance() {
        return trigger_chance;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LegionCommanderMomentOfCourage))
            return false;
        if (object == this)
            return true;
        LegionCommanderMomentOfCourage otherObject = (LegionCommanderMomentOfCourage) object;
        return otherObject.getKey().equals(getKey());
    }

}
