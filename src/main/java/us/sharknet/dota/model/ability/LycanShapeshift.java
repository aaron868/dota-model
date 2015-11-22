package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LycanShapeshift extends Ability {

    private static LycanShapeshift instance;

    private final String abilityBehavior;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final int bonus_night_vision;
    private final int[] crit_chance;
    private final int[] crit_damage;
    private final double[] duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int speed;
    private final double transformation_time;

    private LycanShapeshift() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCooldown = new double[]{120.0,90.0,60.0};
        abilityManaCost = new int[]{100,100,100};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        fightRecapLevel = 2;
        iD = 5398;
        key = "lycan_shapeshift";
        bonus_night_vision = 1;
        crit_chance = new int[]{30,35,40};
        crit_damage = new int[]{170,170,170};
        duration = new double[]{18.0,18.0,18.0};
        localizedName = "Shapeshift";
        owningHeroShortKey = "lycan";
        speed = 65;
        transformation_time = 1.5;
    }

    public static LycanShapeshift instance() {
        if( instance == null ){
            instance = new LycanShapeshift();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCooldown() {
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

    public int getBonusNightVision() {
        return bonus_night_vision;
    }

    public int[] getCritChance() {
        return crit_chance;
    }

    public int[] getCritDamage() {
        return crit_damage;
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

    public int getSpeed() {
        return speed;
    }

    public double getTransformationTime() {
        return transformation_time;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LycanShapeshift))
            return false;
        if (object == this)
            return true;
        LycanShapeshift otherObject = (LycanShapeshift) object;
        return otherObject.getKey().equals(getKey());
    }

}
