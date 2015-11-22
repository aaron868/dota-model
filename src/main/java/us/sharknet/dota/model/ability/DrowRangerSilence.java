package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DrowRangerSilence extends Ability {

    private static DrowRangerSilence instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int silence_radius;

    private DrowRangerSilence() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{0.4,0.4,0.4,0.4};
        abilityCastRange = 900;
        abilityCooldown = new double[]{13.0,13.0,13.0,13.0};
        abilityDamage = new int[]{0,0,0,0};
        abilityDuration = new double[]{3.0,4.0,5.0,6.0};
        abilityManaCost = new int[]{90,90,90,90};
        fightRecapLevel = 1;
        iD = 5020;
        key = "drow_ranger_silence";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration = new double[]{3.0,4.0,5.0,6.0};
        localizedName = "Silence";
        owningHeroShortKey = "drow_ranger";
        silence_radius = 300;
    }

    public static DrowRangerSilence instance() {
        if( instance == null ){
            instance = new DrowRangerSilence();
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

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public int getSilenceRadius() {
        return silence_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DrowRangerSilence))
            return false;
        if (object == this)
            return true;
        DrowRangerSilence otherObject = (DrowRangerSilence) object;
        return otherObject.getKey().equals(getKey());
    }

}
