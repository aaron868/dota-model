package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeOrchid extends Item {

    private static RecipeOrchid instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeOrchid() {
        iD = 97;
        itemCost = 775;
        itemRecipe = 1;
        itemRequirements = new Item[]{OblivionStaff.instance(),OblivionStaff.instance()};
        itemResult = Orchid.instance();
        key = "item_recipe_orchid";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Orchid Malevolence Recipe";
    }

    public static RecipeOrchid instance() {
        if( instance == null ){
            instance = new RecipeOrchid();
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
        if (!(object instanceof RecipeOrchid))
            return false;
        if (object == this)
            return true;
        RecipeOrchid otherObject = (RecipeOrchid) object;
        return otherObject.getKey().equals(getKey());
    }

}
