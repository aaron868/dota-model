package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LifeStealerFeast extends Ability {

    private static LifeStealerFeast instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] hp_leech_percent;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private LifeStealerFeast() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5250;
        key = "life_stealer_feast";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        hp_leech_percent = new double[]{4.5,5.5,6.5,7.5};
        localizedName = "Feast";
        ownerKey = "npc_dota_hero_life_stealer";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static LifeStealerFeast instance() {
        if( instance == null ){
            instance = new LifeStealerFeast();
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

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public double[] getHpLeechPercent() {
        return hp_leech_percent;
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
        if (!(object instanceof LifeStealerFeast))
            return false;
        if (object == this)
            return true;
        LifeStealerFeast otherObject = (LifeStealerFeast) object;
        return otherObject.getKey().equals(getKey());
    }

}
