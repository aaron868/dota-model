package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BrewmasterEarthPulverize extends Ability {

    private static BrewmasterEarthPulverize instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int[] chance;
    private final int[] damage_inner;
    private final int[] damage_outer;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius_inner;
    private final int[] radius_outer;

    private BrewmasterEarthPulverize() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5406;
        key = "brewmaster_earth_pulverize";
        chance = new int[]{20,20,20,20};
        damage_inner = new int[]{40,40,40,40};
        damage_outer = new int[]{20,20,20,20};
        localizedName = "Pulverize";
        ownerKey = "npc_dota_brewmaster_earth";
        ownerType = AbilityOwnerType.Summoned;
        passive = false;
        placeholder = false;
        radius_inner = new int[]{150,150,150,150};
        radius_outer = new int[]{250,250,250,250};
    }

    public static BrewmasterEarthPulverize instance() {
        if( instance == null ){
            instance = new BrewmasterEarthPulverize();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int[] getChance() {
        return chance;
    }

    public int[] getDamageInner() {
        return damage_inner;
    }

    public int[] getDamageOuter() {
        return damage_outer;
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

    public int[] getRadiusInner() {
        return radius_inner;
    }

    public int[] getRadiusOuter() {
        return radius_outer;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BrewmasterEarthPulverize))
            return false;
        if (object == this)
            return true;
        BrewmasterEarthPulverize otherObject = (BrewmasterEarthPulverize) object;
        return otherObject.getKey().equals(getKey());
    }

}
