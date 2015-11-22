package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RubickNullField extends Ability {

    private static RubickNullField instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final int[] magic_damage_reduction_pct;
    private final String owningHeroShortKey;
    private final int[] radius;

    private RubickNullField() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5451;
        key = "rubick_null_field";
        localizedName = "Null Field";
        magic_damage_reduction_pct = new int[]{5,10,15,20};
        owningHeroShortKey = "rubick";
        radius = new int[]{900,900,900,900};
    }

    public static RubickNullField instance() {
        if( instance == null ){
            instance = new RubickNullField();
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

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMagicDamageReductionPct() {
        return magic_damage_reduction_pct;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RubickNullField))
            return false;
        if (object == this)
            return true;
        RubickNullField otherObject = (RubickNullField) object;
        return otherObject.getKey().equals(getKey());
    }

}
