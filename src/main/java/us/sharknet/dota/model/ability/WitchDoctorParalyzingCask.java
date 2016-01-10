package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WitchDoctorParalyzingCask extends Ability {

    private static WitchDoctorParalyzingCask instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double bounce_delay;
    private final int[] bounce_range;
    private final int[] bounces;
    private final int[] bounces_tooltip;
    private final double[] creep_duration;
    private final int[] hero_damage;
    private final double[] hero_duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int speed;

    private WitchDoctorParalyzingCask() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.35,0.35,0.35,0.35};
        abilityCastRange = new int[]{700,700,700,700};
        abilityCooldown = new double[]{20.0,18.0,16.0,14.0};
        abilityDamage = new int[]{75,100,125,150};
        abilityManaCost = new int[]{110,120,130,140};
        abilityModifierSupportValue = .5;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5138;
        key = "witch_doctor_paralyzing_cask";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bounce_delay = .3;
        bounce_range = new int[]{575,575,575,575};
        bounces = new int[]{3,5,7,9};
        bounces_tooltip = new int[]{2,4,6,8};
        creep_duration = new double[]{5.0,5.0,5.0,5.0};
        hero_damage = new int[]{50,50,50,50};
        hero_duration = new double[]{1.0,1.0,1.0,1.0};
        localizedName = "Paralyzing Cask";
        ownerKey = "npc_dota_hero_witch_doctor";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        speed = 1000;
    }

    public static WitchDoctorParalyzingCask instance() {
        if( instance == null ){
            instance = new WitchDoctorParalyzingCask();
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

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String[] getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
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

    public double getBounceDelay() {
        return bounce_delay;
    }

    public int[] getBounceRange() {
        return bounce_range;
    }

    public int[] getBounces() {
        return bounces;
    }

    public int[] getBouncesTooltip() {
        return bounces_tooltip;
    }

    public double[] getCreepDuration() {
        return creep_duration;
    }

    public int[] getHeroDamage() {
        return hero_damage;
    }

    public double[] getHeroDuration() {
        return hero_duration;
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

    public int getSpeed() {
        return speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WitchDoctorParalyzingCask))
            return false;
        if (object == this)
            return true;
        WitchDoctorParalyzingCask otherObject = (WitchDoctorParalyzingCask) object;
        return otherObject.getKey().equals(getKey());
    }

}
