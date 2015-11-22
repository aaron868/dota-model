package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MagnataurReversePolarity extends Ability {

    private static MagnataurReversePolarity instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final int[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] creep_stun_duration;
    private final double[] hero_stun_duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] polarity_damage;
    private final double[] pull_duration;
    private final int pull_radius;

    private MagnataurReversePolarity() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityCastRange = new int[]{410,410,410};
        abilityCooldown = new int[]{120,110,100};
        abilityManaCost = new int[]{200,250,300};
        abilityModifierSupportValue = .5;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 2;
        iD = 5521;
        key = "magnataur_reverse_polarity";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        creep_stun_duration = new double[]{3.0,4.0,5.0};
        hero_stun_duration = new double[]{2.25,3.0,3.75};
        localizedName = "Reverse Polarity";
        owningHeroShortKey = "magnataur";
        polarity_damage = new int[]{50,125,200};
        pull_duration = new double[]{0.0,0.0,0.0};
        pull_radius = 410;
    }

    public static MagnataurReversePolarity instance() {
        if( instance == null ){
            instance = new MagnataurReversePolarity();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCastRange() {
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

    public double[] getCreepStunDuration() {
        return creep_stun_duration;
    }

    public double[] getHeroStunDuration() {
        return hero_stun_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getPolarityDamage() {
        return polarity_damage;
    }

    public double[] getPullDuration() {
        return pull_duration;
    }

    public int getPullRadius() {
        return pull_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MagnataurReversePolarity))
            return false;
        if (object == this)
            return true;
        MagnataurReversePolarity otherObject = (MagnataurReversePolarity) object;
        return otherObject.getKey().equals(getKey());
    }

}
