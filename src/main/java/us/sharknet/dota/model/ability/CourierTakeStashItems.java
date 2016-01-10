package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class CourierTakeStashItems extends Ability {

    private static CourierTakeStashItems instance;

    private final String[] abilityBehavior;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int stash_pickup_distance;

    private CourierTakeStashItems() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        iD = 5208;
        key = "courier_take_stash_items";
        localizedName = "Take Stash Items";
        ownerKey = "npc_dota_courier";
        ownerType = AbilityOwnerType.Courier;
        passive = false;
        placeholder = false;
        stash_pickup_distance = 250;
    }

    public static CourierTakeStashItems instance() {
        if( instance == null ){
            instance = new CourierTakeStashItems();
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

    public int getStashPickupDistance() {
        return stash_pickup_distance;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof CourierTakeStashItems))
            return false;
        if (object == this)
            return true;
        CourierTakeStashItems otherObject = (CourierTakeStashItems) object;
        return otherObject.getKey().equals(getKey());
    }

}
