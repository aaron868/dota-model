package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BroodmotherSpawnSpiderite extends Ability {

    private static BroodmotherSpawnSpiderite instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int buff_duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int spiderite_duration;

    private BroodmotherSpawnSpiderite() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5283;
        key = "broodmother_spawn_spiderite";
        buff_duration = 2;
        localizedName = "Spawn Spiderite";
        ownerKey = "npc_dota_broodmother_spiderling";
        ownerType = AbilityOwnerType.Summoned;
        passive = false;
        placeholder = false;
        spiderite_duration = 6;
    }

    public static BroodmotherSpawnSpiderite instance() {
        if( instance == null ){
            instance = new BroodmotherSpawnSpiderite();
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

    public int getBuffDuration() {
        return buff_duration;
    }

    public String getLocalizedName() {
        return localizedName;
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

    public int getSpideriteDuration() {
        return spiderite_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BroodmotherSpawnSpiderite))
            return false;
        if (object == this)
            return true;
        BroodmotherSpawnSpiderite otherObject = (BroodmotherSpawnSpiderite) object;
        return otherObject.getKey().equals(getKey());
    }

}
