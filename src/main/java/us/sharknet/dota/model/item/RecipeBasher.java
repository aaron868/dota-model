package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeBasher extends Item {

    private static RecipeBasher instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeBasher() {
        iD = 142;
        itemCost = 1;
        itemRecipe = 1;
        itemRequirements = new Item[]{BeltOfStrength.instance(),Javelin.instance()};
        itemResult = Basher.instance();
        key = "item_recipe_basher";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Skull Basher Recipe";
    }

    public static RecipeBasher instance() {
        if( instance == null ){
            instance = new RecipeBasher();
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
        if (!(object instanceof RecipeBasher))
            return false;
        if (object == this)
            return true;
        RecipeBasher otherObject = (RecipeBasher) object;
        return otherObject.getKey().equals(getKey());
    }

}
