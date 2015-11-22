package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeBuckler extends Item {

    private static RecipeBuckler instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeBuckler() {
        iD = 85;
        itemCost = 2;
        itemRecipe = 1;
        itemRequirements = new Item[]{Chainmail.instance(),Branches.instance()};
        itemResult = Buckler.instance();
        key = "item_recipe_buckler";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Buckler Recipe";
    }

    public static RecipeBuckler instance() {
        if( instance == null ){
            instance = new RecipeBuckler();
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
        if (!(object instanceof RecipeBuckler))
            return false;
        if (object == this)
            return true;
        RecipeBuckler otherObject = (RecipeBuckler) object;
        return otherObject.getKey().equals(getKey());
    }

}
