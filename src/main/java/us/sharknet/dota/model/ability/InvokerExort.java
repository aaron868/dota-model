package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class InvokerExort extends Ability {

    private static InvokerExort instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int[] bonus_damage_per_instance;
    private final int[] bonus_intelligence;
    private final String localizedName;
    private final String owningHeroShortKey;

    private InvokerExort() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCooldown = 0;
        abilityManaCost = 0;
        iD = 5372;
        key = "invoker_exort";
        maxLevel = 7;
        bonus_damage_per_instance = new int[]{3,6,9,12,15,18,21};
        bonus_intelligence = new int[]{2,4,6,8,10,12,14};
        localizedName = "Exort";
        owningHeroShortKey = "invoker";
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

    public int[] getBonusDamagePerInstance() {
        return bonus_damage_per_instance;
    }

    public int[] getBonusIntelligence() {
        return bonus_intelligence;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
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
