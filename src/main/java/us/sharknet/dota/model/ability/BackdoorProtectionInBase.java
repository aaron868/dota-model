package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BackdoorProtectionInBase extends Ability {

    private static BackdoorProtectionInBase instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int activation_time;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int regen_rate;

    private BackdoorProtectionInBase() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5351;
        key = "backdoor_protection_in_base";
        activation_time = 15;
        localizedName = "Backdoor Protection In Base";
        ownerKey = "tower";
        ownerType = AbilityOwnerType.Tower;
        passive = false;
        placeholder = false;
        regen_rate = 90;
    }

    public static BackdoorProtectionInBase instance() {
        if( instance == null ){
            instance = new BackdoorProtectionInBase();
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

    public int getRegenRate() {
        return regen_rate;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BackdoorProtectionInBase))
            return false;
        if (object == this)
            return true;
        BackdoorProtectionInBase otherObject = (BackdoorProtectionInBase) object;
        return otherObject.getKey().equals(getKey());
    }

}
