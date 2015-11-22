package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NecronomiconWarriorSight extends Ability {

    private static NecronomiconWarriorSight instance;

    private final String abilityBehavior;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;

    private NecronomiconWarriorSight() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        iD = 521;
        key = "necronomicon_warrior_sight";
        localizedName = "Sight";
        owningHeroShortKey = "necronomicon_warrior";
        radius = 1;
    }

    public static NecronomiconWarriorSight instance() {
        if( instance == null ){
            instance = new NecronomiconWarriorSight();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof NecronomiconWarriorSight))
            return false;
        if (object == this)
            return true;
        NecronomiconWarriorSight otherObject = (NecronomiconWarriorSight) object;
        return otherObject.getKey().equals(getKey());
    }

}
