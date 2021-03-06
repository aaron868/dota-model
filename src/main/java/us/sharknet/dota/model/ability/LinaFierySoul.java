package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LinaFierySoul extends Ability {

    private static LinaFierySoul instance;

    private final String[] abilityBehavior;
    private final double[] abilityDuration;
    private final int iD;
    private final String key;
    private final int duration_tooltip;
    private final int[] fiery_soul_attack_speed_bonus;
    private final int fiery_soul_max_stacks;
    private final int[] fiery_soul_move_speed_bonus;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private LinaFierySoul() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityDuration = new double[]{10,10,10,10};
        iD = 5042;
        key = "lina_fiery_soul";
        duration_tooltip = 10;
        fiery_soul_attack_speed_bonus = new int[]{40,55,70,85};
        fiery_soul_max_stacks = 3;
        fiery_soul_move_speed_bonus = new int[]{5,6,7,8};
        localizedName = "Fiery Soul";
        ownerKey = "npc_dota_hero_lina";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static LinaFierySoul instance() {
        if( instance == null ){
            instance = new LinaFierySoul();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getDurationTooltip() {
        return duration_tooltip;
    }

    public int[] getFierySoulAttackSpeedBonus() {
        return fiery_soul_attack_speed_bonus;
    }

    public int getFierySoulMaxStacks() {
        return fiery_soul_max_stacks;
    }

    public int[] getFierySoulMoveSpeedBonus() {
        return fiery_soul_move_speed_bonus;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LinaFierySoul))
            return false;
        if (object == this)
            return true;
        LinaFierySoul otherObject = (LinaFierySoul) object;
        return otherObject.getKey().equals(getKey());
    }

}
