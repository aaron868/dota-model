package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeUrnOfShadows extends Item {

    private static RecipeUrnOfShadows instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeUrnOfShadows() {
        iD = 91;
        itemCost = 250;
        itemRecipe = 1;
        itemRequirements = new Item[]{SobiMask.instance(),Gauntlets.instance(),Gauntlets.instance()};
        itemResult = UrnOfShadows.instance();
        key = "item_recipe_urn_of_shadows";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Urn Of Shadows Recipe";
    }

    public static RecipeUrnOfShadows instance() {
        if( instance == null ){
            instance = new RecipeUrnOfShadows();
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
        if (!(object instanceof RecipeUrnOfShadows))
            return false;
        if (object == this)
            return true;
        RecipeUrnOfShadows otherObject = (RecipeUrnOfShadows) object;
        return otherObject.getKey().equals(getKey());
    }

}
