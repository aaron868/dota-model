package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class GyrocopterRocketBarrage extends Ability {

    private static GyrocopterRocketBarrage instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;
    private final int rockets_per_second;

    private GyrocopterRocketBarrage() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = 0;
        abilityCastRange = 0;
        abilityCooldown = new double[]{7.0,6.5,6,5.5};
        abilityDamage = new int[]{7,12,17,22};
        abilityDuration = new int[]{3,3,3,3};
        abilityManaCost = new int[]{90,90,90,90};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 5361;
        key = "gyrocopter_rocket_barrage";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Rocket Barrage";
        owningHeroShortKey = "gyrocopter";
        radius = 4;
        rockets_per_second = 1;
    }

    public static GyrocopterRocketBarrage instance() {
        if( instance == null ){
            instance = new GyrocopterRocketBarrage();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int[] getAbilityDuration() {
        return abilityDuration;
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

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }

    public int getRocketsPerSecond() {
        return rockets_per_second;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof GyrocopterRocketBarrage))
            return false;
        if (object == this)
            return true;
        GyrocopterRocketBarrage otherObject = (GyrocopterRocketBarrage) object;
        return otherObject.getKey().equals(getKey());
    }

}
