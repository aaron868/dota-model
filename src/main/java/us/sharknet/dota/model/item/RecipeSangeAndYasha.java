package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeSangeAndYasha extends Item {

    private static RecipeSangeAndYasha instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeSangeAndYasha() {
        iD = 153;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{Yasha.instance(),Sange.instance()};
        itemResult = SangeAndYasha.instance();
        key = "item_recipe_sange_and_yasha";
        localizedName = "Sange And Yasha Recipe";
    }

    public static RecipeSangeAndYasha instance() {
        if( instance == null ){
            instance = new RecipeSangeAndYasha();
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
        if (!(object instanceof RecipeSangeAndYasha))
            return false;
        if (object == this)
            return true;
        RecipeSangeAndYasha otherObject = (RecipeSangeAndYasha) object;
        return otherObject.getKey().equals(getKey());
    }

}
