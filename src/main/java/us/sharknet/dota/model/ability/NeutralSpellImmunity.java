package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NeutralSpellImmunity extends Ability {

    private static NeutralSpellImmunity instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String localizedName;
    private final String owningHeroShortKey;

    private NeutralSpellImmunity() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 533;
        key = "neutral_spell_immunity";
        maxLevel = 1;
        localizedName = "Spell Immunity";
        owningHeroShortKey = "neutral";
    }

    public static NeutralSpellImmunity instance() {
        if( instance == null ){
            instance = new NeutralSpellImmunity();
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

    public int getMaxLevel() {
        return maxLevel;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
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
