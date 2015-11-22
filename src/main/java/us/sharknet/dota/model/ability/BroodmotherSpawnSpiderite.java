package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BroodmotherSpawnSpiderite extends Ability {

    private static BroodmotherSpawnSpiderite instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int buff_duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int spiderite_duration;

    private BroodmotherSpawnSpiderite() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5283;
        key = "broodmother_spawn_spiderite";
        buff_duration = 2;
        localizedName = "Spawn Spiderite";
        owningHeroShortKey = "broodmother";
        spiderite_duration = 6;
    }

    public static BroodmotherSpawnSpiderite instance() {
        if( instance == null ){
            instance = new BroodmotherSpawnSpiderite();
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

    public int getBuffDuration() {
        return buff_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
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
