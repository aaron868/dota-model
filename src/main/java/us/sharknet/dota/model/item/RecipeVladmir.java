package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeVladmir extends Item {

    private static RecipeVladmir instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeVladmir() {
        iD = 80;
        itemCost = 300;
        itemRecipe = 1;
        itemRequirements = new Item[]{Headdress.instance(),RingOfBasilius.instance(),Lifesteal.instance()};
        itemResult = Vladmir.instance();
        key = "item_recipe_vladmir";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Vladmir's Offering Recipe";
    }

    public static RecipeVladmir instance() {
        if( instance == null ){
            instance = new RecipeVladmir();
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
        if (!(object instanceof RecipeVladmir))
            return false;
        if (object == this)
            return true;
        RecipeVladmir otherObject = (RecipeVladmir) object;
        return otherObject.getKey().equals(getKey());
    }

}
