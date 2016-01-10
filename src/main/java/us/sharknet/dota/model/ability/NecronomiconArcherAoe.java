package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NecronomiconArcherAoe extends Ability {

    private static NecronomiconArcherAoe instance;

    private final String[] abilityBehavior;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final int[] speed_bonus;

    private NecronomiconArcherAoe() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        iD = 5204;
        key = "necronomicon_archer_aoe";
        localizedName = "AoE";
        ownerKey = "npc_dota_necronomicon_archer";
        ownerType = AbilityOwnerType.Summoned;
        passive = false;
        placeholder = false;
        radius = 900;
        speed_bonus = new int[]{5,7,9};
    }

    public static NecronomiconArcherAoe instance() {
        if( instance == null ){
            instance = new NecronomiconArcherAoe();
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

    public int getRadius() {
        return radius;
    }

    public int[] getSpeedBonus() {
        return speed_bonus;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof NecronomiconArcherAoe))
            return false;
        if (object == this)
            return true;
        NecronomiconArcherAoe otherObject = (NecronomiconArcherAoe) object;
        return otherObject.getKey().equals(getKey());
    }

}
