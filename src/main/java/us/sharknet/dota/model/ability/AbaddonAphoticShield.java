package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AbaddonAphoticShield extends Ability {

    private static AbaddonAphoticShield instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] damage_absorb;
    private final int duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;

    private AbaddonAphoticShield() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.452,0.452,0.452,0.452};
        abilityCastRange = 5;
        abilityCooldown = new double[]{12.0,10.0,8.0,6.0};
        abilityManaCost = new int[]{100,105,110,115};
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_NOT_MAGIC_IMMUNE_ALLIES";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5586;
        key = "abaddon_aphotic_shield";
        spellImmunityType = "SPELL_IMMUNITY_ALLIES_NO";
        damage_absorb = new double[]{110.0,140.0,170.0,200.0};
        duration = 15;
        localizedName = "Aphotic Shield";
        owningHeroShortKey = "abaddon";
        radius = 675;
    }

    public static AbaddonAphoticShield instance() {
        if( instance == null ){
            instance = new AbaddonAphoticShield();
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

    public double[] getDamageAbsorb() {
        return damage_absorb;
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
        if (!(object instanceof AbaddonAphoticShield))
            return false;
        if (object == this)
            return true;
        AbaddonAphoticShield otherObject = (AbaddonAphoticShield) object;
        return otherObject.getKey().equals(getKey());
    }

}
