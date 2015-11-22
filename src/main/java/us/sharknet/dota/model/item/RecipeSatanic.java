package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeSatanic extends Item {

    private static RecipeSatanic instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeSatanic() {
        iD = 155;
        itemCost = 1100;
        itemRecipe = 1;
        itemRequirements = new Item[]{Reaver.instance(),HelmOfTheDominator.instance()};
        itemResult = Satanic.instance();
        key = "item_recipe_satanic";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Satanic Recipe";
    }

    public static RecipeSatanic instance() {
        if( instance == null ){
            instance = new RecipeSatanic();
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
        if (!(object instanceof RecipeSatanic))
            return false;
        if (object == this)
            return true;
        RecipeSatanic otherObject = (RecipeSatanic) object;
        return otherObject.getKey().equals(getKey());
    }

}
