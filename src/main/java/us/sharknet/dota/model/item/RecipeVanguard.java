package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeVanguard extends Item {

    private static RecipeVanguard instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeVanguard() {
        iD = 124;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{RingOfHealth.instance(),VitalityBooster.instance(),StoutShield.instance()};
        itemResult = Vanguard.instance();
        key = "item_recipe_vanguard";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Vanguard Recipe";
    }

    public static RecipeVanguard instance() {
        if( instance == null ){
            instance = new RecipeVanguard();
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

    public String getModel() {
        return model;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RecipeVanguard))
            return false;
        if (object == this)
            return true;
        RecipeVanguard otherObject = (RecipeVanguard) object;
        return otherObject.getKey().equals(getKey());
    }

}