package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class StoutShield extends Item {

    private static StoutShield instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final String model;
    private final int sideShop;
    private final int block_chance;
    private final int damage_block_melee;
    private final int damage_block_ranged;
    private final String localizedName;

    private StoutShield() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 182;
        itemAliases = "stout shield";
        itemCost = 2;
        itemQuality = "component";
        itemShopTags = "block";
        key = "item_stout_shield";
        model = "models/props_gameplay/stout_shield.vmdl";
        sideShop = 1;
        block_chance = 5;
        damage_block_melee = 16;
        damage_block_ranged = 8;
        localizedName = "Stout Shield";
    }

    public static StoutShield instance() {
        if( instance == null ){
            instance = new StoutShield();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
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

    public String getModel() {
        return model;
    }

    public int getSideShop() {
        return sideShop;
    }

    public int getBlockChance() {
        return block_chance;
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
        if (!(object instanceof StoutShield))
            return false;
        if (object == this)
            return true;
        StoutShield otherObject = (StoutShield) object;
        return otherObject.getKey().equals(getKey());
    }

}
