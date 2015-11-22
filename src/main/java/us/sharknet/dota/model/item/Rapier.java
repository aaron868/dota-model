package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Rapier extends Item {

    private static Rapier instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemContributesToNetWorthWhenDropped;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final int itemKillable;
    private final String itemQuality;
    private final int itemSellable;
    private final String itemShareability;
    private final String itemShopTags;
    private final String key;
    private final String model;
    private final int bonus_damage;
    private final String localizedName;

    private Rapier() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 133;
        itemAliases = "divine rapier";
        itemContributesToNetWorthWhenDropped = 0;
        itemCost = 6200;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_TO_SPECTATORS","DECLARE_PURCHASES_IN_SPEECH"};
        itemKillable = 0;
        itemQuality = "epic";
        itemSellable = 0;
        itemShareability = "ITEM_NOT_SHAREABLE";
        itemShopTags = "damage";
        key = "item_rapier";
        model = "models/props_gameplay/divine_rapier.vmdl";
        bonus_damage = 330;
        localizedName = "Divine Rapier";
    }

    public static Rapier instance() {
        if( instance == null ){
            instance = new Rapier();
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

    public int getItemContributesToNetWorthWhenDropped() {
        return itemContributesToNetWorthWhenDropped;
    }

    public int getItemCost() {
        return itemCost;
    }

    public String[] getItemDeclarations() {
        return itemDeclarations;
    }

    public int getItemKillable() {
        return itemKillable;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public int getItemSellable() {
        return itemSellable;
    }

    public String getItemShareability() {
        return itemShareability;
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

    public int getBonusDamage() {
        return bonus_damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Rapier))
            return false;
        if (object == this)
            return true;
        Rapier otherObject = (Rapier) object;
        return otherObject.getKey().equals(getKey());
    }

}
