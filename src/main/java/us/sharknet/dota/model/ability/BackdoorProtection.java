package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BackdoorProtection extends Ability {

    private static BackdoorProtection instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int activation_time;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final int regen_rate;

    private BackdoorProtection() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5350;
        key = "backdoor_protection";
        activation_time = 15;
        localizedName = "Backdoor Protection";
        ownerKey = "tower";
        ownerType = AbilityOwnerType.Tower;
        passive = false;
        placeholder = false;
        radius = 900;
        regen_rate = 90;
    }

    public static BackdoorProtection instance() {
        if( instance == null ){
            instance = new BackdoorProtection();
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

    public int getActivationTime() {
        return activation_time;
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

    public int getRegenRate() {
        return regen_rate;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BackdoorProtection))
            return false;
        if (object == this)
            return true;
        BackdoorProtection otherObject = (BackdoorProtection) object;
        return otherObject.getKey().equals(getKey());
    }

}
