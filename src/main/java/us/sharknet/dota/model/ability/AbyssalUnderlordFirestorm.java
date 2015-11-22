package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AbyssalUnderlordFirestorm extends Ability {

    private static AbyssalUnderlordFirestorm instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final int[] burn_damage;
    private final int burn_duration;
    private final int burn_interval;
    private final double first_wave_delay;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;
    private final int wave_count;
    private final int[] wave_damage;
    private final int wave_duration;
    private final int wave_interval;

    private AbyssalUnderlordFirestorm() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = .6;
        abilityCastRange = 75;
        abilityCooldown = 14;
        abilityManaCost = new int[]{100,110,120,130};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 5613;
        key = "abyssal_underlord_firestorm";
        burn_damage = new int[]{5,10,15,20};
        burn_duration = 2;
        burn_interval = 1;
        first_wave_delay = .9;
        localizedName = "Firestorm";
        owningHeroShortKey = "abyssal_underlord";
        radius = 4;
        wave_count = 6;
        wave_damage = new int[]{25,40,55,70};
        wave_duration = 7;
        wave_interval = 1;
    }

    public static AbyssalUnderlordFirestorm instance() {
        if( instance == null ){
            instance = new AbyssalUnderlordFirestorm();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int[] getBurnDamage() {
        return burn_damage;
    }

    public int getBurnDuration() {
        return burn_duration;
    }

    public int getBurnInterval() {
        return burn_interval;
    }

    public double getFirstWaveDelay() {
        return first_wave_delay;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }

    public int getWaveCount() {
        return wave_count;
    }

    public int[] getWaveDamage() {
        return wave_damage;
    }

    public int getWaveDuration() {
        return wave_duration;
    }

    public int getWaveInterval() {
        return wave_interval;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AbyssalUnderlordFirestorm))
            return false;
        if (object == this)
            return true;
        AbyssalUnderlordFirestorm otherObject = (AbyssalUnderlordFirestorm) object;
        return otherObject.getKey().equals(getKey());
    }

}
