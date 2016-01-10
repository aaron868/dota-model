package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RubickNullField extends Ability {

    private static RubickNullField instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final int[] magic_damage_reduction_pct;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private RubickNullField() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5451;
        key = "rubick_null_field";
        localizedName = "Null Field";
        magic_damage_reduction_pct = new int[]{5,10,15,20};
        ownerKey = "npc_dota_hero_rubick";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
        radius = 900;
    }

    public static RubickNullField instance() {
        if( instance == null ){
            instance = new RubickNullField();
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

    public int[] getMagicDamageReductionPct() {
        return magic_damage_reduction_pct;
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

    public int getRadius() {
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
