package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TuskIceShards extends Ability {

    private static TuskIceShards instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int cast_range_tooltip;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int shard_angle_step;
    private final int shard_count;
    private final int[] shard_damage;
    private final int shard_distance;
    private final int shard_duration;
    private final int shard_speed;
    private final int shard_width;

    private TuskIceShards() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_DIRECTIONAL","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.1,0.1,0.1,0.1};
        abilityCastRange = 18;
        abilityCooldown = new double[]{19.0,16.0,13.0,10.0};
        abilityManaCost = new int[]{100,105,110,115};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5565;
        key = "tusk_ice_shards";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        cast_range_tooltip = 18;
        localizedName = "Ice Shards";
        owningHeroShortKey = "tusk";
        shard_angle_step = 4;
        shard_count = 7;
        shard_damage = new int[]{70,140,210,280};
        shard_distance = 2;
        shard_duration = 7;
        shard_speed = 11;
        shard_width = 2;
    }

    public static TuskIceShards instance() {
        if( instance == null ){
            instance = new TuskIceShards();
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

    public double[] getAbilityCooldown() {
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

    public int getCastRangeTooltip() {
        return cast_range_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getShardAngleStep() {
        return shard_angle_step;
    }

    public int getShardCount() {
        return shard_count;
    }

    public int[] getShardDamage() {
        return shard_damage;
    }

    public int getShardDistance() {
        return shard_distance;
    }

    public int getShardDuration() {
        return shard_duration;
    }

    public int getShardSpeed() {
        return shard_speed;
    }

    public int getShardWidth() {
        return shard_width;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TuskIceShards))
            return false;
        if (object == this)
            return true;
        TuskIceShards otherObject = (TuskIceShards) object;
        return otherObject.getKey().equals(getKey());
    }

}
