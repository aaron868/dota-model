package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BristlebackWarpath extends Ability {

    private static BristlebackWarpath instance;

    private final String abilityBehavior;
    private final double[] abilityDuration;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int[] base_damage;
    private final int[] base_move_speed;
    private final int[] damage_per_stack;
    private final String localizedName;
    private final int[] max_stacks;
    private final int[] move_speed_per_stack;
    private final String owningHeroShortKey;
    private final int stack_duration;

    private BristlebackWarpath() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        abilityDuration = new double[]{10.0,10.0,10.0};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5551;
        key = "bristleback_warpath";
        base_damage = new int[]{20,25,30};
        base_move_speed = new int[]{3,4,5};
        damage_per_stack = new int[]{20,25,30};
        localizedName = "Warpath";
        max_stacks = new int[]{5,6,7};
        move_speed_per_stack = new int[]{3,4,5};
        owningHeroShortKey = "bristleback";
        stack_duration = 14;
    }

    public static BristlebackWarpath instance() {
        if( instance == null ){
            instance = new BristlebackWarpath();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
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

    public int[] getBaseDamage() {
        return base_damage;
    }

    public int[] getBaseMoveSpeed() {
        return base_move_speed;
    }

    public int[] getDamagePerStack() {
        return damage_per_stack;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMaxStacks() {
        return max_stacks;
    }

    public int[] getMoveSpeedPerStack() {
        return move_speed_per_stack;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getStackDuration() {
        return stack_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BristlebackWarpath))
            return false;
        if (object == this)
            return true;
        BristlebackWarpath otherObject = (BristlebackWarpath) object;
        return otherObject.getKey().equals(getKey());
    }

}
