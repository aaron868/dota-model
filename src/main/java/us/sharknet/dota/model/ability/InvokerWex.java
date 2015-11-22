package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class InvokerWex extends Ability {

    private static InvokerWex instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int[] attack_speed_per_instance;
    private final int[] bonus_agility;
    private final String localizedName;
    private final int[] move_speed_per_instance;
    private final String owningHeroShortKey;

    private InvokerWex() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCooldown = 0;
        abilityManaCost = 0;
        iD = 5371;
        key = "invoker_wex";
        maxLevel = 7;
        attack_speed_per_instance = new int[]{2,4,6,8,10,12,14};
        bonus_agility = new int[]{2,4,6,8,10,12,14};
        localizedName = "Wex";
        move_speed_per_instance = new int[]{1,2,3,4,5,6,7};
        owningHeroShortKey = "invoker";
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

    public int getAbilityCooldown() {
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

    public int getMaxLevel() {
        return maxLevel;
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

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
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
