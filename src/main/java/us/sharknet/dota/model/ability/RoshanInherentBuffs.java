package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RoshanInherentBuffs extends Ability {

    private static RoshanInherentBuffs instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private RoshanInherentBuffs() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5216;
        key = "roshan_inherent_buffs";
        localizedName = "Inherent Buffs";
        ownerKey = "npc_dota_roshan";
        ownerType = AbilityOwnerType.Roshan;
        passive = false;
        placeholder = false;
    }

    public static RoshanInherentBuffs instance() {
        if( instance == null ){
            instance = new RoshanInherentBuffs();
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
        if (!(object instanceof RoshanInherentBuffs))
            return false;
        if (object == this)
            return true;
        RoshanInherentBuffs otherObject = (RoshanInherentBuffs) object;
        return otherObject.getKey().equals(getKey());
    }

}
