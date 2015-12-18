package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class UrsaEnrage extends Ability {

    private static UrsaEnrage instance;

    private final String[] abilityBehavior;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] cooldown_scepter;
    private final int damage_reduction;
    private final int duration;
    private final double[] enrage_multiplier;
    private final String localizedName;
    private final String owningHeroShortKey;

    private UrsaEnrage() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastRange = 0;
        abilityCooldown = new int[]{50,40,30};
        abilityManaCost = new int[]{0,0,0};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        fightRecapLevel = 1;
        iD = 5360;
        key = "ursa_enrage";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        cooldown_scepter = new double[]{30.0,24.0,18.0};
        damage_reduction = 80;
        duration = 4;
        enrage_multiplier = new double[]{1.5,1.75,2.0};
        localizedName = "Enrage";
        owningHeroShortKey = "ursa";
    }

    public static UrsaEnrage instance() {
        if( instance == null ){
            instance = new UrsaEnrage();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
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

    public double[] getCooldownScepter() {
        return cooldown_scepter;
    }

    public int getDamageReduction() {
        return damage_reduction;
    }

    public int getDuration() {
        return duration;
    }

    public double[] getEnrageMultiplier() {
        return enrage_multiplier;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof UrsaEnrage))
            return false;
        if (object == this)
            return true;
        UrsaEnrage otherObject = (UrsaEnrage) object;
        return otherObject.getKey().equals(getKey());
    }

}
