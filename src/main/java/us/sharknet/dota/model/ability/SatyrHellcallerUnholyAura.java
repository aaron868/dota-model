package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SatyrHellcallerUnholyAura extends Ability {

    private static SatyrHellcallerUnholyAura instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int health_regen;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private SatyrHellcallerUnholyAura() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5317;
        key = "satyr_hellcaller_unholy_aura";
        health_regen = 6;
        localizedName = "Unholy Aura";
        ownerKey = "npc_dota_neutral_satyr_hellcaller";
        ownerType = AbilityOwnerType.Neutral;
        passive = false;
        placeholder = false;
        radius = 900;
    }

    public static SatyrHellcallerUnholyAura instance() {
        if( instance == null ){
            instance = new SatyrHellcallerUnholyAura();
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

    public int getHealthRegen() {
        return health_regen;
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
        if (!(object instanceof SatyrHellcallerUnholyAura))
            return false;
        if (object == this)
            return true;
        SatyrHellcallerUnholyAura otherObject = (SatyrHellcallerUnholyAura) object;
        return otherObject.getKey().equals(getKey());
    }

}
