package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WitchDoctorDeathWard extends Ability {

    private static WitchDoctorDeathWard instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityChannelTime;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bounce_radius;
    private final int[] bounces;
    private final int[] damage;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] scepter_bounces;

    private WitchDoctorDeathWard() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_CHANNELLED"};
        abilityCastPoint = new double[]{0.35,0.35,0.35};
        abilityCastRange = 6;
        abilityChannelTime = new double[]{8.0,8.0,8.0};
        abilityCooldown = 8;
        abilityManaCost = new int[]{200,200,200};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        fightRecapLevel = 2;
        iD = 5141;
        key = "witch_doctor_death_ward";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bounce_radius = new int[]{650,650,650};
        bounces = new int[]{0,0,0};
        damage = new int[]{60,105,150};
        localizedName = "Death Ward";
        owningHeroShortKey = "witch_doctor";
        scepter_bounces = new int[]{4,4,4};
    }

    public static WitchDoctorDeathWard instance() {
        if( instance == null ){
            instance = new WitchDoctorDeathWard();
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

    public double[] getAbilityChannelTime() {
        return abilityChannelTime;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
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

    public int[] getBounceRadius() {
        return bounce_radius;
    }

    public int[] getBounces() {
        return bounces;
    }

    public int[] getDamage() {
        return damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getScepterBounces() {
        return scepter_bounces;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WitchDoctorDeathWard))
            return false;
        if (object == this)
            return true;
        WitchDoctorDeathWard otherObject = (WitchDoctorDeathWard) object;
        return otherObject.getKey().equals(getKey());
    }

}
