package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DrowRangerWaveOfSilence extends Ability {

    private static DrowRangerWaveOfSilence instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int knockback_distance_max;
    private final double[] knockback_duration;
    private final int knockback_height;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double[] silence_duration;
    private final int wave_range_tooltip;
    private final int wave_speed;
    private final int wave_width;

    private DrowRangerWaveOfSilence() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_POINT";
        abilityCastPoint = .4;
        abilityCastRange = 9;
        abilityCooldown = 13;
        abilityManaCost = 9;
        fightRecapLevel = 1;
        iD = 5632;
        key = "drow_ranger_wave_of_silence";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        knockback_distance_max = 35;
        knockback_duration = new double[]{0.6,0.7,0.8,0.9};
        knockback_height = 0;
        localizedName = "Wave Of Silence";
        owningHeroShortKey = "drow_ranger";
        silence_duration = new double[]{3.0,4.0,5.0,6.0};
        wave_range_tooltip = 9;
        wave_speed = 2;
        wave_width = 25;
    }

    public static DrowRangerWaveOfSilence instance() {
        if( instance == null ){
            instance = new DrowRangerWaveOfSilence();
        }
        return instance;
    }

    public String getAbilityBehavior() {
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

    public int getAbilityManaCost() {
        return abilityManaCost;
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

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int getKnockbackDistanceMax() {
        return knockback_distance_max;
    }

    public double[] getKnockbackDuration() {
        return knockback_duration;
    }

    public int getKnockbackHeight() {
        return knockback_height;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double[] getSilenceDuration() {
        return silence_duration;
    }

    public int getWaveRangeTooltip() {
        return wave_range_tooltip;
    }

    public int getWaveSpeed() {
        return wave_speed;
    }

    public int getWaveWidth() {
        return wave_width;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DrowRangerWaveOfSilence))
            return false;
        if (object == this)
            return true;
        DrowRangerWaveOfSilence otherObject = (DrowRangerWaveOfSilence) object;
        return otherObject.getKey().equals(getKey());
    }

}
