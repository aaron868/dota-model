package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeHeart extends Item {

    private static RecipeHeart instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeHeart() {
        iD = 113;
        itemCost = 14;
        itemRecipe = 1;
        itemRequirements = new Item[]{Reaver.instance(),VitalityBooster.instance()};
        itemResult = Heart.instance();
        key = "item_recipe_heart";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Heart Of Tarrasque Recipe";
    }

    public static RecipeHeart instance() {
        if( instance == null ){
            instance = new RecipeHeart();
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

    public String getModel() {
        return model;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RecipeHeart))
            return false;
        if (object == this)
            return true;
        RecipeHeart otherObject = (RecipeHeart) object;
        return otherObject.getKey().equals(getKey());
    }

}
