package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BaneNightmareEnd extends Ability {

    private static BaneNightmareEnd instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private BaneNightmareEnd() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_TOGGLE","DOTA_ABILITY_BEHAVIOR_IGNORE_PSEUDO_QUEUE"};
        iD = 5523;
        key = "bane_nightmare_end";
        localizedName = "Nightmare End";
        ownerKey = "npc_dota_hero_bane";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static BaneNightmareEnd instance() {
        if( instance == null ){
            instance = new BaneNightmareEnd();
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
        if (!(object instanceof BaneNightmareEnd))
            return false;
        if (object == this)
            return true;
        BaneNightmareEnd otherObject = (BaneNightmareEnd) object;
        return otherObject.getKey().equals(getKey());
    }

}
