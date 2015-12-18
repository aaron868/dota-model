package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SilencerCurseOfTheSilent extends Ability {

    private static SilencerCurseOfTheSilent instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage;
    private final int duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int penalty_duration;
    private final int radius;

    private SilencerCurseOfTheSilent() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 1000;
        abilityCooldown = new int[]{18,16,14,12};
        abilityManaCost = new int[]{75,95,115,135};
        abilityModifierSupportValue = .5;
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 5377;
        key = "silencer_curse_of_the_silent";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage = new int[]{14,21,28,35};
        duration = 7;
        localizedName = "Curse Of The Silent";
        owningHeroShortKey = "silencer";
        penalty_duration = 4;
        radius = 425;
    }

    public static SilencerCurseOfTheSilent instance() {
        if( instance == null ){
            instance = new SilencerCurseOfTheSilent();
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

    public int[] getDamage() {
        return damage;
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

    public int getPenaltyDuration() {
        return penalty_duration;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SilencerCurseOfTheSilent))
            return false;
        if (object == this)
            return true;
        SilencerCurseOfTheSilent otherObject = (SilencerCurseOfTheSilent) object;
        return otherObject.getKey().equals(getKey());
    }

}
