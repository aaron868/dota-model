package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MudGolemRockDestroy extends Ability {

    private static MudGolemRockDestroy instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int duration;
    private final String localizedName;
    private final int movespeed;
    private final String owningHeroShortKey;
    private final int radius;
    private final int shard_damage_tooltip;
    private final int shard_duration_tooltip;
    private final int shard_health_tooltip;

    private MudGolemRockDestroy() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5667;
        key = "mud_golem_rock_destroy";
        maxLevel = 1;
        duration = 2;
        localizedName = "Rock Destroy";
        movespeed = -25;
        owningHeroShortKey = "mud_golem";
        radius = 25;
        shard_damage_tooltip = 9;
        shard_duration_tooltip = 6;
        shard_health_tooltip = 24;
    }

    public static MudGolemRockDestroy instance() {
        if( instance == null ){
            instance = new MudGolemRockDestroy();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMovespeed() {
        return movespeed;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }

    public int getShardDamageTooltip() {
        return shard_damage_tooltip;
    }

    public int getShardDurationTooltip() {
        return shard_duration_tooltip;
    }

    public int getShardHealthTooltip() {
        return shard_health_tooltip;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MudGolemRockDestroy))
            return false;
        if (object == this)
            return true;
        MudGolemRockDestroy otherObject = (MudGolemRockDestroy) object;
        return otherObject.getKey().equals(getKey());
    }

}
