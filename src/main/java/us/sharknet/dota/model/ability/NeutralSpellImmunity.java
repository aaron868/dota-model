package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NeutralSpellImmunity extends Ability {

    private static NeutralSpellImmunity instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private NeutralSpellImmunity() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5303;
        key = "neutral_spell_immunity";
        localizedName = "Spell Immunity";
        ownerKey = "neutral";
        ownerType = AbilityOwnerType.Neutral;
        passive = false;
        placeholder = false;
    }

    public static NeutralSpellImmunity instance() {
        if( instance == null ){
            instance = new NeutralSpellImmunity();
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
        if (!(object instanceof NeutralSpellImmunity))
            return false;
        if (object == this)
            return true;
        NeutralSpellImmunity otherObject = (NeutralSpellImmunity) object;
        return otherObject.getKey().equals(getKey());
    }

}
