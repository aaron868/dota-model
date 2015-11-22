package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeNullTalisman extends Item {

    private static RecipeNullTalisman instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeNullTalisman() {
        iD = 76;
        itemCost = 155;
        itemRecipe = 1;
        itemRequirements = new Item[]{Circlet.instance(),Mantle.instance()};
        itemResult = NullTalisman.instance();
        key = "item_recipe_null_talisman";
        localizedName = "Null Talisman Recipe";
    }

    public static RecipeNullTalisman instance() {
        if( instance == null ){
            instance = new RecipeNullTalisman();
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

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RecipeNullTalisman))
            return false;
        if (object == this)
            return true;
        RecipeNullTalisman otherObject = (RecipeNullTalisman) object;
        return otherObject.getKey().equals(getKey());
    }

}
