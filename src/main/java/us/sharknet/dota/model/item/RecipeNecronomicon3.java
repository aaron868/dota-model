package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeNecronomicon3 extends Item {

    private static RecipeNecronomicon3 instance;

    private final int iD;
    private final int itemBaseLevel;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeNecronomicon3() {
        iD = 192;
        itemBaseLevel = 3;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{Necronomicon2.instance(),RecipeNecronomicon.instance()};
        itemResult = Necronomicon3.instance();
        key = "item_recipe_necronomicon_3";
        localizedName = "Necronomicon 3 Recipe";
    }

    public static RecipeNecronomicon3 instance() {
        if( instance == null ){
            instance = new RecipeNecronomicon3();
        }
        return instance;
    }

    public int getID() {
        return iD;
    }

    public int getItemBaseLevel() {
        return itemBaseLevel;
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
        if (!(object instanceof RecipeNecronomicon3))
            return false;
        if (object == this)
            return true;
        RecipeNecronomicon3 otherObject = (RecipeNecronomicon3) object;
        return otherObject.getKey().equals(getKey());
    }

}
