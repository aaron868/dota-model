package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipePipe extends Item {

    private static RecipePipe instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipePipe() {
        iD = 89;
        itemCost = 8;
        itemRecipe = 1;
        itemRequirements = new Item[]{HoodOfDefiance.instance(),Headdress.instance()};
        itemResult = Pipe.instance();
        key = "item_recipe_pipe";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Pipe Of Insight Recipe";
    }

    public static RecipePipe instance() {
        if( instance == null ){
            instance = new RecipePipe();
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
        if (!(object instanceof RecipePipe))
            return false;
        if (object == this)
            return true;
        RecipePipe otherObject = (RecipePipe) object;
        return otherObject.getKey().equals(getKey());
    }

}
