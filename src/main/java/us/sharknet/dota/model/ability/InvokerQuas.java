package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class InvokerQuas extends Ability {

    private static InvokerQuas instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int[] bonus_strength;
    private final double[] health_regen_per_instance;
    private final String localizedName;
    private final String owningHeroShortKey;

    private InvokerQuas() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCooldown = 0;
        abilityManaCost = 0;
        iD = 5370;
        key = "invoker_quas";
        maxLevel = 7;
        bonus_strength = new int[]{2,4,6,8,10,12,14};
        health_regen_per_instance = new double[]{1.0,2.0,3.0,4.0,5.0,6.0,7.0};
        localizedName = "Quas";
        owningHeroShortKey = "invoker";
    }

    public static InvokerQuas instance() {
        if( instance == null ){
            instance = new InvokerQuas();
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

    public int[] getBonusStrength() {
        return bonus_strength;
    }

    public double[] getHealthRegenPerInstance() {
        return health_regen_per_instance;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof InvokerQuas))
            return false;
        if (object == this)
            return true;
        InvokerQuas otherObject = (InvokerQuas) object;
        return otherObject.getKey().equals(getKey());
    }

}
