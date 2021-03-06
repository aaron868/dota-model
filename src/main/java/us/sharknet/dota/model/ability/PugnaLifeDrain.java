package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PugnaLifeDrain extends Ability {

    private static PugnaLifeDrain instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityChannelTime;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] cast_range_tooltip;
    private final int duration_tooltip;
    private final int[] health_drain;
    private final int[] health_drain_scepter;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double[] scepter_cooldown;
    private final double[] tick_rate;

    private PugnaLifeDrain() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_CHANNELLED","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.2,0.2,0.2};
        abilityCastRange = new int[]{900,1050,1200};
        abilityChannelTime = new double[]{1,1,1,1};
        abilityCooldown = new double[]{22.0,22.0,22.0};
        abilityManaCost = new int[]{125,175,225};
        abilityModifierSupportValue = 0;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES","DOTA_UNIT_TARGET_FLAG_FOW_VISIBLE"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_BOTH"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5189;
        key = "pugna_life_drain";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        cast_range_tooltip = new int[]{900,1050,1200};
        duration_tooltip = 10;
        health_drain = new int[]{150,200,250};
        health_drain_scepter = new int[]{180,240,300};
        localizedName = "Life Drain";
        ownerKey = "npc_dota_hero_pugna";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        scepter_cooldown = new double[]{0.0,0.0,0.0};
        tick_rate = new double[]{0.25,0.25,0.25};
    }

    public static PugnaLifeDrain instance() {
        if( instance == null ){
            instance = new PugnaLifeDrain();
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

    public double[] getAbilityChannelTime() {
        return abilityChannelTime;
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

    public String getAbilityType() {
        return abilityType;
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

    public int[] getCastRangeTooltip() {
        return cast_range_tooltip;
    }

    public int getDurationTooltip() {
        return duration_tooltip;
    }

    public int[] getHealthDrain() {
        return health_drain;
    }

    public int[] getHealthDrainScepter() {
        return health_drain_scepter;
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

    public double[] getScepterCooldown() {
        return scepter_cooldown;
    }

    public double[] getTickRate() {
        return tick_rate;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PugnaLifeDrain))
            return false;
        if (object == this)
            return true;
        PugnaLifeDrain otherObject = (PugnaLifeDrain) object;
        return otherObject.getKey().equals(getKey());
    }

}
