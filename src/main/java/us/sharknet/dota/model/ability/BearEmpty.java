package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

/**
 * Dummy ability for the lone druid bear
 */
public class BearEmpty extends Ability {

    private static BearEmpty instance;
    private final String[] abilityBehavior;

    private BearEmpty() {
        abilityBehavior = new String[0];
    }

    public AbilityOwnerType getOwnerType() {
        return AbilityOwnerType.Summoned;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    @Override
    public boolean isPlaceholder() {
        return true;
    }

    @Override
    public boolean isPassive() {
        return false;
    }

    public int getID() {
        return -1;
    }

    public static BearEmpty instance() {
        if( instance == null ){
            instance = new BearEmpty();
        }
        return instance;
    }

    @Override
    public String getLocalizedName() {
        return "Bear Empty";
    }

    @Override
    public String getKey() {
        return "bear_empty";
    }

    @Override
    public String getOwnerKey() {
        return "npc_dota_hero_lone_druid";
    }
}
