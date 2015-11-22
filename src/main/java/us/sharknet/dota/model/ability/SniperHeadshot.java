package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SniperHeadshot extends Ability {

    private static SniperHeadshot instance;

    private final String abilityBehavior;
    private final int[] abilityDamage;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int proc_chance;
    private final int slow;
    private final double slow_duration;

    private SniperHeadshot() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityDamage = new int[]{15,40,65,90};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5155;
        key = "sniper_headshot";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Headshot";
        owningHeroShortKey = "sniper";
        proc_chance = 4;
        slow = -1;
        slow_duration = .5;
    }

    public static SniperHeadshot instance() {
        if( instance == null ){
            instance = new SniperHeadshot();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getProcChance() {
        return proc_chance;
    }

    public int getSlow() {
        return slow;
    }

    public double getSlowDuration() {
        return slow_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SniperHeadshot))
            return false;
        if (object == this)
            return true;
        SniperHeadshot otherObject = (SniperHeadshot) object;
        return otherObject.getKey().equals(getKey());
    }

}
