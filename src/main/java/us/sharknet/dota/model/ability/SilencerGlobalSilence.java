package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SilencerGlobalSilence extends Ability {

    private static SilencerGlobalSilence instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration_scepter;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double[] tooltip_duration;

    private SilencerGlobalSilence() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityCooldown = 13;
        abilityDuration = new double[]{4.0,5.0,6.0};
        abilityManaCost = new int[]{250,375,500};
        abilityModifierSupportValue = .5;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        fightRecapLevel = 2;
        iD = 538;
        key = "silencer_global_silence";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        duration_scepter = new double[]{4.0,5.0,6.0};
        localizedName = "Global Silence";
        owningHeroShortKey = "silencer";
        tooltip_duration = new double[]{4.0,5.0,6.0};
    }

    public static SilencerGlobalSilence instance() {
        if( instance == null ){
            instance = new SilencerGlobalSilence();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
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

    public double[] getDurationScepter() {
        return duration_scepter;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double[] getTooltipDuration() {
        return tooltip_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SilencerGlobalSilence))
            return false;
        if (object == this)
            return true;
        SilencerGlobalSilence otherObject = (SilencerGlobalSilence) object;
        return otherObject.getKey().equals(getKey());
    }

}
