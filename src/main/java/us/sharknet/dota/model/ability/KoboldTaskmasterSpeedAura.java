package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class KoboldTaskmasterSpeedAura extends Ability {

    private static KoboldTaskmasterSpeedAura instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int bonus_movement_speed;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private KoboldTaskmasterSpeedAura() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5293;
        key = "kobold_taskmaster_speed_aura";
        bonus_movement_speed = 12;
        localizedName = "Speed Aura";
        ownerKey = "npc_dota_neutral_kobold_taskmaster";
        ownerType = AbilityOwnerType.Neutral;
        passive = false;
        placeholder = false;
        radius = 900;
    }

    public static KoboldTaskmasterSpeedAura instance() {
        if( instance == null ){
            instance = new KoboldTaskmasterSpeedAura();
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

    public int getBonusMovementSpeed() {
        return bonus_movement_speed;
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
        if (!(object instanceof KoboldTaskmasterSpeedAura))
            return false;
        if (object == this)
            return true;
        KoboldTaskmasterSpeedAura otherObject = (KoboldTaskmasterSpeedAura) object;
        return otherObject.getKey().equals(getKey());
    }

}
