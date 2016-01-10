package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LifeStealerEmpty4 extends Ability {

    private static LifeStealerEmpty4 instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private LifeStealerEmpty4() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_PASSIVE","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE"};
        iD = 5660;
        key = "life_stealer_empty_4";
        localizedName = "Empty 4";
        ownerKey = "npc_dota_hero_life_stealer";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = true;
    }

    public static LifeStealerEmpty4 instance() {
        if( instance == null ){
            instance = new LifeStealerEmpty4();
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
        if (!(object instanceof LifeStealerEmpty4))
            return false;
        if (object == this)
            return true;
        LifeStealerEmpty4 otherObject = (LifeStealerEmpty4) object;
        return otherObject.getKey().equals(getKey());
    }

}
