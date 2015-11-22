package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeCrimsonGuard extends Item {

    private static RecipeCrimsonGuard instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeCrimsonGuard() {
        iD = 243;
        itemCost = 600;
        itemRecipe = 1;
        itemRequirements = new Item[]{Vanguard.instance(),Buckler.instance()};
        itemResult = CrimsonGuard.instance();
        key = "item_recipe_crimson_guard";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Crimson Guard Recipe";
    }

    public static RecipeCrimsonGuard instance() {
        if( instance == null ){
            instance = new RecipeCrimsonGuard();
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
        if (!(object instanceof RecipeCrimsonGuard))
            return false;
        if (object == this)
            return true;
        RecipeCrimsonGuard otherObject = (RecipeCrimsonGuard) object;
        return otherObject.getKey().equals(getKey());
    }

}
