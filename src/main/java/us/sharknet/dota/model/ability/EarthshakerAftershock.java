package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EarthshakerAftershock extends Ability {

    private static EarthshakerAftershock instance;

    private final String abilityBehavior;
    private final int[] abilityDamage;
    private final double[] abilityDuration;
    private final int abilityModifierSupportBonus;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int aftershock_range;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double[] tooltip_duration;

    private EarthshakerAftershock() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityDamage = new int[]{50,75,100,125};
        abilityDuration = new double[]{0.6,0.9,1.2,1.5};
        abilityModifierSupportBonus = 1;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 525;
        key = "earthshaker_aftershock";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        aftershock_range = 3;
        localizedName = "Aftershock";
        owningHeroShortKey = "earthshaker";
        tooltip_duration = new double[]{0.6,0.9,1.2,1.5};
    }

    public static EarthshakerAftershock instance() {
        if( instance == null ){
            instance = new EarthshakerAftershock();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int getAbilityModifierSupportBonus() {
        return abilityModifierSupportBonus;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int getAftershockRange() {
        return aftershock_range;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double[] getTooltipDuration() {
        return tooltip_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EarthshakerAftershock))
            return false;
        if (object == this)
            return true;
        EarthshakerAftershock otherObject = (EarthshakerAftershock) object;
        return otherObject.getKey().equals(getKey());
    }

}
