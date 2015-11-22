package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PhantomAssassinCoupDeGrace extends Ability {

    private static PhantomAssassinCoupDeGrace instance;

    private final String abilityBehavior;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] crit_bonus;
    private final int crit_chance;
    private final String localizedName;
    private final String owningHeroShortKey;

    private PhantomAssassinCoupDeGrace() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5193;
        key = "phantom_assassin_coup_de_grace";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        crit_bonus = new int[]{230,340,450};
        crit_chance = 15;
        localizedName = "Coup De Grace";
        owningHeroShortKey = "phantom_assassin";
    }

    public static PhantomAssassinCoupDeGrace instance() {
        if( instance == null ){
            instance = new PhantomAssassinCoupDeGrace();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public String getAbilityType() {
        return abilityType;
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

    public int[] getCritBonus() {
        return crit_bonus;
    }

    public int getCritChance() {
        return crit_chance;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PhantomAssassinCoupDeGrace))
            return false;
        if (object == this)
            return true;
        PhantomAssassinCoupDeGrace otherObject = (PhantomAssassinCoupDeGrace) object;
        return otherObject.getKey().equals(getKey());
    }

}
