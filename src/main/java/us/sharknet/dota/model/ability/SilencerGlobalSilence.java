package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SilencerGlobalSilence extends Ability {

    private static SilencerGlobalSilence instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double[] tooltip_duration;

    private SilencerGlobalSilence() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityCooldown = new double[]{13,13,13,13};
        abilityDuration = new double[]{4.0,5.0,6.0};
        abilityManaCost = new int[]{250,375,500};
        abilityModifierSupportValue = .5;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5380;
        key = "silencer_global_silence";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        localizedName = "Global Silence";
        ownerKey = "npc_dota_hero_silencer";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        tooltip_duration = new double[]{4.0,5.0,6.0};
    }

    public static SilencerGlobalSilence instance() {
        if( instance == null ){
            instance = new SilencerGlobalSilence();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityCooldown() {
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
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
