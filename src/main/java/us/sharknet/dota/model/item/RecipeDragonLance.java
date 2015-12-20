package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeDragonLance extends Item {

    private static RecipeDragonLance instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeDragonLance() {
        iD = 234;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{Quarterstaff.instance(),OgreAxe.instance()};
        itemResult = DragonLance.instance();
        key = "item_recipe_dragon_lance";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Dragon Lance Recipe";
    }

    public static RecipeDragonLance instance() {
        if( instance == null ){
            instance = new RecipeDragonLance();
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
        if (!(object instanceof RecipeDragonLance))
            return false;
        if (object == this)
            return true;
        RecipeDragonLance otherObject = (RecipeDragonLance) object;
        return otherObject.getKey().equals(getKey());
    }

}
