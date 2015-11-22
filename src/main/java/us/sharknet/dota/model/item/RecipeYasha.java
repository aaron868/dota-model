package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeYasha extends Item {

    private static RecipeYasha instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeYasha() {
        iD = 169;
        itemCost = 6;
        itemRecipe = 1;
        itemRequirements = new Item[]{BladeOfAlacrity.instance(),BootsOfElves.instance()};
        itemResult = Yasha.instance();
        key = "item_recipe_yasha";
        localizedName = "Yasha Recipe";
    }

    public static RecipeYasha instance() {
        if( instance == null ){
            instance = new RecipeYasha();
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
        if (!(object instanceof RecipeYasha))
            return false;
        if (object == this)
            return true;
        RecipeYasha otherObject = (RecipeYasha) object;
        return otherObject.getKey().equals(getKey());
    }

}
