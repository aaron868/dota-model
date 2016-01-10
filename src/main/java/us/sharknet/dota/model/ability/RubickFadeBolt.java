package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RubickFadeBolt extends Ability {

    private static RubickFadeBolt instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] creep_attack_damage_reduction;
    private final int[] damage;
    private final double[] duration;
    private final int[] hero_attack_damage_reduction;
    private final int[] jump_damage_reduction_pct;
    private final double[] jump_delay;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private RubickFadeBolt() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.1,0.1,0.1,0.1};
        abilityCastRange = new int[]{800,800,800,800};
        abilityCooldown = new double[]{16.0,14.0,12.0,10.0};
        abilityManaCost = new int[]{120,130,140,150};
        abilityModifierSupportValue = .35;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5450;
        key = "rubick_fade_bolt";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        creep_attack_damage_reduction = new int[]{10,13,15,17};
        damage = new int[]{70,140,210,280};
        duration = new double[]{10.0,10.0,10.0,10.0};
        hero_attack_damage_reduction = new int[]{20,25,30,35};
        jump_damage_reduction_pct = new int[]{4,4,4,4};
        jump_delay = new double[]{0.25,0.25,0.25,0.25};
        localizedName = "Fade Bolt";
        ownerKey = "npc_dota_hero_rubick";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 440;
    }

    public static RubickFadeBolt instance() {
        if( instance == null ){
            instance = new RubickFadeBolt();
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

    public int[] getCreepAttackDamageReduction() {
        return creep_attack_damage_reduction;
    }

    public int[] getDamage() {
        return damage;
    }

    public double[] getDuration() {
        return duration;
    }

    public int[] getHeroAttackDamageReduction() {
        return hero_attack_damage_reduction;
    }

    public int[] getJumpDamageReductionPct() {
        return jump_damage_reduction_pct;
    }

    public double[] getJumpDelay() {
        return jump_delay;
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

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RubickFadeBolt))
            return false;
        if (object == this)
            return true;
        RubickFadeBolt otherObject = (RubickFadeBolt) object;
        return otherObject.getKey().equals(getKey());
    }

}
