package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class InvokerInvoke extends Ability {

    private static InvokerInvoke instance;

    private final String[] abilityBehavior;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int levelsBetweenUpgrades;
    private final int requiredLevel;
    private final double[] cooldown_scepter;
    private final String localizedName;
    private final int mana_cost_scepter;
    private final int[] max_invoked_spells;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private InvokerInvoke() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCooldown = new double[]{22,17,12,5};
        abilityManaCost = new int[]{20,40,60,80};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5375;
        key = "invoker_invoke";
        levelsBetweenUpgrades = 5;
        requiredLevel = 1;
        cooldown_scepter = new double[]{16.0,8.0,4.0,2.0};
        localizedName = "Invoke";
        mana_cost_scepter = 0;
        max_invoked_spells = new int[]{2,2,2,2};
        ownerKey = "npc_dota_hero_invoker";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static InvokerInvoke instance() {
        if( instance == null ){
            instance = new InvokerInvoke();
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

    public String getAbilityType() {
        return abilityType;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getLevelsBetweenUpgrades() {
        return levelsBetweenUpgrades;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public double[] getCooldownScepter() {
        return cooldown_scepter;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getManaCostScepter() {
        return mana_cost_scepter;
    }

    public int[] getMaxInvokedSpells() {
        return max_invoked_spells;
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
        if (!(object instanceof InvokerInvoke))
            return false;
        if (object == this)
            return true;
        InvokerInvoke otherObject = (InvokerInvoke) object;
        return otherObject.getKey().equals(getKey());
    }

}
