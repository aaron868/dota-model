package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ChenTestOfFaithTeleport extends Ability {

    private static ChenTestOfFaithTeleport instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] hero_teleport_delay;
    private final String localizedName;
    private final String owningHeroShortKey;

    private ChenTestOfFaithTeleport() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{600,600,600,600};
        abilityCooldown = new double[]{24.0,24.0,24.0,24.0};
        abilityManaCost = new int[]{200,200,200,200};
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_NOT_CREEP_HERO";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_CREEP"};
        iD = 5522;
        key = "chen_test_of_faith_teleport";
        spellImmunityType = "SPELL_IMMUNITY_ALLIES_NO";
        hero_teleport_delay = new double[]{6.0,5.0,4.0,3.0};
        localizedName = "Test Of Faith Teleport";
        owningHeroShortKey = "chen";
    }

    public static ChenTestOfFaithTeleport instance() {
        if( instance == null ){
            instance = new ChenTestOfFaithTeleport();
        }
        return instance;
    }

    public String getAbilityBehavior() {
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

    public double[] getHeroTeleportDelay() {
        return hero_teleport_delay;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ChenTestOfFaithTeleport))
            return false;
        if (object == this)
            return true;
        ChenTestOfFaithTeleport otherObject = (ChenTestOfFaithTeleport) object;
        return otherObject.getKey().equals(getKey());
    }

}
