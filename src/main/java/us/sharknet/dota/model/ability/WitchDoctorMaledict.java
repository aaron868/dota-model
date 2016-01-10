package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WitchDoctorMaledict extends Ability {

    private static WitchDoctorMaledict instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_damage;
    private final int bonus_damage_threshold;
    private final int duration_tooltip;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final int ticks;

    private WitchDoctorMaledict() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.35,0.35,0.35,0.35};
        abilityCastRange = new int[]{575,575,575,575};
        abilityCooldown = new double[]{2,2,2,2};
        abilityDamage = new int[]{5,10,15,20};
        abilityDuration = new double[]{12,12,12,12};
        abilityManaCost = new int[]{105,110,115,120};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO"};
        iD = 5140;
        key = "witch_doctor_maledict";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bonus_damage = new int[]{16,24,32,40};
        bonus_damage_threshold = 100;
        duration_tooltip = 12;
        localizedName = "Maledict";
        ownerKey = "npc_dota_hero_witch_doctor";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
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

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
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
