package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeEtherealBlade extends Item {

    private static RecipeEtherealBlade instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeEtherealBlade() {
        iD = 175;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{Eagle.instance(),Ghost.instance()};
        itemResult = EtherealBlade.instance();
        key = "item_recipe_ethereal_blade";
        localizedName = "Ethereal Blade Recipe";
    }

    public static RecipeEtherealBlade instance() {
        if( instance == null ){
            instance = new RecipeEtherealBlade();
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
        if (!(object instanceof RecipeEtherealBlade))
            return false;
        if (object == this)
            return true;
        RecipeEtherealBlade otherObject = (RecipeEtherealBlade) object;
        return otherObject.getKey().equals(getKey());
    }

}