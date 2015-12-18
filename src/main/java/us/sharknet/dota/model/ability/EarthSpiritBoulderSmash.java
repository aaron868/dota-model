package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EarthSpiritBoulderSmash extends Ability {

    private static EarthSpiritBoulderSmash instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetFlag;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;
    private final int remnant_smash_radius_tooltip;
    private final int[] rock_damage;
    private final int rock_distance;
    private final int rock_search_aoe;
    private final int speed;
    private final double[] stun_duration;
    private final double[] unit_distance;

    private EarthSpiritBoulderSmash() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = .1;
        abilityCastRange = 150;
        abilityCooldown = new double[]{22.0,18.0,14.0,10.0};
        abilityManaCost = 100;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlag = "DOTA_UNIT_TARGET_FLAG_INVULNERABLE";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_BOTH";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_CREEP"};
        fightRecapLevel = 1;
        iD = 5608;
        key = "earth_spirit_boulder_smash";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Boulder Smash";
        owningHeroShortKey = "earth_spirit";
        radius = 160;
        remnant_smash_radius_tooltip = 200;
        rock_damage = new int[]{50,100,150,200};
        rock_distance = 2;
        rock_search_aoe = 200;
        speed = 1200;
        stun_duration = new double[]{0.75,1.25,1.75,2.25};
        unit_distance = new double[]{500.0,600.0,700.0,800.0};
    }

    public static EarthSpiritBoulderSmash instance() {
        if( instance == null ){
            instance = new EarthSpiritBoulderSmash();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String getAbilityUnitTargetFlag() {
        return abilityUnitTargetFlag;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
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

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }

    public int getRemnantSmashRadiusTooltip() {
        return remnant_smash_radius_tooltip;
    }

    public int[] getRockDamage() {
        return rock_damage;
    }

    public int getRockDistance() {
        return rock_distance;
    }

    public int getRockSearchAoe() {
        return rock_search_aoe;
    }

    public int getSpeed() {
        return speed;
    }

    public double[] getStunDuration() {
        return stun_duration;
    }

    public double[] getUnitDistance() {
        return unit_distance;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EarthSpiritBoulderSmash))
            return false;
        if (object == this)
            return true;
        EarthSpiritBoulderSmash otherObject = (EarthSpiritBoulderSmash) object;
        return otherObject.getKey().equals(getKey());
    }

}
