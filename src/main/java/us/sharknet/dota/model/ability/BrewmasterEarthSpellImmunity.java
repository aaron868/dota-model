package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BrewmasterEarthSpellImmunity extends Ability {

    private static BrewmasterEarthSpellImmunity instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String owningHeroShortKey;

    private BrewmasterEarthSpellImmunity() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5405;
        key = "brewmaster_earth_spell_immunity";
        localizedName = "Spell Immunity";
        owningHeroShortKey = "brewmaster_earth";
    }

    public static BrewmasterEarthSpellImmunity instance() {
        if( instance == null ){
            instance = new BrewmasterEarthSpellImmunity();
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

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
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
