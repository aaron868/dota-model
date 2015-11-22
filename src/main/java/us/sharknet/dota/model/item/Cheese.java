package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Cheese extends Item {

    private static Cheese instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int fightRecapLevel;
    private final int iD;
    private final int itemContributesToNetWorthWhenDropped;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final int itemInitialCharges;
    private final int itemPermanent;
    private final int itemPurchasable;
    private final String itemQuality;
    private final String itemShareability;
    private final int itemStackable;
    private final String key;
    private final String model;
    private final int health_restore;
    private final String localizedName;
    private final int mana_restore;

    private Cheese() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 4;
        fightRecapLevel = 2;
        iD = 33;
        itemContributesToNetWorthWhenDropped = 0;
        itemCost = 1000;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemInitialCharges = 1;
        itemPermanent = 0;
        itemPurchasable = 0;
        itemQuality = "epic";
        itemShareability = "ITEM_FULLY_SHAREABLE";
        itemStackable = 1;
        key = "item_cheese";
        model = "models/props_gameplay/cheese.vmdl";
        health_restore = 2500;
        localizedName = "Cheese";
        mana_restore = 1000;
    }

    public static Cheese instance() {
        if( instance == null ){
            instance = new Cheese();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
    }

    public int getID() {
        return iD;
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

    public int getItemInitialCharges() {
        return itemInitialCharges;
    }

    public int getItemPermanent() {
        return itemPermanent;
    }

    public int getItemPurchasable() {
        return itemPurchasable;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public String getItemShareability() {
        return itemShareability;
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

    public int getHealthRestore() {
        return health_restore;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getManaRestore() {
        return mana_restore;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Cheese))
            return false;
        if (object == this)
            return true;
        Cheese otherObject = (Cheese) object;
        return otherObject.getKey().equals(getKey());
    }

}
