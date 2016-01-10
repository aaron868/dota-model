package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class FacelessVoidTimeDilation extends Ability {

    private static FacelessVoidTimeDilation instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final double[] duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final int[] slow;

    private FacelessVoidTimeDilation() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{.1,.1,.1,.1};
        abilityCooldown = new double[]{36,30,24,18};
        abilityManaCost = new int[]{50,50,50,50};
        iD = 5691;
        key = "faceless_void_time_dilation";
        duration = new double[]{6.0,8.0,10.0,12.0};
        localizedName = "Time Dilation";
        ownerKey = "npc_dota_hero_faceless_void";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 725;
        slow = new int[]{7,8,9,10};
    }

    public static FacelessVoidTimeDilation instance() {
        if( instance == null ){
            instance = new FacelessVoidTimeDilation();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
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

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwnerKey() {
        return ownerKey;
    }

    public AbilityOwnerType getOwnerType() {
        return ownerType;
    }

    public boolean isPassive() {
        return passive;
    }

    public boolean isPlaceholder() {
        return placeholder;
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
