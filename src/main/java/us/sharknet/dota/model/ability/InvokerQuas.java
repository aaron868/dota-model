package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class InvokerQuas extends Ability {

    private static InvokerQuas instance;

    private final String[] abilityBehavior;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final int[] bonus_strength;
    private final double[] health_regen_per_instance;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private InvokerQuas() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCooldown = new double[]{0,0,0,0};
        abilityManaCost = new int[]{0,0,0,0};
        iD = 5370;
        key = "invoker_quas";
        bonus_strength = new int[]{2,4,6,8,10,12,14};
        health_regen_per_instance = new double[]{1.0,2.0,3.0,4.0,5.0,6.0,7.0};
        localizedName = "Quas";
        ownerKey = "npc_dota_hero_invoker";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
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

    public int[] getBonusStrength() {
        return bonus_strength;
    }

    public double[] getHealthRegenPerInstance() {
        return health_regen_per_instance;
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
        if (!(object instanceof InvokerQuas))
            return false;
        if (object == this)
            return true;
        InvokerQuas otherObject = (InvokerQuas) object;
        return otherObject.getKey().equals(getKey());
    }

}
