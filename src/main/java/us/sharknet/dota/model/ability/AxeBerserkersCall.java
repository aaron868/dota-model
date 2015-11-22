package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AxeBerserkersCall extends Ability {

    private static AxeBerserkersCall instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int bonus_armor;
    private final double[] duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;

    private AxeBerserkersCall() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_MOVEMENT"};
        abilityCastPoint = .4;
        abilityCooldown = new int[]{16,14,12,10};
        abilityDamage = new int[]{0,0,0,0};
        abilityManaCost = new int[]{80,90,100,110};
        fightRecapLevel = 1;
        iD = 57;
        key = "axe_berserkers_call";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bonus_armor = 4;
        duration = new double[]{2.0,2.4,2.8,3.2};
        localizedName = "Berserkers Call";
        owningHeroShortKey = "axe";
        radius = 3;
    }

    public static AxeBerserkersCall instance() {
        if( instance == null ){
            instance = new AxeBerserkersCall();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public int getBonusArmor() {
        return bonus_armor;
    }

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AxeBerserkersCall))
            return false;
        if (object == this)
            return true;
        AxeBerserkersCall otherObject = (AxeBerserkersCall) object;
        return otherObject.getKey().equals(getKey());
    }

}
