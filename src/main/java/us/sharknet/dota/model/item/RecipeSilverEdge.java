package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeSilverEdge extends Item {

    private static RecipeSilverEdge instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeSilverEdge() {
        iD = 248;
        itemCost = 600;
        itemRecipe = 1;
        itemRequirements = new Item[]{InvisSword.instance(),Sange.instance()};
        itemResult = SilverEdge.instance();
        key = "item_recipe_silver_edge";
        localizedName = "Silver Edge Recipe";
    }

    public static RecipeSilverEdge instance() {
        if( instance == null ){
            instance = new RecipeSilverEdge();
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
        if (!(object instanceof RecipeSilverEdge))
            return false;
        if (object == this)
            return true;
        RecipeSilverEdge otherObject = (RecipeSilverEdge) object;
        return otherObject.getKey().equals(getKey());
    }

}
