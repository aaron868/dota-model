package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AlchemistGoblinsGreed extends Ability {

    private static AlchemistGoblinsGreed instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int bonus_bonus_gold;
    private final int[] bonus_gold;
    private final int[] bonus_gold_cap;
    private final int[] bounty_multiplier_tooltip;
    private final int duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private AlchemistGoblinsGreed() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5368;
        key = "alchemist_goblins_greed";
        bonus_bonus_gold = 3;
        bonus_gold = new int[]{6,8,10,12};
        bonus_gold_cap = new int[]{12,20,28,36};
        bounty_multiplier_tooltip = new int[]{3,4,5,6};
        duration = 30;
        localizedName = "Goblins Greed";
        ownerKey = "npc_dota_hero_alchemist";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static AlchemistGoblinsGreed instance() {
        if( instance == null ){
            instance = new AlchemistGoblinsGreed();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getBonusBonusGold() {
        return bonus_bonus_gold;
    }

    public int[] getBonusGold() {
        return bonus_gold;
    }

    public int[] getBonusGoldCap() {
        return bonus_gold_cap;
    }

    public int[] getBountyMultiplierTooltip() {
        return bounty_multiplier_tooltip;
    }

    public int getDuration() {
        return duration;
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
        if (!(object instanceof AlchemistGoblinsGreed))
            return false;
        if (object == this)
            return true;
        AlchemistGoblinsGreed otherObject = (AlchemistGoblinsGreed) object;
        return otherObject.getKey().equals(getKey());
    }

}
