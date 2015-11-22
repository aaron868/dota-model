package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DarkSeerIonShell extends Ability {

    private static DarkSeerIonShell instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final int abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage_per_second;
    private final int duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;

    private DarkSeerIonShell() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{0.4,0.4,0.4,0.4};
        abilityCastRange = 600;
        abilityCooldown = 9;
        abilityManaCost = new int[]{70,90,110,130};
        abilityModifierSupportValue = 0;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_NOT_CREEP_HERO";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_BOTH";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_CREEP"};
        fightRecapLevel = 1;
        iD = 5256;
        key = "dark_seer_ion_shell";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage_per_second = new int[]{30,50,70,90};
        duration = 25;
        localizedName = "Ion Shell";
        owningHeroShortKey = "dark_seer";
        radius = 250;
    }

    public static DarkSeerIonShell instance() {
        if( instance == null ){
            instance = new DarkSeerIonShell();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int getFightRecapLevel() {
        return fightRecapLevel;
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

    public int[] getDamagePerSecond() {
        return damage_per_second;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DarkSeerIonShell))
            return false;
        if (object == this)
            return true;
        DarkSeerIonShell otherObject = (DarkSeerIonShell) object;
        return otherObject.getKey().equals(getKey());
    }

}
