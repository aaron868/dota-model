package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DrowRangerWaveOfSilence extends Ability {

    private static DrowRangerWaveOfSilence instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int knockback_distance_max;
    private final double[] knockback_duration;
    private final int knockback_height;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double[] silence_duration;
    private final int wave_range_tooltip;
    private final int wave_speed;
    private final int wave_width;

    private DrowRangerWaveOfSilence() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{.4,.4,.4,.4};
        abilityCastRange = new int[]{900,900,900,900};
        abilityCooldown = new double[]{13,13,13,13};
        abilityManaCost = new int[]{90,90,90,90};
        iD = 5632;
        key = "drow_ranger_wave_of_silence";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        knockback_distance_max = 35;
        knockback_duration = new double[]{0.6,0.7,0.8,0.9};
        knockback_height = 0;
        localizedName = "Gust";
        ownerKey = "npc_dota_hero_drow_ranger";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        silence_duration = new double[]{3.0,4.0,5.0,6.0};
        wave_range_tooltip = 900;
        wave_speed = 2;
        wave_width = 250;
    }

    public static DrowRangerWaveOfSilence instance() {
        if( instance == null ){
            instance = new DrowRangerWaveOfSilence();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
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
