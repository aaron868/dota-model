package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RikiTricksOfTheTrade extends Ability {

    private static RikiTricksOfTheTrade instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int[] abilityChannelTime;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final int[] attack_count;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int range;

    private RikiTricksOfTheTrade() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_MOVEMENT","DOTA_ABILITY_BEHAVIOR_CHANNELLED","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK","DOTA_ABILITY_BEHAVIOR_ROOT_DISABLES"};
        abilityCastPoint = .4;
        abilityChannelTime = new int[]{3,4,5};
        abilityCooldown = 40;
        abilityManaCost = 75;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5145;
        key = "riki_tricks_of_the_trade";
        attack_count = new int[]{4,5,6};
        localizedName = "Tricks of the Trade";
        owningHeroShortKey = "riki";
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

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityChannelTime() {
        return abilityChannelTime;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
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

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
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
