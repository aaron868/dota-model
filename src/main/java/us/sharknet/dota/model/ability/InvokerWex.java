package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class InvokerWex extends Ability {

    private static InvokerWex instance;

    private final String[] abilityBehavior;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final int[] attack_speed_per_instance;
    private final int[] bonus_agility;
    private final String localizedName;
    private final int[] move_speed_per_instance;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private InvokerWex() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCooldown = new double[]{0,0,0,0};
        abilityManaCost = new int[]{0,0,0,0};
        iD = 5371;
        key = "invoker_wex";
        attack_speed_per_instance = new int[]{2,4,6,8,10,12,14};
        bonus_agility = new int[]{2,4,6,8,10,12,14};
        localizedName = "Wex";
        move_speed_per_instance = new int[]{1,2,3,4,5,6,7};
        ownerKey = "npc_dota_hero_invoker";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static InvokerWex instance() {
        if( instance == null ){
            instance = new InvokerWex();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
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

    public int[] getAttackSpeedPerInstance() {
        return attack_speed_per_instance;
    }

    public int[] getBonusAgility() {
        return bonus_agility;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMoveSpeedPerInstance() {
        return move_speed_per_instance;
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
        if (!(object instanceof InvokerWex))
            return false;
        if (object == this)
            return true;
        InvokerWex otherObject = (InvokerWex) object;
        return otherObject.getKey().equals(getKey());
    }

}
