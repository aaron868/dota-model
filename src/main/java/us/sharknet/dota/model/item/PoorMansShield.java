package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class PoorMansShield extends Item {

    private static PoorMansShield instance;

    private final String abilityBehavior;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int block_chance;
    private final int block_chance_hero;
    private final int bonus_agility;
    private final int damage_block_melee;
    private final int damage_block_ranged;
    private final String localizedName;

    private PoorMansShield() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 71;
        itemAliases = new String[]{"pms","poor man's shield"};
        itemCost = 5;
        itemQuality = "common";
        itemShopTags = new String[]{"agi","block"};
        key = "item_poor_mans_shield";
        block_chance = 53;
        block_chance_hero = 1;
        bonus_agility = 6;
        damage_block_melee = 2;
        damage_block_ranged = 1;
        localizedName = "Poor Man's Shield";
    }

    public static PoorMansShield instance() {
        if( instance == null ){
            instance = new PoorMansShield();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getID() {
        return iD;
    }

    public String[] getItemAliases() {
        return itemAliases;
    }

    public int getItemCost() {
        return itemCost;
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

    public int getBlockChance() {
        return block_chance;
    }

    public int getBlockChanceHero() {
        return block_chance_hero;
    }

    public int getBonusAgility() {
        return bonus_agility;
    }

    public int getDamageBlockMelee() {
        return damage_block_melee;
    }

    public int getDamageBlockRanged() {
        return damage_block_ranged;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PoorMansShield))
            return false;
        if (object == this)
            return true;
        PoorMansShield otherObject = (PoorMansShield) object;
        return otherObject.getKey().equals(getKey());
    }

}
