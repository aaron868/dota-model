package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class FacelessVoidTimeLock extends Ability {

    private static FacelessVoidTimeLock instance;

    private final String abilityBehavior;
    private final int abilityModifierSupportBonus;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_damage;
    private final int[] chance_pct;
    private final int duration;
    private final int duration_creep;
    private final String localizedName;
    private final String owningHeroShortKey;

    private FacelessVoidTimeLock() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityModifierSupportBonus = 25;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5184;
        key = "faceless_void_time_lock";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bonus_damage = new int[]{40,50,60,70};
        chance_pct = new int[]{10,15,20,25};
        duration = 1;
        duration_creep = 2;
        localizedName = "Time Lock";
        owningHeroShortKey = "faceless_void";
    }

    public static FacelessVoidTimeLock instance() {
        if( instance == null ){
            instance = new FacelessVoidTimeLock();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityModifierSupportBonus() {
        return abilityModifierSupportBonus;
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

    public int[] getBonusDamage() {
        return bonus_damage;
    }

    public int[] getChancePct() {
        return chance_pct;
    }

    public int getDuration() {
        return duration;
    }

    public int getDurationCreep() {
        return duration_creep;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof FacelessVoidTimeLock))
            return false;
        if (object == this)
            return true;
        FacelessVoidTimeLock otherObject = (FacelessVoidTimeLock) object;
        return otherObject.getKey().equals(getKey());
    }

}
