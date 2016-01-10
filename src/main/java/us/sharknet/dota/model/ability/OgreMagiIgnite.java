package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class OgreMagiIgnite extends Ability {

    private static OgreMagiIgnite instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] burn_damage;
    private final double[] duration;
    private final String localizedName;
    private final double multicast_delay;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int projectile_speed;
    private final int[] slow_movement_speed_pct;

    private OgreMagiIgnite() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{.45,.45,.45,.45};
        abilityCastRange = new int[]{700,700,700,700};
        abilityCooldown = new double[]{15,15,15,15};
        abilityManaCost = new int[]{95,105,115,125};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5439;
        key = "ogre_magi_ignite";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        burn_damage = new int[]{26,34,42,50};
        duration = new double[]{5.0,6.0,7.0,8.0};
        localizedName = "Ignite";
        multicast_delay = .4;
        ownerKey = "npc_dota_hero_ogre_magi";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        projectile_speed = 1000;
        slow_movement_speed_pct = new int[]{-20,-22,-24,-26};
    }

    public static OgreMagiIgnite instance() {
        if( instance == null ){
            instance = new OgreMagiIgnite();
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
