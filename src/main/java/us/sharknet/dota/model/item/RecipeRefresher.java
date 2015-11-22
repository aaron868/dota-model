package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeRefresher extends Item {

    private static RecipeRefresher instance;

    private final int fightRecapLevel;
    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeRefresher() {
        fightRecapLevel = 2;
        iD = 19;
        itemCost = 18;
        itemRecipe = 1;
        itemRequirements = new Item[]{Pers.instance(),Pers.instance()};
        itemResult = Refresher.instance();
        key = "item_recipe_refresher";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Refresher Orb Recipe";
    }

    public static RecipeRefresher instance() {
        if( instance == null ){
            instance = new RecipeRefresher();
        }
        return instance;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
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
        if (!(object instanceof RecipeRefresher))
            return false;
        if (object == this)
            return true;
        RecipeRefresher otherObject = (RecipeRefresher) object;
        return otherObject.getKey().equals(getKey());
    }

}
