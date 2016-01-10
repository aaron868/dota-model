package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class CourierShield extends Ability {

    private static CourierShield instance;

    private final String[] abilityBehavior;
    private final double[] abilityCooldown;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private CourierShield() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCooldown = new double[]{2,2,2,2};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5209;
        key = "courier_shield";
        duration = 7;
        localizedName = "Shield";
        ownerKey = "npc_dota_courier";
        ownerType = AbilityOwnerType.Courier;
        passive = false;
        placeholder = false;
    }

    public static CourierShield instance() {
        if( instance == null ){
            instance = new CourierShield();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
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

    public int getDuration() {
        return duration;
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
        if (!(object instanceof CourierShield))
            return false;
        if (object == this)
            return true;
        CourierShield otherObject = (CourierShield) object;
        return otherObject.getKey().equals(getKey());
    }

}
