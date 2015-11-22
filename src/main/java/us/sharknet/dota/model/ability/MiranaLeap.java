package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MiranaLeap extends Ability {

    private static MiranaLeap instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int abilityDuration;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final int leap_acceleration;
    private final int[] leap_distance;
    private final int leap_radius;
    private final int leap_speed;
    private final int[] leap_speedbonus;
    private final int[] leap_speedbonus_as;
    private final String localizedName;
    private final String owningHeroShortKey;

    private MiranaLeap() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = 0;
        abilityCooldown = new double[]{30.0,26.0,22.0,18.0};
        abilityDuration = 1;
        abilityManaCost = new int[]{40,35,30,20};
        iD = 5050;
        key = "mirana_leap";
        leap_acceleration = 7;
        leap_distance = new int[]{600,700,800,900};
        leap_radius = 775;
        leap_speed = 16;
        leap_speedbonus = new int[]{4,8,12,16};
        leap_speedbonus_as = new int[]{8,16,24,32};
        localizedName = "Leap";
        owningHeroShortKey = "mirana";
    }

    public static MiranaLeap instance() {
        if( instance == null ){
            instance = new MiranaLeap();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getLeapAcceleration() {
        return leap_acceleration;
    }

    public int[] getLeapDistance() {
        return leap_distance;
    }

    public int getLeapRadius() {
        return leap_radius;
    }

    public int getLeapSpeed() {
        return leap_speed;
    }

    public int[] getLeapSpeedbonus() {
        return leap_speedbonus;
    }

    public int[] getLeapSpeedbonusAs() {
        return leap_speedbonus_as;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MiranaLeap))
            return false;
        if (object == this)
            return true;
        MiranaLeap otherObject = (MiranaLeap) object;
        return otherObject.getKey().equals(getKey());
    }

}
