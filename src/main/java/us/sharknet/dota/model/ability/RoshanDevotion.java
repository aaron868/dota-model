package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RoshanDevotion extends Ability {

    private static RoshanDevotion instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private RoshanDevotion() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5217;
        key = "roshan_devotion";
        localizedName = "Devotion";
        ownerKey = "npc_dota_roshan";
        ownerType = AbilityOwnerType.Roshan;
        passive = false;
        placeholder = false;
        radius = 5;
    }

    public static RoshanDevotion instance() {
        if( instance == null ){
            instance = new RoshanDevotion();
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

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RoshanDevotion))
            return false;
        if (object == this)
            return true;
        RoshanDevotion otherObject = (RoshanDevotion) object;
        return otherObject.getKey().equals(getKey());
    }

}
