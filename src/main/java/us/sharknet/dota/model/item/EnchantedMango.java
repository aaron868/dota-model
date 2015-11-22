package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class EnchantedMango extends Item {

    private static EnchantedMango instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final int itemHideCharges;
    private final int itemInitialCharges;
    private final int itemPermanent;
    private final String itemQuality;
    private final String itemShopTags;
    private final int itemStackable;
    private final String key;
    private final String model;
    private final int sideShop;
    private final int hp_regen;
    private final String localizedName;
    private final int replenish_amount;

    private EnchantedMango() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_OPTIONAL_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = 0;
        abilityCastRange = 4;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        iD = 216;
        itemAliases = "enchanted mango";
        itemCost = 125;
        itemHideCharges = 1;
        itemInitialCharges = 1;
        itemPermanent = 0;
        itemQuality = "consumable";
        itemShopTags = "consumable";
        itemStackable = 0;
        key = "item_enchanted_mango";
        model = "models/props_gameplay/mango.vmdl";
        sideShop = 0;
        hp_regen = 1;
        localizedName = "Enchanted Mango";
        replenish_amount = 15;
    }

    public static EnchantedMango instance() {
        if( instance == null ){
            instance = new EnchantedMango();
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

    public int getItemHideCharges() {
        return itemHideCharges;
    }

    public int getItemInitialCharges() {
        return itemInitialCharges;
    }

    public int getItemPermanent() {
        return itemPermanent;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public String getItemShopTags() {
        return itemShopTags;
    }

    public int getItemStackable() {
        return itemStackable;
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

    public int getHpRegen() {
        return hp_regen;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getReplenishAmount() {
        return replenish_amount;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EnchantedMango))
            return false;
        if (object == this)
            return true;
        EnchantedMango otherObject = (EnchantedMango) object;
        return otherObject.getKey().equals(getKey());
    }

}
