package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RazorEyeOfTheStorm extends Ability {

    private static RazorEyeOfTheStorm instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] armor_reduction;
    private final int[] damage;
    private final int duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;
    private final double[] strike_interval;
    private final double[] strike_interval_scepter;

    private RazorEyeOfTheStorm() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityCooldown = new int[]{80,70,60};
        abilityManaCost = new int[]{100,150,200};
        abilityModifierSupportValue = .1;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        fightRecapLevel = 1;
        iD = 585;
        key = "razor_eye_of_the_storm";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        armor_reduction = new int[]{1,1,1};
        damage = new int[]{37,50,63};
        duration = 3;
        localizedName = "Eye Of The Storm";
        owningHeroShortKey = "razor";
        radius = new int[]{500,500,500};
        strike_interval = new double[]{0.7,0.6,0.5};
        strike_interval_scepter = new double[]{0.6,0.5,0.4};
    }

    public static RazorEyeOfTheStorm instance() {
        if( instance == null ){
            instance = new RazorEyeOfTheStorm();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
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

    public int[] getArmorReduction() {
        return armor_reduction;
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

    public int[] getRadius() {
        return radius;
    }

    public double[] getStrikeInterval() {
        return strike_interval;
    }

    public double[] getStrikeIntervalScepter() {
        return strike_interval_scepter;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RazorEyeOfTheStorm))
            return false;
        if (object == this)
            return true;
        RazorEyeOfTheStorm otherObject = (RazorEyeOfTheStorm) object;
        return otherObject.getKey().equals(getKey());
    }

}
