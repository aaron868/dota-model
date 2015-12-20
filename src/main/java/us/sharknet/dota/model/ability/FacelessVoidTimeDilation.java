package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class FacelessVoidTimeDilation extends Ability {

    private static FacelessVoidTimeDilation instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final int[] abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final String key;
    private final double[] duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;
    private final int[] slow;

    private FacelessVoidTimeDilation() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_NO_TARGET";
        abilityCastPoint = .1;
        abilityCooldown = new int[]{34,28,22,16};
        abilityManaCost = 50;
        iD = 5691;
        key = "faceless_void_time_dilation";
        duration = new double[]{6.0,7.0,8.0,9.0};
        localizedName = " Time Dilation";
        owningHeroShortKey = "faceless_void";
        radius = 650;
        slow = new int[]{4,6,8,10};
    }

    public static FacelessVoidTimeDilation instance() {
        if( instance == null ){
            instance = new FacelessVoidTimeDilation();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
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

    public int[] getSlow() {
        return slow;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof FacelessVoidTimeDilation))
            return false;
        if (object == this)
            return true;
        FacelessVoidTimeDilation otherObject = (FacelessVoidTimeDilation) object;
        return otherObject.getKey().equals(getKey());
    }

}
