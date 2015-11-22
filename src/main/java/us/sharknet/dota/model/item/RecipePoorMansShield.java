package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipePoorMansShield extends Item {

    private static RecipePoorMansShield instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipePoorMansShield() {
        iD = 7;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{Slippers.instance(),Slippers.instance(),StoutShield.instance()};
        itemResult = PoorMansShield.instance();
        key = "item_recipe_poor_mans_shield";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Poor Man's Shield Recipe";
    }

    public static RecipePoorMansShield instance() {
        if( instance == null ){
            instance = new RecipePoorMansShield();
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
        if (!(object instanceof RecipePoorMansShield))
            return false;
        if (object == this)
            return true;
        RecipePoorMansShield otherObject = (RecipePoorMansShield) object;
        return otherObject.getKey().equals(getKey());
    }

}
