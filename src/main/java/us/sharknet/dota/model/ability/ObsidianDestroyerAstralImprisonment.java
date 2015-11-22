package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ObsidianDestroyerAstralImprisonment extends Ability {

    private static ObsidianDestroyerAstralImprisonment instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] int_steal;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double[] prison_duration;
    private final int steal_duration;

    private ObsidianDestroyerAstralImprisonment() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{0.25,0.25,0.25,0.25};
        abilityCastRange = 5;
        abilityCooldown = new double[]{18.0,16.0,14.0,12.0};
        abilityDuration = new double[]{1.0,2.0,3.0,4.0};
        abilityManaCost = new int[]{120,140,160,180};
        abilityModifierSupportValue = .5;
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_NOT_CREEP_HERO","DOTA_UNIT_TARGET_FLAG_NOT_MAGIC_IMMUNE_ALLIES"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY","DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        iD = 5392;
        key = "obsidian_destroyer_astral_imprisonment";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        int_steal = new int[]{4,7,10,13};
        localizedName = "Astral Imprisonment";
        owningHeroShortKey = "obsidian_destroyer";
        prison_duration = new double[]{1.0,2.0,3.0,4.0};
        steal_duration = 5;
    }

    public static ObsidianDestroyerAstralImprisonment instance() {
        if( instance == null ){
            instance = new ObsidianDestroyerAstralImprisonment();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
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

    public String[] getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
    }

    public String[] getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String getAbilityUnitTargetType() {
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

    public int[] getIntSteal() {
        return int_steal;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double[] getPrisonDuration() {
        return prison_duration;
    }

    public int getStealDuration() {
        return steal_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ObsidianDestroyerAstralImprisonment))
            return false;
        if (object == this)
            return true;
        ObsidianDestroyerAstralImprisonment otherObject = (ObsidianDestroyerAstralImprisonment) object;
        return otherObject.getKey().equals(getKey());
    }

}
