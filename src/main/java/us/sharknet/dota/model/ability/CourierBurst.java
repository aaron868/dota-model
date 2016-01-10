package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class CourierBurst extends Ability {

    private static CourierBurst instance;

    private final String[] abilityBehavior;
    private final double[] abilityCooldown;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int damage_absorb;
    private final int duration;
    private final String localizedName;
    private final int movement_speed;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private CourierBurst() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_DONT_CANCEL_MOVEMENT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCooldown = new double[]{9,9,9,9};
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        iD = 5210;
        key = "courier_burst";
        damage_absorb = 25;
        duration = 4;
        localizedName = "Burst";
        movement_speed = 800;
        ownerKey = "npc_dota_courier";
        ownerType = AbilityOwnerType.Courier;
        passive = false;
        placeholder = false;
    }

    public static CourierBurst instance() {
        if( instance == null ){
            instance = new CourierBurst();
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

    public int getDamageAbsorb() {
        return damage_absorb;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMovementSpeed() {
        return movement_speed;
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
        if (!(object instanceof CourierBurst))
            return false;
        if (object == this)
            return true;
        CourierBurst otherObject = (CourierBurst) object;
        return otherObject.getKey().equals(getKey());
    }

}
