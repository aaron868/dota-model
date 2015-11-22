package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeSkadi extends Item {

    private static RecipeSkadi instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeSkadi() {
        iD = 159;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{UltimateOrb.instance(),UltimateOrb.instance(),PointBooster.instance(),OrbOfVenom.instance()};
        itemResult = Skadi.instance();
        key = "item_recipe_skadi";
        localizedName = "Eye Of Skadi Recipe";
    }

    public static RecipeSkadi instance() {
        if( instance == null ){
            instance = new RecipeSkadi();
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
        if (!(object instanceof RecipeSkadi))
            return false;
        if (object == this)
            return true;
        RecipeSkadi otherObject = (RecipeSkadi) object;
        return otherObject.getKey().equals(getKey());
    }

}
