package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WitchDoctorMaledict extends Ability {

    private static WitchDoctorMaledict instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityDamage;
    private final int abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_damage;
    private final int bonus_damage_threshold;
    private final int duration_tooltip;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;
    private final int ticks;

    private WitchDoctorMaledict() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.35,0.35,0.35,0.35};
        abilityCastRange = 525;
        abilityCooldown = 2;
        abilityDamage = new int[]{5,10,15,20};
        abilityDuration = 12;
        abilityManaCost = new int[]{120,120,120,120};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        fightRecapLevel = 1;
        iD = 5140;
        key = "witch_doctor_maledict";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bonus_damage = new int[]{16,24,32,40};
        bonus_damage_threshold = 100;
        duration_tooltip = 12;
        localizedName = "Maledict";
        owningHeroShortKey = "witch_doctor";
        radius = 180;
        ticks = 3;
    }

    public static WitchDoctorMaledict instance() {
        if( instance == null ){
            instance = new WitchDoctorMaledict();
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

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String getAbilityUnitTargetType() {
        return abilityUnitTargetType;
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

    public int[] getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusDamageThreshold() {
        return bonus_damage_threshold;
    }

    public int getDurationTooltip() {
        return duration_tooltip;
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

    public int getTicks() {
        return ticks;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WitchDoctorMaledict))
            return false;
        if (object == this)
            return true;
        WitchDoctorMaledict otherObject = (WitchDoctorMaledict) object;
        return otherObject.getKey().equals(getKey());
    }

}
