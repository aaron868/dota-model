package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PugnaDecrepify extends Ability {

    private static PugnaDecrepify instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_movement_speed;
    private final int bonus_movement_speed_allies;
    private final int[] bonus_spell_damage_pct;
    private final int bonus_spell_damage_pct_allies;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double tooltip_duration;

    private PugnaDecrepify() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{0.2,0.2,0.2,0.2};
        abilityCastRange = new int[]{700,700,700,700};
        abilityCooldown = new double[]{15.0,12.0,9.0,6.0};
        abilityDuration = new double[]{3.5,3.5,3.5,3.5};
        abilityManaCost = new int[]{60,60,60,60};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_CUSTOM"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_CUSTOM"};
        iD = 5187;
        key = "pugna_decrepify";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bonus_movement_speed = new int[]{-30,-40,-50,-60};
        bonus_movement_speed_allies = 0;
        bonus_spell_damage_pct = new int[]{-30,-40,-50,-60};
        bonus_spell_damage_pct_allies = -25;
        localizedName = "Decrepify";
        ownerKey = "npc_dota_hero_pugna";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        tooltip_duration = 3.5;
    }

    public static PugnaDecrepify instance() {
        if( instance == null ){
            instance = new PugnaDecrepify();
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

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public int[] getBonusMovementSpeed() {
        return bonus_movement_speed;
    }

    public int getBonusMovementSpeedAllies() {
        return bonus_movement_speed_allies;
    }

    public int[] getBonusSpellDamagePct() {
        return bonus_spell_damage_pct;
    }

    public int getBonusSpellDamagePctAllies() {
        return bonus_spell_damage_pct_allies;
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

    public double getTooltipDuration() {
        return tooltip_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PugnaDecrepify))
            return false;
        if (object == this)
            return true;
        PugnaDecrepify otherObject = (PugnaDecrepify) object;
        return otherObject.getKey().equals(getKey());
    }

}
