package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeRapier extends Item {

    private static RecipeRapier instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeRapier() {
        iD = 132;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{Relic.instance(),DemonEdge.instance()};
        itemResult = Rapier.instance();
        key = "item_recipe_rapier";
        localizedName = "Divine Rapier Recipe";
    }

    public static RecipeRapier instance() {
        if( instance == null ){
            instance = new RecipeRapier();
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
        if (!(object instanceof RecipeRapier))
            return false;
        if (object == this)
            return true;
        RecipeRapier otherObject = (RecipeRapier) object;
        return otherObject.getKey().equals(getKey());
    }

}
