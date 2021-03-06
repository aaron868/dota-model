package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BroodmotherIncapacitatingBite extends Ability {

    private static BroodmotherIncapacitatingBite instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int[] bonus_movespeed;
    private final double[] duration;
    private final String localizedName;
    private final int[] miss_chance;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private BroodmotherIncapacitatingBite() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5281;
        key = "broodmother_incapacitating_bite";
        bonus_movespeed = new int[]{-10,-20,-30,-40};
        duration = new double[]{2.0,2.0,2.0,2.0};
        localizedName = "Incapacitating Bite";
        miss_chance = new int[]{30,40,50,60};
        ownerKey = "npc_dota_hero_broodmother";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static BroodmotherIncapacitatingBite instance() {
        if( instance == null ){
            instance = new BroodmotherIncapacitatingBite();
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

    public int[] getBonusMovespeed() {
        return bonus_movespeed;
    }

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMissChance() {
        return miss_chance;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BroodmotherIncapacitatingBite))
            return false;
        if (object == this)
            return true;
        BroodmotherIncapacitatingBite otherObject = (BroodmotherIncapacitatingBite) object;
        return otherObject.getKey().equals(getKey());
    }

}
