package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class HandOfMidas extends Item {

    private static HandOfMidas instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String[] abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_attack_speed;
    private final int bonus_gold;
    private final String localizedName;
    private final int transmute_cast_range_tooltip;
    private final double xp_multiplier;

    private HandOfMidas() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = 0;
        abilityCastRange = 600;
        abilityCooldown = 1;
        abilityManaCost = 0;
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_NOT_ANCIENTS","DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES"};
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_CREEP";
        iD = 65;
        itemAliases = "hand of midas";
        itemCost = 2050;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "common";
        itemShopTags = new String[]{"attack_speed","hard_to_tag"};
        key = "item_hand_of_midas";
        bonus_attack_speed = 30;
        bonus_gold = 190;
        localizedName = "Hand Of Midas";
        transmute_cast_range_tooltip = 600;
        xp_multiplier = 2.5;
    }

    public static HandOfMidas instance() {
        if( instance == null ){
            instance = new HandOfMidas();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String[] getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getID() {
        return iD;
    }

    public String getItemAliases() {
        return itemAliases;
    }

    public int getItemCost() {
        return itemCost;
    }

    public String[] getItemDeclarations() {
        return itemDeclarations;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public String[] getItemShopTags() {
        return itemShopTags;
    }

    public String getKey() {
        return key;
    }

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int getBonusGold() {
        return bonus_gold;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getTransmuteCastRangeTooltip() {
        return transmute_cast_range_tooltip;
    }

    public double getXpMultiplier() {
        return xp_multiplier;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof HandOfMidas))
            return false;
        if (object == this)
            return true;
        HandOfMidas otherObject = (HandOfMidas) object;
        return otherObject.getKey().equals(getKey());
    }

}
