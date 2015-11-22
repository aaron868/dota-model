package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeHoodOfDefiance extends Item {

    private static RecipeHoodOfDefiance instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeHoodOfDefiance() {
        iD = 13;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{RingOfHealth.instance(),Cloak.instance(),RingOfRegen.instance(),RingOfRegen.instance()};
        itemResult = HoodOfDefiance.instance();
        key = "item_recipe_hood_of_defiance";
        localizedName = "Hood Of Defiance Recipe";
    }

    public static RecipeHoodOfDefiance instance() {
        if( instance == null ){
            instance = new RecipeHoodOfDefiance();
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
        if (!(object instanceof RecipeHoodOfDefiance))
            return false;
        if (object == this)
            return true;
        RecipeHoodOfDefiance otherObject = (RecipeHoodOfDefiance) object;
        return otherObject.getKey().equals(getKey());
    }

}
