package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SilencerGlaivesOfWisdom extends Ability {

    private static SilencerGlaivesOfWisdom instance;

    private final String[] abilityBehavior;
    private final int abilityCastRange;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] intellect_damage_pct;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int steal_range;

    private SilencerGlaivesOfWisdom() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_AUTOCAST","DOTA_ABILITY_BEHAVIOR_ATTACK"};
        abilityCastRange = 600;
        abilityDuration = new double[]{0.0,0.0,0.0,0.0};
        abilityManaCost = new int[]{15,15,15,15};
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5378;
        key = "silencer_glaives_of_wisdom";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        intellect_damage_pct = new double[]{30.0,50.0,70.0,90.0};
        localizedName = "Glaives Of Wisdom";
        owningHeroShortKey = "silencer";
        steal_range = 925;
    }

    public static SilencerGlaivesOfWisdom instance() {
        if( instance == null ){
            instance = new SilencerGlaivesOfWisdom();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
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

    public double[] getIntellectDamagePct() {
        return intellect_damage_pct;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getStealRange() {
        return steal_range;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SilencerGlaivesOfWisdom))
            return false;
        if (object == this)
            return true;
        SilencerGlaivesOfWisdom otherObject = (SilencerGlaivesOfWisdom) object;
        return otherObject.getKey().equals(getKey());
    }

}
