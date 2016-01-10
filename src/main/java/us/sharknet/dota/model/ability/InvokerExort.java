package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class InvokerExort extends Ability {

    private static InvokerExort instance;

    private final String[] abilityBehavior;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final int[] bonus_damage_per_instance;
    private final int[] bonus_intelligence;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private InvokerExort() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCooldown = new double[]{0,0,0,0};
        abilityManaCost = new int[]{0,0,0,0};
        iD = 5372;
        key = "invoker_exort";
        bonus_damage_per_instance = new int[]{3,6,9,12,15,18,21};
        bonus_intelligence = new int[]{2,4,6,8,10,12,14};
        localizedName = "Exort";
        ownerKey = "npc_dota_hero_invoker";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static InvokerExort instance() {
        if( instance == null ){
            instance = new InvokerExort();
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

    public int[] getBonusDamagePerInstance() {
        return bonus_damage_per_instance;
    }

    public int[] getBonusIntelligence() {
        return bonus_intelligence;
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
        if (!(object instanceof InvokerExort))
            return false;
        if (object == this)
            return true;
        InvokerExort otherObject = (InvokerExort) object;
        return otherObject.getKey().equals(getKey());
    }

}
