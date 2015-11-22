package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeAbyssalBlade extends Item {

    private static RecipeAbyssalBlade instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeAbyssalBlade() {
        iD = 27;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{Basher.instance(),Relic.instance()};
        itemResult = AbyssalBlade.instance();
        key = "item_recipe_abyssal_blade";
        localizedName = "Abyssal Blade Recipe";
    }

    public static RecipeAbyssalBlade instance() {
        if( instance == null ){
            instance = new RecipeAbyssalBlade();
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
        if (!(object instanceof RecipeAbyssalBlade))
            return false;
        if (object == this)
            return true;
        RecipeAbyssalBlade otherObject = (RecipeAbyssalBlade) object;
        return otherObject.getKey().equals(getKey());
    }

}
