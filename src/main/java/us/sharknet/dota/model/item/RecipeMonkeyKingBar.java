package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeMonkeyKingBar extends Item {

    private static RecipeMonkeyKingBar instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeMonkeyKingBar() {
        iD = 134;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{DemonEdge.instance(),Javelin.instance(),Javelin.instance()};
        itemResult = MonkeyKingBar.instance();
        key = "item_recipe_monkey_king_bar";
        localizedName = "Monkey King Bar Recipe";
    }

    public static RecipeMonkeyKingBar instance() {
        if( instance == null ){
            instance = new RecipeMonkeyKingBar();
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
        if (!(object instanceof RecipeMonkeyKingBar))
            return false;
        if (object == this)
            return true;
        RecipeMonkeyKingBar otherObject = (RecipeMonkeyKingBar) object;
        return otherObject.getKey().equals(getKey());
    }

}
