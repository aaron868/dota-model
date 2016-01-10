package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BrewmasterPrimalSplit extends Ability {

    private static BrewmasterPrimalSplit instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final double[] duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double split_duration;

    private BrewmasterPrimalSplit() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{.65,.65,.65,.65};
        abilityCooldown = new double[]{140.0,120.0,100.0};
        abilityManaCost = new int[]{125,150,175};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5403;
        key = "brewmaster_primal_split";
        duration = new double[]{15.0,17.0,19.0};
        localizedName = "Primal Split";
        ownerKey = "npc_dota_hero_brewmaster";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        split_duration = .6;
    }

    public static BrewmasterPrimalSplit instance() {
        if( instance == null ){
            instance = new BrewmasterPrimalSplit();
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

    public String getAbilityType() {
        return abilityType;
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

    public double getSplitDuration() {
        return split_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BrewmasterPrimalSplit))
            return false;
        if (object == this)
            return true;
        BrewmasterPrimalSplit otherObject = (BrewmasterPrimalSplit) object;
        return otherObject.getKey().equals(getKey());
    }

}
