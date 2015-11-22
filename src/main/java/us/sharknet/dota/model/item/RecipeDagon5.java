package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeDagon5 extends Item {

    private static RecipeDagon5 instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeDagon5() {
        iD = 200;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{Dagon4.instance(),RecipeDagon.instance()};
        itemResult = Dagon5.instance();
        key = "item_recipe_dagon_5";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Dagon 5 Recipe";
    }

    public static RecipeDagon5 instance() {
        if( instance == null ){
            instance = new RecipeDagon5();
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
        if (!(object instanceof RecipeDagon5))
            return false;
        if (object == this)
            return true;
        RecipeDagon5 otherObject = (RecipeDagon5) object;
        return otherObject.getKey().equals(getKey());
    }

}
