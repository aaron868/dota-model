package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MudGolemRockDestroy extends Ability {

    private static MudGolemRockDestroy instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int duration;
    private final String localizedName;
    private final int movespeed;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final int shard_damage_tooltip;
    private final int shard_duration_tooltip;
    private final int shard_health_tooltip;

    private MudGolemRockDestroy() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5667;
        key = "mud_golem_rock_destroy";
        duration = 2;
        localizedName = "Shard Split";
        movespeed = -25;
        ownerKey = "npc_dota_neutral_mud_golem";
        ownerType = AbilityOwnerType.Summoned;
        passive = false;
        placeholder = false;
        radius = 250;
        shard_damage_tooltip = 9;
        shard_duration_tooltip = 60;
        shard_health_tooltip = 240;
    }

    public static MudGolemRockDestroy instance() {
        if( instance == null ){
            instance = new MudGolemRockDestroy();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
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
