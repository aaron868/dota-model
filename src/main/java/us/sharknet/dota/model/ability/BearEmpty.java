package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

/**
 * Dummy ability for the lone druid bear
 */
public class BearEmpty extends Ability {

    private static BearEmpty instance;

    private BearEmpty() {

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
}
