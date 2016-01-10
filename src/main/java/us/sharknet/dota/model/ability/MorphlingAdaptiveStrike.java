package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MorphlingAdaptiveStrike extends Ability {

    private static MorphlingAdaptiveStrike instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int damage_base;
    private final double[] damage_max;
    private final double[] damage_min;
    private final int knockback_max;
    private final int knockback_min;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int projectile_speed;
    private final double[] range_tooltip;
    private final double[] stun_max;
    private final double[] stun_min;

    private MorphlingAdaptiveStrike() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{.25,.25,.25,.25};
        abilityCastRange = new int[]{600,700,800,900};
        abilityCooldown = new double[]{10,10,10,10};
        abilityManaCost = new int[]{100,90,80,70};
        abilityModifierSupportValue = .3;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_NOT_ANCIENTS"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5053;
        key = "morphling_adaptive_strike";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage_base = 1;
        damage_max = new double[]{0.5,1.0,1.5,2.0};
        damage_min = new double[]{0.25,0.25,0.25,0.25};
        knockback_max = 300;
        knockback_min = 100;
        localizedName = "Adaptive Strike";
        ownerKey = "npc_dota_hero_morphling";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        projectile_speed = 115;
        range_tooltip = new double[]{600.0,700.0,800.0,900.0};
        stun_max = new double[]{1.25,2.25,3.25,4.25};
        stun_min = new double[]{0.25,0.25,0.25,0.25};
    }

    public static MorphlingAdaptiveStrike instance() {
        if( instance == null ){
            instance = new MorphlingAdaptiveStrike();
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

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String[] getAbilityUnitTargetFlags() {
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

    public int getDamageBase() {
        return damage_base;
    }

    public double[] getDamageMax() {
        return damage_max;
    }

    public double[] getDamageMin() {
        return damage_min;
    }

    public int getKnockbackMax() {
        return knockback_max;
    }

    public int getKnockbackMin() {
        return knockback_min;
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

    public int getProjectileSpeed() {
        return projectile_speed;
    }

    public double[] getRangeTooltip() {
        return range_tooltip;
    }

    public double[] getStunMax() {
        return stun_max;
    }

    public double[] getStunMin() {
        return stun_min;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MorphlingAdaptiveStrike))
            return false;
        if (object == this)
            return true;
        MorphlingAdaptiveStrike otherObject = (MorphlingAdaptiveStrike) object;
        return otherObject.getKey().equals(getKey());
    }

}
