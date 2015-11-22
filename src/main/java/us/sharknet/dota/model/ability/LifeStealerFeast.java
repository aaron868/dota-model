package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LifeStealerFeast extends Ability {

    private static LifeStealerFeast instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] hp_leech_percent;
    private final String localizedName;
    private final String owningHeroShortKey;

    private LifeStealerFeast() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5250;
        key = "life_stealer_feast";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        hp_leech_percent = new double[]{4.0,5.0,6.0,7.0};
        localizedName = "Feast";
        owningHeroShortKey = "life_stealer";
    }

    public static LifeStealerFeast instance() {
        if( instance == null ){
            instance = new LifeStealerFeast();
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

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public double[] getHpLeechPercent() {
        return hp_leech_percent;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LifeStealerFeast))
            return false;
        if (object == this)
            return true;
        LifeStealerFeast otherObject = (LifeStealerFeast) object;
        return otherObject.getKey().equals(getKey());
    }

}
