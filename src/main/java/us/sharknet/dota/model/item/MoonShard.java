package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class MoonShard extends Item {

    private static MoonShard instance;

    private final String[] abilityBehavior;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int sideShop;
    private final int bonus_attack_speed;
    private final int bonus_night_vision;
    private final int consumed_bonus;
    private final String localizedName;

    private MoonShard() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_CUSTOM"};
        iD = 247;
        itemAliases = "moon shard";
        itemCost = 4;
        itemQuality = "common";
        itemShopTags = "attack_speed";
        key = "item_moon_shard";
        sideShop = 0;
        bonus_attack_speed = 12;
        bonus_night_vision = 25;
        consumed_bonus = 6;
        localizedName = "Moon Shard";
    }

    public static MoonShard instance() {
        if( instance == null ){
            instance = new MoonShard();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
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

    public String getItemQuality() {
        return itemQuality;
    }

    public String getItemShopTags() {
        return itemShopTags;
    }

    public String getKey() {
        return key;
    }

    public int getSideShop() {
        return sideShop;
    }

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int getBonusNightVision() {
        return bonus_night_vision;
    }

    public int getConsumedBonus() {
        return consumed_bonus;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MoonShard))
            return false;
        if (object == this)
            return true;
        MoonShard otherObject = (MoonShard) object;
        return otherObject.getKey().equals(getKey());
    }

}
