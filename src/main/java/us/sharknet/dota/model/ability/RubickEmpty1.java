package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RubickEmpty1 extends Ability {

    private static RubickEmpty1 instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private RubickEmpty1() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE"};
        iD = 5453;
        key = "rubick_empty1";
        localizedName = "Empty 1";
        ownerKey = "npc_dota_hero_rubick";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = true;
    }

    public static RubickEmpty1 instance() {
        if( instance == null ){
            instance = new RubickEmpty1();
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
        if (!(object instanceof RubickEmpty1))
            return false;
        if (object == this)
            return true;
        RubickEmpty1 otherObject = (RubickEmpty1) object;
        return otherObject.getKey().equals(getKey());
    }

}
