package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class KeeperOfTheLightEmpty1 extends Ability {

    private static KeeperOfTheLightEmpty1 instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private KeeperOfTheLightEmpty1() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE"};
        iD = 5501;
        key = "keeper_of_the_light_empty1";
        localizedName = "Empty 1";
        ownerKey = "npc_dota_hero_keeper_of_the_light";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = true;
    }

    public static KeeperOfTheLightEmpty1 instance() {
        if( instance == null ){
            instance = new KeeperOfTheLightEmpty1();
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
        if (!(object instanceof KeeperOfTheLightEmpty1))
            return false;
        if (object == this)
            return true;
        KeeperOfTheLightEmpty1 otherObject = (KeeperOfTheLightEmpty1) object;
        return otherObject.getKey().equals(getKey());
    }

}
