package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WindrunnerFocusfire extends Ability {

    private static WindrunnerFocusfire instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int bonus_attack_speed;
    private final double[] cooldown_scepter;
    private final int[] focusfire_damage_reduction;
    private final int[] focusfire_damage_reduction_scepter;
    private final int focusfire_duration_tooltip;
    private final String localizedName;
    private final String owningHeroShortKey;

    private WindrunnerFocusfire() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = 0;
        abilityCastRange = 600;
        abilityCooldown = new double[]{60.0,60.0,60.0};
        abilityDuration = new double[]{20.0,20.0,20.0};
        abilityManaCost = new int[]{75,100,125};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC","DOTA_UNIT_TARGET_BUILDING"};
        iD = 5133;
        key = "windrunner_focusfire";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bonus_attack_speed = 500;
        cooldown_scepter = new double[]{15.0,15.0,15.0};
        focusfire_damage_reduction = new int[]{-50,-40,-30};
        focusfire_damage_reduction_scepter = new int[]{-30,-15,0};
        focusfire_duration_tooltip = 20;
        localizedName = "Focusfire";
        owningHeroShortKey = "windrunner";
    }

    public static WindrunnerFocusfire instance() {
        if( instance == null ){
            instance = new WindrunnerFocusfire();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
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

    public String getAbilityType() {
        return abilityType;
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

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public double[] getCooldownScepter() {
        return cooldown_scepter;
    }

    public int[] getFocusfireDamageReduction() {
        return focusfire_damage_reduction;
    }

    public int[] getFocusfireDamageReductionScepter() {
        return focusfire_damage_reduction_scepter;
    }

    public int getFocusfireDurationTooltip() {
        return focusfire_duration_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WindrunnerFocusfire))
            return false;
        if (object == this)
            return true;
        WindrunnerFocusfire otherObject = (WindrunnerFocusfire) object;
        return otherObject.getKey().equals(getKey());
    }

}
