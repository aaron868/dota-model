package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class OracleFatesEdict extends Ability {

    private static OracleFatesEdict instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration;
    private final String localizedName;
    private final int magic_damage_resistance_pct_tooltip;
    private final String owningHeroShortKey;

    private OracleFatesEdict() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = .3;
        abilityCastRange = 7;
        abilityCooldown = 12;
        abilityManaCost = 5;
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_NOT_MAGIC_IMMUNE_ALLIES";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY","DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5638;
        key = "oracle_fates_edict";
        spellImmunityType = "SPELL_IMMUNITY_ALLIES_NO";
        duration = new double[]{3.0,4.0,5.0,6.0};
        localizedName = "Fates Edict";
        magic_damage_resistance_pct_tooltip = 1;
        owningHeroShortKey = "oracle";
    }

    public static OracleFatesEdict instance() {
        if( instance == null ){
            instance = new OracleFatesEdict();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
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

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMagicDamageResistancePctTooltip() {
        return magic_damage_resistance_pct_tooltip;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
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
