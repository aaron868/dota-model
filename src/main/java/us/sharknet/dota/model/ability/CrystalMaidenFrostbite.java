package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class CrystalMaidenFrostbite extends Ability {

    private static CrystalMaidenFrostbite instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int creep_damage_tooltip;
    private final double[] creep_duration;
    private final int damage;
    private final int damage_per_second_tooltip;
    private final double[] duration;
    private final int[] hero_damage_tooltip;
    private final String localizedName;
    private final String owningHeroShortKey;

    private CrystalMaidenFrostbite() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 500;
        abilityCooldown = new int[]{9,8,7,6};
        abilityManaCost = new int[]{115,125,140,150};
        abilityModifierSupportValue = .5;
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5127;
        key = "crystal_maiden_frostbite";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        creep_damage_tooltip = 1000;
        creep_duration = new double[]{10.0,10.0,10.0,10.0};
        damage = 1;
        damage_per_second_tooltip = 50;
        duration = new double[]{1.5,2.0,2.5,3.0};
        hero_damage_tooltip = new int[]{150,200,250,300};
        localizedName = "Frostbite";
        owningHeroShortKey = "crystal_maiden";
    }

    public static CrystalMaidenFrostbite instance() {
        if( instance == null ){
            instance = new CrystalMaidenFrostbite();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int[] getAbilityCooldown() {
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

    public int getCreepDamageTooltip() {
        return creep_damage_tooltip;
    }

    public double[] getCreepDuration() {
        return creep_duration;
    }

    public int getDamage() {
        return damage;
    }

    public int getDamagePerSecondTooltip() {
        return damage_per_second_tooltip;
    }

    public double[] getDuration() {
        return duration;
    }

    public int[] getHeroDamageTooltip() {
        return hero_damage_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof CrystalMaidenFrostbite))
            return false;
        if (object == this)
            return true;
        CrystalMaidenFrostbite otherObject = (CrystalMaidenFrostbite) object;
        return otherObject.getKey().equals(getKey());
    }

}
