package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class OgreMagiIgnite extends Ability {

    private static OgreMagiIgnite instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] burn_damage;
    private final double[] duration;
    private final String localizedName;
    private final double multicast_delay;
    private final String owningHeroShortKey;
    private final int projectile_speed;
    private final int[] slow_movement_speed_pct;

    private OgreMagiIgnite() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = .45;
        abilityCastRange = 700;
        abilityCooldown = 15;
        abilityManaCost = new int[]{95,105,115,125};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5439;
        key = "ogre_magi_ignite";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        burn_damage = new int[]{26,34,42,50};
        duration = new double[]{5.0,6.0,7.0,8.0};
        localizedName = "Ignite";
        multicast_delay = .4;
        owningHeroShortKey = "ogre_magi";
        projectile_speed = 1000;
        slow_movement_speed_pct = new int[]{-20,-22,-24,-26};
    }

    public static OgreMagiIgnite instance() {
        if( instance == null ){
            instance = new OgreMagiIgnite();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
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

    public int[] getBurnDamage() {
        return burn_damage;
    }

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public double getMulticastDelay() {
        return multicast_delay;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getProjectileSpeed() {
        return projectile_speed;
    }

    public int[] getSlowMovementSpeedPct() {
        return slow_movement_speed_pct;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof OgreMagiIgnite))
            return false;
        if (object == this)
            return true;
        OgreMagiIgnite otherObject = (OgreMagiIgnite) object;
        return otherObject.getKey().equals(getKey());
    }

}
