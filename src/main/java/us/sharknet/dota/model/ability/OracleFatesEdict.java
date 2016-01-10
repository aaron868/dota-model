package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class OracleFatesEdict extends Ability {

    private static OracleFatesEdict instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration;
    private final String localizedName;
    private final int magic_damage_resistance_pct_tooltip;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private OracleFatesEdict() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{.3,.3,.3,.3};
        abilityCastRange = new int[]{500,600,700,800};
        abilityCooldown = new double[]{16,13,10,7};
        abilityManaCost = new int[]{50,50,50,50};
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_NOT_MAGIC_IMMUNE_ALLIES"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY","DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5638;
        key = "oracle_fates_edict";
        spellImmunityType = "SPELL_IMMUNITY_ALLIES_NO";
        duration = new double[]{3.0,3.5,4.0,4.5};
        localizedName = "Fates Edict";
        magic_damage_resistance_pct_tooltip = 100;
        ownerKey = "npc_dota_hero_oracle";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static OracleFatesEdict instance() {
        if( instance == null ){
            instance = new OracleFatesEdict();
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

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMagicDamageResistancePctTooltip() {
        return magic_damage_resistance_pct_tooltip;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof OracleFatesEdict))
            return false;
        if (object == this)
            return true;
        OracleFatesEdict otherObject = (OracleFatesEdict) object;
        return otherObject.getKey().equals(getKey());
    }

}
