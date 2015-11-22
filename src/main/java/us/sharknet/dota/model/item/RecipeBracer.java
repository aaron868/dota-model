package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeBracer extends Item {

    private static RecipeBracer instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeBracer() {
        iD = 72;
        itemCost = 210;
        itemRecipe = 1;
        itemRequirements = new Item[]{Circlet.instance(),Gauntlets.instance()};
        itemResult = Bracer.instance();
        key = "item_recipe_bracer";
        localizedName = "Bracer Recipe";
    }

    public static RecipeBracer instance() {
        if( instance == null ){
            instance = new RecipeBracer();
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
        if (!(object instanceof RecipeBracer))
            return false;
        if (object == this)
            return true;
        RecipeBracer otherObject = (RecipeBracer) object;
        return otherObject.getKey().equals(getKey());
    }

}
