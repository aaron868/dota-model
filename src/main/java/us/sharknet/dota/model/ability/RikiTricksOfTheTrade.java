package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RikiTricksOfTheTrade extends Ability {

    private static RikiTricksOfTheTrade instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityChannelTime;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int[] attack_count;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int range;

    private RikiTricksOfTheTrade() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_MOVEMENT","DOTA_ABILITY_BEHAVIOR_CHANNELLED","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK","DOTA_ABILITY_BEHAVIOR_ROOT_DISABLES"};
        abilityCastPoint = new double[]{.4,.4,.4,.4};
        abilityChannelTime = new double[]{3,4,5};
        abilityCooldown = new double[]{40,40,40,40};
        abilityManaCost = new int[]{75,75,75,75};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5145;
        key = "riki_tricks_of_the_trade";
        attack_count = new int[]{4,5,6};
        localizedName = "Tricks of the Trade";
        ownerKey = "npc_dota_hero_riki";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        range = 500;
    }

    public static RikiTricksOfTheTrade instance() {
        if( instance == null ){
            instance = new RikiTricksOfTheTrade();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityChannelTime() {
        return abilityChannelTime;
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

    public int[] getAttackCount() {
        return attack_count;
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

    public int getRange() {
        return range;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RikiTricksOfTheTrade))
            return false;
        if (object == this)
            return true;
        RikiTricksOfTheTrade otherObject = (RikiTricksOfTheTrade) object;
        return otherObject.getKey().equals(getKey());
    }

}
