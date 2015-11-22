package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeDagon4 extends Item {

    private static RecipeDagon4 instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeDagon4() {
        iD = 199;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{Dagon3.instance(),RecipeDagon.instance()};
        itemResult = Dagon4.instance();
        key = "item_recipe_dagon_4";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Dagon 4 Recipe";
    }

    public static RecipeDagon4 instance() {
        if( instance == null ){
            instance = new RecipeDagon4();
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
        if (!(object instanceof RecipeDagon4))
            return false;
        if (object == this)
            return true;
        RecipeDagon4 otherObject = (RecipeDagon4) object;
        return otherObject.getKey().equals(getKey());
    }

}
