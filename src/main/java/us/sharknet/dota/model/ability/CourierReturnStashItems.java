package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class CourierReturnStashItems extends Ability {

    private static CourierReturnStashItems instance;

    private final String[] abilityBehavior;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int handoff_distance;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private CourierReturnStashItems() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        iD = 5207;
        key = "courier_return_stash_items";
        handoff_distance = 400;
        localizedName = "Return Stash Items";
        ownerKey = "npc_dota_courier";
        ownerType = AbilityOwnerType.Courier;
        passive = false;
        placeholder = false;
    }

    public static CourierReturnStashItems instance() {
        if( instance == null ){
            instance = new CourierReturnStashItems();
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

    public int getHandoffDistance() {
        return handoff_distance;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof CourierReturnStashItems))
            return false;
        if (object == this)
            return true;
        CourierReturnStashItems otherObject = (CourierReturnStashItems) object;
        return otherObject.getKey().equals(getKey());
    }

}
