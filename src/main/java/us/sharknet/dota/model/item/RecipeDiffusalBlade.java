package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeDiffusalBlade extends Item {

    private static RecipeDiffusalBlade instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeDiffusalBlade() {
        iD = 173;
        itemCost = 7;
        itemRecipe = 1;
        itemRequirements = new Item[]{BladeOfAlacrity.instance(),BladeOfAlacrity.instance(),Robe.instance()};
        itemResult = DiffusalBlade.instance();
        key = "item_recipe_diffusal_blade";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Diffusal Blade 1 Recipe";
    }

    public static RecipeDiffusalBlade instance() {
        if( instance == null ){
            instance = new RecipeDiffusalBlade();
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
        if (!(object instanceof RecipeDiffusalBlade))
            return false;
        if (object == this)
            return true;
        RecipeDiffusalBlade otherObject = (RecipeDiffusalBlade) object;
        return otherObject.getKey().equals(getKey());
    }

}
