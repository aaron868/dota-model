package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeTravelBoots extends Item {

    private static RecipeTravelBoots instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeTravelBoots() {
        iD = 47;
        itemCost = 2000;
        itemRecipe = 1;
        itemRequirements = new Item[0];
        itemResult = TravelBoots.instance();
        key = "item_recipe_travel_boots";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Boots Of Travel Recipe";
    }

    public static RecipeTravelBoots instance() {
        if( instance == null ){
            instance = new RecipeTravelBoots();
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
        if (!(object instanceof RecipeTravelBoots))
            return false;
        if (object == this)
            return true;
        RecipeTravelBoots otherObject = (RecipeTravelBoots) object;
        return otherObject.getKey().equals(getKey());
    }

}
