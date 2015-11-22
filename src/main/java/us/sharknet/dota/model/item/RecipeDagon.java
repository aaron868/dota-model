package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeDagon extends Item {

    private static RecipeDagon instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeDagon() {
        iD = 13;
        itemCost = 125;
        itemRecipe = 1;
        itemRequirements = new Item[]{StaffOfWizardry.instance(),NullTalisman.instance()};
        itemResult = Dagon.instance();
        key = "item_recipe_dagon";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Dagon 1 Recipe";
    }

    public static RecipeDagon instance() {
        if( instance == null ){
            instance = new RecipeDagon();
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
        if (!(object instanceof RecipeDagon))
            return false;
        if (object == this)
            return true;
        RecipeDagon otherObject = (RecipeDagon) object;
        return otherObject.getKey().equals(getKey());
    }

}
