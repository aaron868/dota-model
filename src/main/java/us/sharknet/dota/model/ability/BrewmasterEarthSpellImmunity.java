package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BrewmasterEarthSpellImmunity extends Ability {

    private static BrewmasterEarthSpellImmunity instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private BrewmasterEarthSpellImmunity() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5405;
        key = "brewmaster_earth_spell_immunity";
        localizedName = "Spell Immunity";
        ownerKey = "npc_dota_brewmaster_earth";
        ownerType = AbilityOwnerType.Summoned;
        passive = false;
        placeholder = false;
    }

    public static BrewmasterEarthSpellImmunity instance() {
        if( instance == null ){
            instance = new BrewmasterEarthSpellImmunity();
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
        if (!(object instanceof BrewmasterEarthSpellImmunity))
            return false;
        if (object == this)
            return true;
        BrewmasterEarthSpellImmunity otherObject = (BrewmasterEarthSpellImmunity) object;
        return otherObject.getKey().equals(getKey());
    }

}
