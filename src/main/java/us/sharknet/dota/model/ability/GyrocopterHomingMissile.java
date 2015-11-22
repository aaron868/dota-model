package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class GyrocopterHomingMissile extends Ability {

    private static GyrocopterHomingMissile instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int acceleration;
    private final int[] attack_speed_bonus_pct;
    private final int enemy_vision_time;
    private final int[] hero_damage;
    private final int[] hits_to_kill_tooltip;
    private final String localizedName;
    private final int max_distance;
    private final int min_damage;
    private final String owningHeroShortKey;
    private final int pre_flight_time;
    private final int speed;
    private final double[] stun_duration;
    private final int[] tower_hits_to_kill_tooltip;

    private GyrocopterHomingMissile() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 1050;
        abilityCooldown = new int[]{20,17,14,11};
        abilityDamage = new int[]{125,250,375,500};
        abilityManaCost = new int[]{120,130,140,150};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5362;
        key = "gyrocopter_homing_missile";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        acceleration = 20;
        attack_speed_bonus_pct = new int[]{400,400,400,400};
        enemy_vision_time = 4;
        hero_damage = new int[]{34,34,26,21};
        hits_to_kill_tooltip = new int[]{3,3,4,5};
        localizedName = "Homing Missile";
        max_distance = 1500;
        min_damage = 50;
        owningHeroShortKey = "gyrocopter";
        pre_flight_time = 3;
        speed = 34;
        stun_duration = new double[]{2.2,2.4,2.6,2.8};
        tower_hits_to_kill_tooltip = new int[]{6,6,8,10};
    }

    public static GyrocopterHomingMissile instance() {
        if( instance == null ){
            instance = new GyrocopterHomingMissile();
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

    public int[] getAbilityDamage() {
        return abilityDamage;
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

    public int getAcceleration() {
        return acceleration;
    }

    public int[] getAttackSpeedBonusPct() {
        return attack_speed_bonus_pct;
    }

    public int getEnemyVisionTime() {
        return enemy_vision_time;
    }

    public int[] getHeroDamage() {
        return hero_damage;
    }

    public int[] getHitsToKillTooltip() {
        return hits_to_kill_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaxDistance() {
        return max_distance;
    }

    public int getMinDamage() {
        return min_damage;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getPreFlightTime() {
        return pre_flight_time;
    }

    public int getSpeed() {
        return speed;
    }

    public double[] getStunDuration() {
        return stun_duration;
    }

    public int[] getTowerHitsToKillTooltip() {
        return tower_hits_to_kill_tooltip;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof GyrocopterHomingMissile))
            return false;
        if (object == this)
            return true;
        GyrocopterHomingMissile otherObject = (GyrocopterHomingMissile) object;
        return otherObject.getKey().equals(getKey());
    }

}
