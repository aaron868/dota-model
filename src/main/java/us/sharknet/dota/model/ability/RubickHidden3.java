package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RubickHidden3 extends Ability {

    private static RubickHidden3 instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private RubickHidden3() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE"};
        iD = 5457;
        key = "rubick_hidden3";
        localizedName = "Hidden 3";
        ownerKey = "npc_dota_hero_rubick";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = true;
    }

    public static RubickHidden3 instance() {
        if( instance == null ){
            instance = new RubickHidden3();
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
        if (!(object instanceof RubickHidden3))
            return false;
        if (object == this)
            return true;
        RubickHidden3 otherObject = (RubickHidden3) object;
        return otherObject.getKey().equals(getKey());
    }

}
