package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeSphere extends Item {

    private static RecipeSphere instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeSphere() {
        iD = 122;
        itemCost = 1325;
        itemRecipe = 1;
        itemRequirements = new Item[]{UltimateOrb.instance(),Pers.instance()};
        itemResult = Sphere.instance();
        key = "item_recipe_sphere";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Linken's Sphere Recipe";
    }

    public static RecipeSphere instance() {
        if( instance == null ){
            instance = new RecipeSphere();
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
        if (!(object instanceof RecipeSphere))
            return false;
        if (object == this)
            return true;
        RecipeSphere otherObject = (RecipeSphere) object;
        return otherObject.getKey().equals(getKey());
    }

}
