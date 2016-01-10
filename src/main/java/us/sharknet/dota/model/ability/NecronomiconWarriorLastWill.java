package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NecronomiconWarriorLastWill extends Ability {

    private static NecronomiconWarriorLastWill instance;

    private final String[] abilityBehavior;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final int[] explosion;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private NecronomiconWarriorLastWill() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5200;
        key = "necronomicon_warrior_last_will";
        explosion = new int[]{550,675,800};
        localizedName = "Last Will";
        ownerKey = "npc_dota_necronomicon_warrior";
        ownerType = AbilityOwnerType.Summoned;
        passive = false;
        placeholder = false;
    }

    public static NecronomiconWarriorLastWill instance() {
        if( instance == null ){
            instance = new NecronomiconWarriorLastWill();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int[] getExplosion() {
        return explosion;
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
        if (!(object instanceof NecronomiconWarriorLastWill))
            return false;
        if (object == this)
            return true;
        NecronomiconWarriorLastWill otherObject = (NecronomiconWarriorLastWill) object;
        return otherObject.getKey().equals(getKey());
    }

}
