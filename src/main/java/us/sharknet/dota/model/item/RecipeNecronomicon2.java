package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeNecronomicon2 extends Item {

    private static RecipeNecronomicon2 instance;

    private final int iD;
    private final int itemBaseLevel;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeNecronomicon2() {
        iD = 191;
        itemBaseLevel = 2;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{Necronomicon.instance(),RecipeNecronomicon.instance()};
        itemResult = Necronomicon2.instance();
        key = "item_recipe_necronomicon_2";
        localizedName = "Necronomicon 2 Recipe";
    }

    public static RecipeNecronomicon2 instance() {
        if( instance == null ){
            instance = new RecipeNecronomicon2();
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
        if (!(object instanceof RecipeNecronomicon2))
            return false;
        if (object == this)
            return true;
        RecipeNecronomicon2 otherObject = (RecipeNecronomicon2) object;
        return otherObject.getKey().equals(getKey());
    }

}
