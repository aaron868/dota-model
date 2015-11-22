package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeRodOfAtos extends Item {

    private static RecipeRodOfAtos instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeRodOfAtos() {
        iD = 205;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{VitalityBooster.instance(),StaffOfWizardry.instance(),StaffOfWizardry.instance()};
        itemResult = RodOfAtos.instance();
        key = "item_recipe_rod_of_atos";
        localizedName = "Rod Of Atos Recipe";
    }

    public static RecipeRodOfAtos instance() {
        if( instance == null ){
            instance = new RecipeRodOfAtos();
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
        if (!(object instanceof RecipeRodOfAtos))
            return false;
        if (object == this)
            return true;
        RecipeRodOfAtos otherObject = (RecipeRodOfAtos) object;
        return otherObject.getKey().equals(getKey());
    }

}
