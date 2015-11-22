package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeRadiance extends Item {

    private static RecipeRadiance instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeRadiance() {
        iD = 136;
        itemCost = 135;
        itemRecipe = 1;
        itemRequirements = new Item[0];
        itemResult = Radiance.instance();
        key = "item_recipe_radiance";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Radiance Recipe";
    }

    public static RecipeRadiance instance() {
        if( instance == null ){
            instance = new RecipeRadiance();
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
        if (!(object instanceof RecipeRadiance))
            return false;
        if (object == this)
            return true;
        RecipeRadiance otherObject = (RecipeRadiance) object;
        return otherObject.getKey().equals(getKey());
    }

}
