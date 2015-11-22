package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeOctarineCore extends Item {

    private static RecipeOctarineCore instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeOctarineCore() {
        iD = 228;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{MysticStaff.instance(),SoulBooster.instance()};
        itemResult = OctarineCore.instance();
        key = "item_recipe_octarine_core";
        localizedName = "Octarine Core Recipe";
    }

    public static RecipeOctarineCore instance() {
        if( instance == null ){
            instance = new RecipeOctarineCore();
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
        if (!(object instanceof RecipeOctarineCore))
            return false;
        if (object == this)
            return true;
        RecipeOctarineCore otherObject = (RecipeOctarineCore) object;
        return otherObject.getKey().equals(getKey());
    }

}
