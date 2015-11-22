package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LycanSummonWolvesCriticalStrike extends Ability {

    private static LycanSummonWolvesCriticalStrike instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int crit_chance;
    private final int crit_damage;
    private final String localizedName;
    private final String owningHeroShortKey;

    private LycanSummonWolvesCriticalStrike() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5399;
        key = "lycan_summon_wolves_critical_strike";
        maxLevel = 1;
        crit_chance = 30;
        crit_damage = 170;
        localizedName = "Summon Wolves Critical Strike";
        owningHeroShortKey = "lycan";
    }

    public static LycanSummonWolvesCriticalStrike instance() {
        if( instance == null ){
            instance = new LycanSummonWolvesCriticalStrike();
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

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getCritChance() {
        return crit_chance;
    }

    public int getCritDamage() {
        return crit_damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LycanSummonWolvesCriticalStrike))
            return false;
        if (object == this)
            return true;
        LycanSummonWolvesCriticalStrike otherObject = (LycanSummonWolvesCriticalStrike) object;
        return otherObject.getKey().equals(getKey());
    }

}
