package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LycanShapeshift extends Ability {

    private static LycanShapeshift instance;

    private final String abilityBehavior;
    private final int[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final int bonus_night_vision;
    private final int crit_chance;
    private final int[] crit_multiplier;
    private final int duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int speed;
    private final double transformation_time;

    private LycanShapeshift() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCooldown = new int[]{120,90,60};
        abilityManaCost = new int[]{100,100,100};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        fightRecapLevel = 2;
        iD = 5398;
        key = "lycan_shapeshift";
        bonus_night_vision = 1000;
        crit_chance = 40;
        crit_multiplier = new int[]{140,160,180};
        duration = 18;
        localizedName = "Shapeshift";
        owningHeroShortKey = "lycan";
        speed = 650;
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

    public int getBonusNightVision() {
        return bonus_night_vision;
    }

    public int getCritChance() {
        return crit_chance;
    }

    public int[] getCritMultiplier() {
        return crit_multiplier;
    }

    public int getDuration() {
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
