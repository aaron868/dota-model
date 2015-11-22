package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TuskSnowball extends Ability {

    private static TuskSnowball instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] snowball_damage;
    private final int[] snowball_damage_bonus;
    private final int snowball_duration;
    private final int snowball_grab_radius_tooltip;
    private final int snowball_grow_rate;
    private final int snowball_radius;
    private final int snowball_speed;
    private final int snowball_windup;
    private final int snowball_windup_radius;
    private final double[] stun_duration;

    private TuskSnowball() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.1,0.1,0.1,0.1};
        abilityCastRange = 125;
        abilityCooldown = new int[]{21,20,19,18};
        abilityManaCost = new int[]{75,75,75,75};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5566;
        key = "tusk_snowball";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Snowball";
        owningHeroShortKey = "tusk";
        snowball_damage = new int[]{80,120,160,200};
        snowball_damage_bonus = new int[]{20,30,40,50};
        snowball_duration = 3;
        snowball_grab_radius_tooltip = 4;
        snowball_grow_rate = 4;
        snowball_radius = 2;
        snowball_speed = 675;
        snowball_windup = 3;
        snowball_windup_radius = 1;
        stun_duration = new double[]{0.5,0.75,1.0,1.25};
    }

    public static TuskSnowball instance() {
        if( instance == null ){
            instance = new TuskSnowball();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int[] getSnowballDamage() {
        return snowball_damage;
    }

    public int[] getSnowballDamageBonus() {
        return snowball_damage_bonus;
    }

    public int getSnowballDuration() {
        return snowball_duration;
    }

    public int getSnowballGrabRadiusTooltip() {
        return snowball_grab_radius_tooltip;
    }

    public int getSnowballGrowRate() {
        return snowball_grow_rate;
    }

    public int getSnowballRadius() {
        return snowball_radius;
    }

    public int getSnowballSpeed() {
        return snowball_speed;
    }

    public int getSnowballWindup() {
        return snowball_windup;
    }

    public int getSnowballWindupRadius() {
        return snowball_windup_radius;
    }

    public double[] getStunDuration() {
        return stun_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TuskSnowball))
            return false;
        if (object == this)
            return true;
        TuskSnowball otherObject = (TuskSnowball) object;
        return otherObject.getKey().equals(getKey());
    }

}
