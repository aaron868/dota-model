package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Dust extends Item {

    private static Dust instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String effect;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemDeclarations;
    private final int itemInitialCharges;
    private final int itemPermanent;
    private final String itemQuality;
    private final String itemShareability;
    private final String itemShopTags;
    private final int itemStackable;
    private final int itemSupport;
    private final String key;
    private final String model;
    private final int duration;
    private final String localizedName;
    private final int movespeed;
    private final int radius;

    private Dust() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 3;
        abilityManaCost = 5;
        effect = "particles/generic_gameplay/dropped_dust.vpcf";
        iD = 4;
        itemAliases = "dust of appearance";
        itemCost = 18;
        itemDeclarations = "DECLARE_PURCHASES_TO_TEAMMATES";
        itemInitialCharges = 2;
        itemPermanent = 0;
        itemQuality = "consumable";
        itemShareability = "ITEM_FULLY_SHAREABLE";
        itemShopTags = "consumable";
        itemStackable = 1;
        itemSupport = 1;
        key = "item_dust";
        model = "models/props_gameplay/dust.vmdl";
        duration = 12;
        localizedName = "Dust Of Appearance";
        movespeed = -2;
        radius = 15;
    }

    public static Dust instance() {
        if( instance == null ){
            instance = new Dust();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getEffect() {
        return effect;
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

    public String getItemDeclarations() {
        return itemDeclarations;
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

    public String getItemShareability() {
        return itemShareability;
    }

    public String getItemShopTags() {
        return itemShopTags;
    }

    public int getItemStackable() {
        return itemStackable;
    }

    public int getItemSupport() {
        return itemSupport;
    }

    public String getKey() {
        return key;
    }

    public String getModel() {
        return model;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMovespeed() {
        return movespeed;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Dust))
            return false;
        if (object == this)
            return true;
        Dust otherObject = (Dust) object;
        return otherObject.getKey().equals(getKey());
    }

}
