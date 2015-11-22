package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeWardDispenser extends Item {

    private static RecipeWardDispenser instance;

    private final int iD;
    private final int itemCost;
    private final int itemPurchasable;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeWardDispenser() {
        iD = 217;
        itemCost = 0;
        itemPurchasable = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{WardSentry.instance(),WardObserver.instance(),WardSentry.instance(),WardDispenser.instance(),WardDispenser.instance(),WardObserver.instance(),WardDispenser.instance(),WardDispenser.instance()};
        itemResult = WardDispenser.instance();
        key = "item_recipe_ward_dispenser";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Ward Slot Recipe";
    }

    public static RecipeWardDispenser instance() {
        if( instance == null ){
            instance = new RecipeWardDispenser();
        }
        return instance;
    }

    public int getID() {
        return iD;
    }

    public int getItemCost() {
        return itemCost;
    }

    public int getItemPurchasable() {
        return itemPurchasable;
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
        if (!(object instanceof RecipeWardDispenser))
            return false;
        if (object == this)
            return true;
        RecipeWardDispenser otherObject = (RecipeWardDispenser) object;
        return otherObject.getKey().equals(getKey());
    }

}
