package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EarthSpiritGeomagneticGrip extends Ability {

    private static EarthSpiritGeomagneticGrip instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final double[] miss_duration;
    private final int miss_rate;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int pull_units_per_second;
    private final int pull_units_per_second_heroes;
    private final int radius;
    private final int[] rock_damage;
    private final int speed;
    private final int total_pull_distance;

    private EarthSpiritGeomagneticGrip() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{.1,.1,.1,.1};
        abilityCastRange = new int[]{1100,1100,1100,1100};
        abilityCooldown = new double[]{13,13,13,13};
        abilityManaCost = new int[]{100,100,100,100};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_INVULNERABLE"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_CREEP"};
        iD = 5610;
        key = "earth_spirit_geomagnetic_grip";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Geomagnetic Grip";
        miss_duration = new double[]{2.5,3.0,3.5,4.0};
        miss_rate = 75;
        ownerKey = "npc_dota_hero_earth_spirit";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        pull_units_per_second = 1;
        pull_units_per_second_heroes = 6;
        radius = 180;
        rock_damage = new int[]{50,100,150,200};
        speed = 800;
        total_pull_distance = 14;
    }

    public static EarthSpiritGeomagneticGrip instance() {
        if( instance == null ){
            instance = new EarthSpiritGeomagneticGrip();
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

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String[] getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public String getLocalizedName() {
        return localizedName;
    }

    public double[] getMissDuration() {
        return miss_duration;
    }

    public int getMissRate() {
        return miss_rate;
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

    public int getPullUnitsPerSecond() {
        return pull_units_per_second;
    }

    public int getPullUnitsPerSecondHeroes() {
        return pull_units_per_second_heroes;
    }

    public int getRadius() {
        return radius;
    }

    public int[] getRockDamage() {
        return rock_damage;
    }

    public int getSpeed() {
        return speed;
    }

    public int getTotalPullDistance() {
        return total_pull_distance;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EarthSpiritGeomagneticGrip))
            return false;
        if (object == this)
            return true;
        EarthSpiritGeomagneticGrip otherObject = (EarthSpiritGeomagneticGrip) object;
        return otherObject.getKey().equals(getKey());
    }

}
