package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SilencerCurseOfTheSilent extends Ability {

    private static SilencerCurseOfTheSilent instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int abilityDuration;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] health_damage;
    private final String localizedName;
    private final int[] mana_damage;
    private final String owningHeroShortKey;
    private final int[] radius;
    private final int tooltip_duration;

    private SilencerCurseOfTheSilent() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 800;
        abilityCooldown = new double[]{20.0,16.0,12.0,8.0};
        abilityDuration = 6;
        abilityManaCost = new int[]{75,95,115,135};
        abilityModifierSupportValue = .5;
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 5377;
        key = "silencer_curse_of_the_silent";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        health_damage = new int[]{20,35,50,65};
        localizedName = "Curse Of The Silent";
        mana_damage = new int[]{8,16,24,32};
        owningHeroShortKey = "silencer";
        radius = new int[]{350,350,350,350};
        tooltip_duration = 6;
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

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityDuration() {
        return abilityDuration;
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

    public int[] getHealthDamage() {
        return health_damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getManaDamage() {
        return mana_damage;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
        return radius;
    }

    public int getTooltipDuration() {
        return tooltip_duration;
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
