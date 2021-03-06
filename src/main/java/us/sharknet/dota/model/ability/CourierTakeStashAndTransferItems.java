package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class CourierTakeStashAndTransferItems extends Ability {

    private static CourierTakeStashAndTransferItems instance;

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
    private final int stash_pickup_distance;

    private CourierTakeStashAndTransferItems() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        iD = 5676;
        key = "courier_take_stash_and_transfer_items";
        handoff_distance = 400;
        localizedName = "Take Stash and Transfer Items";
        ownerKey = "npc_dota_courier";
        ownerType = AbilityOwnerType.Courier;
        passive = false;
        placeholder = false;
        stash_pickup_distance = 250;
    }

    public static CourierTakeStashAndTransferItems instance() {
        if( instance == null ){
            instance = new CourierTakeStashAndTransferItems();
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

    public int getStashPickupDistance() {
        return stash_pickup_distance;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof CourierTakeStashAndTransferItems))
            return false;
        if (object == this)
            return true;
        CourierTakeStashAndTransferItems otherObject = (CourierTakeStashAndTransferItems) object;
        return otherObject.getKey().equals(getKey());
    }

}
