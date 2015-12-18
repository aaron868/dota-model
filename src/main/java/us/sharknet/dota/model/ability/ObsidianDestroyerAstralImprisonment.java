package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ObsidianDestroyerAstralImprisonment extends Ability {

    private static ObsidianDestroyerAstralImprisonment instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final int[] abilityCooldown;
    private final int abilityDuration;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int prison_duration;
    private final int radius;

    private ObsidianDestroyerAstralImprisonment() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{0.25,0.25,0.25,0.25};
        abilityCastRange = new int[]{450,500,550,600};
        abilityCooldown = new int[]{20,17,14,11};
        abilityDuration = 4;
        abilityManaCost = new int[]{120,140,160,180};
        abilityModifierSupportValue = .5;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_NOT_MAGIC_IMMUNE_ALLIES";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY","DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5392;
        key = "obsidian_destroyer_astral_imprisonment";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage = new int[]{75,150,225,300};
        localizedName = "Astral Imprisonment";
        owningHeroShortKey = "obsidian_destroyer";
        prison_duration = 4;
        radius = 400;
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

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
    }

    public String[] getAbilityUnitTargetTeam() {
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

    public int[] getDamage() {
        return damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getPrisonDuration() {
        return prison_duration;
    }

    public int getRadius() {
        return radius;
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
