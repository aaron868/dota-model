package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NagaSirenSongOfTheSiren extends Ability {

    private static NagaSirenSongOfTheSiren instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] animation_rate;
    private final double[] duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;
    private final int regen_rate;
    private final int regen_rate_self;
    private final int regen_rate_tooltip_scepter;

    private NagaSirenSongOfTheSiren() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = .8;
        abilityCastRange = new int[]{1250,1250,1250};
        abilityCooldown = new double[]{180.0,120.0,60.0};
        abilityManaCost = new int[]{100,100,100};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        fightRecapLevel = 2;
        iD = 5470;
        key = "naga_siren_song_of_the_siren";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        animation_rate = new double[]{0.55,0.55,0.55};
        duration = new double[]{7.0,7.0,7.0};
        localizedName = "Song Of The Siren";
        owningHeroShortKey = "naga_siren";
        radius = new int[]{1250,1250,1250};
        regen_rate = 8;
        regen_rate_self = 8;
        regen_rate_tooltip_scepter = 8;
    }

    public static NagaSirenSongOfTheSiren instance() {
        if( instance == null ){
            instance = new NagaSirenSongOfTheSiren();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
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

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public double[] getAnimationRate() {
        return animation_rate;
    }

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
        return radius;
    }

    public int getRegenRate() {
        return regen_rate;
    }

    public int getRegenRateSelf() {
        return regen_rate_self;
    }

    public int getRegenRateTooltipScepter() {
        return regen_rate_tooltip_scepter;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof NagaSirenSongOfTheSiren))
            return false;
        if (object == this)
            return true;
        NagaSirenSongOfTheSiren otherObject = (NagaSirenSongOfTheSiren) object;
        return otherObject.getKey().equals(getKey());
    }

}
