package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeHeaddress extends Item {

    private static RecipeHeaddress instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeHeaddress() {
        iD = 93;
        itemCost = 2;
        itemRecipe = 1;
        itemRequirements = new Item[]{RingOfRegen.instance(),Branches.instance()};
        itemResult = Headdress.instance();
        key = "item_recipe_headdress";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Headdress Recipe";
    }

    public static RecipeHeaddress instance() {
        if( instance == null ){
            instance = new RecipeHeaddress();
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
        if (!(object instanceof RecipeHeaddress))
            return false;
        if (object == this)
            return true;
        RecipeHeaddress otherObject = (RecipeHeaddress) object;
        return otherObject.getKey().equals(getKey());
    }

}