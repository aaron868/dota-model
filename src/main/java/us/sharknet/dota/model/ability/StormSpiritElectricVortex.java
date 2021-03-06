package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class StormSpiritElectricVortex extends Ability {

    private static StormSpiritElectricVortex instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration;
    private final int electric_vortex_pull_tether_range;
    private final int electric_vortex_pull_units_per_second;
    private final int electric_vortex_self_slow;
    private final int electric_vortex_self_slow_duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private StormSpiritElectricVortex() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{300,300,300,300};
        abilityCooldown = new double[]{21.0,20.0,19.0,18.0};
        abilityDuration = new double[]{1.0,1.5,2.0,2.5};
        abilityManaCost = new int[]{85,85,85,85};
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_NOT_ANCIENTS"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5099;
        key = "storm_spirit_electric_vortex";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration = new double[]{1.0,1.5,2.0,2.5};
        electric_vortex_pull_tether_range = 12;
        electric_vortex_pull_units_per_second = 100;
        electric_vortex_self_slow = -50;
        electric_vortex_self_slow_duration = 3;
        localizedName = "Electric Vortex";
        ownerKey = "npc_dota_hero_storm_spirit";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static StormSpiritElectricVortex instance() {
        if( instance == null ){
            instance = new StormSpiritElectricVortex();
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

    public int getElectricVortexPullTetherRange() {
        return electric_vortex_pull_tether_range;
    }

    public int getElectricVortexPullUnitsPerSecond() {
        return electric_vortex_pull_units_per_second;
    }

    public int getElectricVortexSelfSlow() {
        return electric_vortex_self_slow;
    }

    public int getElectricVortexSelfSlowDuration() {
        return electric_vortex_self_slow_duration;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof StormSpiritElectricVortex))
            return false;
        if (object == this)
            return true;
        StormSpiritElectricVortex otherObject = (StormSpiritElectricVortex) object;
        return otherObject.getKey().equals(getKey());
    }

}
