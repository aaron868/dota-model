package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DeathProphetSilence extends Ability {

    private static DeathProphetSilence instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;

    private DeathProphetSilence() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{0.5,0.5,0.5,0.5};
        abilityCastRange = 900;
        abilityCooldown = 15;
        abilityDuration = new double[]{3.0,4.0,5.0,6.0};
        abilityManaCost = new int[]{80,80,80,80};
        iD = 5091;
        key = "death_prophet_silence";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration = new double[]{3.0,4.0,5.0,6.0};
        localizedName = "Silence";
        owningHeroShortKey = "death_prophet";
        radius = 425;
    }

    public static DeathProphetSilence instance() {
        if( instance == null ){
            instance = new DeathProphetSilence();
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

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DeathProphetSilence))
            return false;
        if (object == this)
            return true;
        DeathProphetSilence otherObject = (DeathProphetSilence) object;
        return otherObject.getKey().equals(getKey());
    }

}
