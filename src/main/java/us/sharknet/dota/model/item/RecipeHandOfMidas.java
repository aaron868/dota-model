package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeHandOfMidas extends Item {

    private static RecipeHandOfMidas instance;

    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeHandOfMidas() {
        iD = 64;
        itemAliases = "hom";
        itemCost = 1550;
        itemRecipe = 1;
        itemRequirements = new Item[0];
        itemResult = HandOfMidas.instance();
        key = "item_recipe_hand_of_midas";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Hand Of Midas Recipe";
    }

    public static RecipeHandOfMidas instance() {
        if( instance == null ){
            instance = new RecipeHandOfMidas();
        }
        return instance;
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

    public String getModel() {
        return model;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RecipeHandOfMidas))
            return false;
        if (object == this)
            return true;
        RecipeHandOfMidas otherObject = (RecipeHandOfMidas) object;
        return otherObject.getKey().equals(getKey());
    }

}
