package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WispEmpty2 extends Ability {

    private static WispEmpty2 instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private WispEmpty2() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE"};
        iD = 5499;
        key = "wisp_empty2";
        localizedName = "Empty 2";
        ownerKey = "npc_dota_hero_wisp";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = true;
    }

    public static WispEmpty2 instance() {
        if( instance == null ){
            instance = new WispEmpty2();
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
        if (!(object instanceof WispEmpty2))
            return false;
        if (object == this)
            return true;
        WispEmpty2 otherObject = (WispEmpty2) object;
        return otherObject.getKey().equals(getKey());
    }

}
