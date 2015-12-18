package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LycanSummonWolvesCriticalStrike extends Ability {

    private static LycanSummonWolvesCriticalStrike instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final int maim_attack_speed;
    private final int maim_chance;
    private final int maim_damage;
    private final int maim_duration;
    private final int maim_movement_speed;
    private final String owningHeroShortKey;

    private LycanSummonWolvesCriticalStrike() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5399;
        key = "lycan_summon_wolves_critical_strike";
        maxLevel = 1;
        localizedName = "Summon Wolves Critical Strike";
        maim_attack_speed = 40;
        maim_chance = 20;
        maim_damage = 8;
        maim_duration = 4;
        maim_movement_speed = 0;
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

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaimAttackSpeed() {
        return maim_attack_speed;
    }

    public int getMaimChance() {
        return maim_chance;
    }

    public int getMaimDamage() {
        return maim_damage;
    }

    public int getMaimDuration() {
        return maim_duration;
    }

    public int getMaimMovementSpeed() {
        return maim_movement_speed;
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
