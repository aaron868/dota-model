package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MagnataurReversePolarity extends Ability {

    private static MagnataurReversePolarity instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] creep_stun_duration;
    private final double[] hero_stun_duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] polarity_damage;
    private final double[] pull_duration;
    private final int pull_radius;

    private MagnataurReversePolarity() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityCastRange = new int[]{410,410,410};
        abilityCooldown = new double[]{120,110,100};
        abilityManaCost = new int[]{200,250,300};
        abilityModifierSupportValue = .5;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5521;
        key = "magnataur_reverse_polarity";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        creep_stun_duration = new double[]{3.0,4.0,5.0};
        hero_stun_duration = new double[]{2.25,3.0,3.75};
        localizedName = "Reverse Polarity";
        ownerKey = "npc_dota_hero_magnataur";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
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

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
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

    public String getOwnerKey() {
        return ownerKey;
    }

    public AbilityOwnerType getOwnerType() {
        return ownerType;
    }

    public boolean isPassive() {
        return passive;
    }

    public boolean isPlaceholder() {
        return placeholder;
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
