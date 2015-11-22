package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeWraithBand extends Item {

    private static RecipeWraithBand instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeWraithBand() {
        iD = 74;
        itemCost = 17;
        itemRecipe = 1;
        itemRequirements = new Item[]{Circlet.instance(),Slippers.instance()};
        itemResult = WraithBand.instance();
        key = "item_recipe_wraith_band";
        localizedName = "Wraith Band Recipe";
    }

    public static RecipeWraithBand instance() {
        if( instance == null ){
            instance = new RecipeWraithBand();
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
        if (!(object instanceof RecipeWraithBand))
            return false;
        if (object == this)
            return true;
        RecipeWraithBand otherObject = (RecipeWraithBand) object;
        return otherObject.getKey().equals(getKey());
    }

}
