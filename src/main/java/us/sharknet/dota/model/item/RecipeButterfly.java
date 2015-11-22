package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeButterfly extends Item {

    private static RecipeButterfly instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeButterfly() {
        iD = 138;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{Eagle.instance(),TalismanOfEvasion.instance(),Quarterstaff.instance()};
        itemResult = Butterfly.instance();
        key = "item_recipe_butterfly";
        localizedName = "Butterfly Recipe";
    }

    public static RecipeButterfly instance() {
        if( instance == null ){
            instance = new RecipeButterfly();
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
        if (!(object instanceof RecipeButterfly))
            return false;
        if (object == this)
            return true;
        RecipeButterfly otherObject = (RecipeButterfly) object;
        return otherObject.getKey().equals(getKey());
    }

}
