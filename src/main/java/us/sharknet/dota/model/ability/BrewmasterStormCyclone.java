package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BrewmasterStormCyclone extends Ability {

    private static BrewmasterStormCyclone instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int duration_hero;
    private final double[] duration_unit;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private BrewmasterStormCyclone() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{.4,.4,.4,.4};
        abilityCastRange = new int[]{600,600,600,600};
        abilityCooldown = new double[]{8,8,8,8};
        abilityManaCost = new int[]{150,150,150,150};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_CREEP"};
        iD = 5409;
        key = "brewmaster_storm_cyclone";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration_hero = 6;
        duration_unit = new double[]{20.0,20.0,20.0,20.0};
        localizedName = "Cyclone";
        ownerKey = "npc_dota_brewmaster_storm";
        ownerType = AbilityOwnerType.Summoned;
        passive = false;
        placeholder = false;
    }

    public static BrewmasterStormCyclone instance() {
        if( instance == null ){
            instance = new BrewmasterStormCyclone();
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

    public int getDurationHero() {
        return duration_hero;
    }

    public double[] getDurationUnit() {
        return duration_unit;
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
        if (!(object instanceof BrewmasterStormCyclone))
            return false;
        if (object == this)
            return true;
        BrewmasterStormCyclone otherObject = (BrewmasterStormCyclone) object;
        return otherObject.getKey().equals(getKey());
    }

}
