package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NecronomiconWarriorSight extends Ability {

    private static NecronomiconWarriorSight instance;

    private final String[] abilityBehavior;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private NecronomiconWarriorSight() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        iD = 5201;
        key = "necronomicon_warrior_sight";
        localizedName = "Sight";
        ownerKey = "npc_dota_necronomicon_warrior";
        ownerType = AbilityOwnerType.Summoned;
        passive = false;
        placeholder = false;
        radius = 1000;
    }

    public static NecronomiconWarriorSight instance() {
        if( instance == null ){
            instance = new NecronomiconWarriorSight();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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
