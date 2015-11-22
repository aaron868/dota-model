package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TinkerHeatSeekingMissile extends Ability {

    private static TinkerHeatSeekingMissile instance;

    private final String abilityBehavior;
    private final int[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;
    private final int[] speed;
    private final int[] targets;

    private TinkerHeatSeekingMissile() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = new int[]{0,0,0,0};
        abilityCooldown = new double[]{25.0,25.0,25.0,25.0};
        abilityDamage = new int[]{125,200,275,350};
        abilityManaCost = new int[]{120,140,160,180};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 5151;
        key = "tinker_heat_seeking_missile";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Heat Seeking Missile";
        owningHeroShortKey = "tinker";
        radius = new int[]{2500,2500,2500,2500};
        speed = new int[]{900,900,900,900};
        targets = new int[]{2,2,2,2};
    }

    public static TinkerHeatSeekingMissile instance() {
        if( instance == null ){
            instance = new TinkerHeatSeekingMissile();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
        return radius;
    }

    public int[] getSpeed() {
        return speed;
    }

    public int[] getTargets() {
        return targets;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TinkerHeatSeekingMissile))
            return false;
        if (object == this)
            return true;
        TinkerHeatSeekingMissile otherObject = (TinkerHeatSeekingMissile) object;
        return otherObject.getKey().equals(getKey());
    }

}
