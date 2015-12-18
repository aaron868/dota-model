package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NecrolyteDeathPulse extends Ability {

    private static NecrolyteDeathPulse instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int area_of_effect;
    private final int[] heal;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int projectile_speed;

    private NecrolyteDeathPulse() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = 0;
        abilityCooldown = new int[]{8,7,6,5};
        abilityDamage = new int[]{125,175,225,275};
        abilityManaCost = new int[]{125,145,165,185};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 5158;
        key = "necrolyte_death_pulse";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        area_of_effect = 475;
        heal = new int[]{70,90,110,130};
        localizedName = "Death Pulse";
        owningHeroShortKey = "necrolyte";
        projectile_speed = 400;
    }

    public static NecrolyteDeathPulse instance() {
        if( instance == null ){
            instance = new NecrolyteDeathPulse();
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

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int getAreaOfEffect() {
        return area_of_effect;
    }

    public int[] getHeal() {
        return heal;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getProjectileSpeed() {
        return projectile_speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof NecrolyteDeathPulse))
            return false;
        if (object == this)
            return true;
        NecrolyteDeathPulse otherObject = (NecrolyteDeathPulse) object;
        return otherObject.getKey().equals(getKey());
    }

}
