package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeBfury extends Item {

    private static RecipeBfury instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeBfury() {
        iD = 144;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{Broadsword.instance(),Claymore.instance(),Pers.instance(),QuellingBlade.instance()};
        itemResult = Bfury.instance();
        key = "item_recipe_bfury";
        localizedName = "Battle Fury Recipe";
    }

    public static RecipeBfury instance() {
        if( instance == null ){
            instance = new RecipeBfury();
        }
        return instance;
    }

    public int getID() {
        return iD;
    }

    public int getItemCost() {
        return itemCost;
    }

    public int getItemRecipe() {
        return itemRecipe;
    }

    public Item[] getItemRequirements() {
        return itemRequirements;
    }

    public Item getItemResult() {
        return itemResult;
    }

    public String getKey() {
        return key;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RecipeBfury))
            return false;
        if (object == this)
            return true;
        RecipeBfury otherObject = (RecipeBfury) object;
        return otherObject.getKey().equals(getKey());
    }

}
