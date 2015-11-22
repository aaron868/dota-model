package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BaneNightmare extends Ability {

    private static BaneNightmare instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final int[] abilityCooldown;
    private final int abilityDamage;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] animation_rate;
    private final int[] cast_range_tooltip;
    private final double[] duration;
    private final String localizedName;
    private final int nightmare_dot_interval;
    private final int nightmare_invuln_time;
    private final String owningHeroShortKey;

    private BaneNightmare() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{0.5,0.5,0.5,0.5};
        abilityCastRange = new int[]{500,550,600,650};
        abilityCooldown = new int[]{16,15,14,13};
        abilityDamage = 20;
        abilityDuration = new double[]{4.0,5.0,6.0,7.0};
        abilityManaCost = new int[]{165,165,165,165};
        abilityModifierSupportValue = .5;
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_NOT_MAGIC_IMMUNE_ALLIES";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_BOTH";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_CREEP"};
        iD = 5014;
        key = "bane_nightmare";
        spellImmunityType = "SPELL_IMMUNITY_ALLIES_NO";
        animation_rate = new double[]{0.2,0.2,0.2,0.2};
        cast_range_tooltip = new int[]{500,550,600,650};
        duration = new double[]{4.0,5.0,6.0,7.0};
        localizedName = "Nightmare";
        nightmare_dot_interval = 1;
        nightmare_invuln_time = 1;
        owningHeroShortKey = "bane";
    }

    public static BaneNightmare instance() {
        if( instance == null ){
            instance = new BaneNightmare();
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

    public int getAbilityDamage() {
        return abilityDamage;
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

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public double[] getAnimationRate() {
        return animation_rate;
    }

    public int[] getCastRangeTooltip() {
        return cast_range_tooltip;
    }

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getNightmareDotInterval() {
        return nightmare_dot_interval;
    }

    public int getNightmareInvulnTime() {
        return nightmare_invuln_time;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BaneNightmare))
            return false;
        if (object == this)
            return true;
        BaneNightmare otherObject = (BaneNightmare) object;
        return otherObject.getKey().equals(getKey());
    }

}
