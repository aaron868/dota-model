package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TreantOvergrowth extends Ability {

    private static TreantOvergrowth instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration;
    private final int eyes_radius;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;

    private TreantOvergrowth() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = new double[]{0.5,0.5,0.5,0.5};
        abilityCooldown = 70;
        abilityManaCost = new int[]{150,175,200};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 2;
        iD = 5437;
        key = "treant_overgrowth";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        duration = new double[]{3.0,3.75,4.5};
        eyes_radius = 800;
        localizedName = "Overgrowth";
        owningHeroShortKey = "treant";
        radius = 675;
    }

    public static TreantOvergrowth instance() {
        if( instance == null ){
            instance = new TreantOvergrowth();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public double[] getDuration() {
        return duration;
    }

    public int getEyesRadius() {
        return eyes_radius;
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
        if (!(object instanceof TreantOvergrowth))
            return false;
        if (object == this)
            return true;
        TreantOvergrowth otherObject = (TreantOvergrowth) object;
        return otherObject.getKey().equals(getKey());
    }

}
