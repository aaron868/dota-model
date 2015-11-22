package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class FacelessVoidBacktrack extends Ability {

    private static FacelessVoidBacktrack instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int[] dodge_chance_pct;
    private final String localizedName;
    private final String owningHeroShortKey;

    private FacelessVoidBacktrack() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5183;
        key = "faceless_void_backtrack";
        dodge_chance_pct = new int[]{10,15,20,25};
        localizedName = "Backtrack";
        owningHeroShortKey = "faceless_void";
    }

    public static FacelessVoidBacktrack instance() {
        if( instance == null ){
            instance = new FacelessVoidBacktrack();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int[] getDodgeChancePct() {
        return dodge_chance_pct;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof FacelessVoidBacktrack))
            return false;
        if (object == this)
            return true;
        FacelessVoidBacktrack otherObject = (FacelessVoidBacktrack) object;
        return otherObject.getKey().equals(getKey());
    }

}
