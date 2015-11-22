package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MagnataurEmpower extends Ability {

    private static MagnataurEmpower instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_damage_pct;
    private final int[] cleave_damage_pct;
    private final int cleave_radius;
    private final double[] empower_duration;
    private final String localizedName;
    private final String owningHeroShortKey;

    private MagnataurEmpower() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 8;
        abilityCooldown = 8;
        abilityManaCost = new int[]{30,40,50,60};
        abilityModifierSupportValue = .3;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5519;
        key = "magnataur_empower";
        spellImmunityType = "SPELL_IMMUNITY_ALLIES_YES";
        bonus_damage_pct = new int[]{20,30,40,50};
        cleave_damage_pct = new int[]{20,30,40,50};
        cleave_radius = 2;
        empower_duration = new double[]{40.0,40.0,40.0,40.0};
        localizedName = "Empower";
        owningHeroShortKey = "magnataur";
    }

    public static MagnataurEmpower instance() {
        if( instance == null ){
            instance = new MagnataurEmpower();
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

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
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

    public int[] getBonusDamagePct() {
        return bonus_damage_pct;
    }

    public int[] getCleaveDamagePct() {
        return cleave_damage_pct;
    }

    public int getCleaveRadius() {
        return cleave_radius;
    }

    public double[] getEmpowerDuration() {
        return empower_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MagnataurEmpower))
            return false;
        if (object == this)
            return true;
        MagnataurEmpower otherObject = (MagnataurEmpower) object;
        return otherObject.getKey().equals(getKey());
    }

}
