package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeDesolator extends Item {

    private static RecipeDesolator instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeDesolator() {
        iD = 167;
        itemCost = 300;
        itemRecipe = 1;
        itemRequirements = new Item[]{MithrilHammer.instance(),MithrilHammer.instance()};
        itemResult = Desolator.instance();
        key = "item_recipe_desolator";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Desolator Recipe";
    }

    public static RecipeDesolator instance() {
        if( instance == null ){
            instance = new RecipeDesolator();
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
        if (!(object instanceof RecipeDesolator))
            return false;
        if (object == this)
            return true;
        RecipeDesolator otherObject = (RecipeDesolator) object;
        return otherObject.getKey().equals(getKey());
    }

}
