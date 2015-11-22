package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PuckWaningRift extends Ability {

    private static PuckWaningRift instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;
    private final double[] silence_duration;

    private PuckWaningRift() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = new double[]{0.1,0.1,0.1,0.1};
        abilityCooldown = 16;
        abilityDamage = new int[]{100,160,220,280};
        abilityManaCost = new int[]{100,110,120,130};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 571;
        key = "puck_waning_rift";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Waning Rift";
        owningHeroShortKey = "puck";
        radius = new int[]{400,400,400,400};
        silence_duration = new double[]{0.75,1.5,2.25,3.0};
    }

    public static PuckWaningRift instance() {
        if( instance == null ){
            instance = new PuckWaningRift();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCooldown() {
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

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
        return radius;
    }

    public double[] getSilenceDuration() {
        return silence_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PuckWaningRift))
            return false;
        if (object == this)
            return true;
        PuckWaningRift otherObject = (PuckWaningRift) object;
        return otherObject.getKey().equals(getKey());
    }

}
