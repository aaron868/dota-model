package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeGreaterCrit extends Item {

    private static RecipeGreaterCrit instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeGreaterCrit() {
        iD = 14;
        itemCost = 1;
        itemRecipe = 1;
        itemRequirements = new Item[]{LesserCrit.instance(),DemonEdge.instance()};
        itemResult = GreaterCrit.instance();
        key = "item_recipe_greater_crit";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Daedalus Recipe";
    }

    public static RecipeGreaterCrit instance() {
        if( instance == null ){
            instance = new RecipeGreaterCrit();
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
        if (!(object instanceof RecipeGreaterCrit))
            return false;
        if (object == this)
            return true;
        RecipeGreaterCrit otherObject = (RecipeGreaterCrit) object;
        return otherObject.getKey().equals(getKey());
    }

}
