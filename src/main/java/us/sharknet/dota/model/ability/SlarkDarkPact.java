package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SlarkDarkPact extends Ability {

    private static SlarkDarkPact instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double delay;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int pulse_duration;
    private final double pulse_interval;
    private final int radius;
    private final int[] total_damage;
    private final int total_pulses;

    private SlarkDarkPact() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0.001,0.001,0.001,0.001};
        abilityCastRange = 325;
        abilityCooldown = new double[]{9.0,8.0,7.0,6.0};
        abilityManaCost = new int[]{55,50,45,40};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 5494;
        key = "slark_dark_pact";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        delay = 1.5;
        localizedName = "Dark Pact";
        owningHeroShortKey = "slark";
        pulse_duration = 1;
        pulse_interval = .1;
        radius = 325;
        total_damage = new int[]{75,150,225,300};
        total_pulses = 10;
    }

    public static SlarkDarkPact instance() {
        if( instance == null ){
            instance = new SlarkDarkPact();
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

    public double getDelay() {
        return delay;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getPulseDuration() {
        return pulse_duration;
    }

    public double getPulseInterval() {
        return pulse_interval;
    }

    public int getRadius() {
        return radius;
    }

    public int[] getTotalDamage() {
        return total_damage;
    }

    public int getTotalPulses() {
        return total_pulses;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SlarkDarkPact))
            return false;
        if (object == this)
            return true;
        SlarkDarkPact otherObject = (SlarkDarkPact) object;
        return otherObject.getKey().equals(getKey());
    }

}
