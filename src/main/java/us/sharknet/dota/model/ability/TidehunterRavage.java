package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TidehunterRavage extends Ability {

    private static TidehunterRavage instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;
    private final int speed;

    private TidehunterRavage() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityCastRange = 0;
        abilityCooldown = new double[]{150.0,150.0,150.0};
        abilityDamage = new int[]{200,290,380};
        abilityManaCost = new int[]{150,225,325};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 2;
        iD = 5121;
        key = "tidehunter_ravage";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration = new double[]{2.02,2.32,2.77};
        localizedName = "Ravage";
        owningHeroShortKey = "tidehunter";
        radius = 1025;
        speed = 775;
    }

    public static TidehunterRavage instance() {
        if( instance == null ){
            instance = new TidehunterRavage();
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

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
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

    public double[] getDuration() {
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

    public int getSpeed() {
        return speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TidehunterRavage))
            return false;
        if (object == this)
            return true;
        TidehunterRavage otherObject = (TidehunterRavage) object;
        return otherObject.getKey().equals(getKey());
    }

}
