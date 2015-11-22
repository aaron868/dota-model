package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipePers extends Item {

    private static RecipePers instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipePers() {
        iD = 68;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{RingOfHealth.instance(),VoidStone.instance()};
        itemResult = Pers.instance();
        key = "item_recipe_pers";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Perseverance Recipe";
    }

    public static RecipePers instance() {
        if( instance == null ){
            instance = new RecipePers();
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
        if (!(object instanceof RecipePers))
            return false;
        if (object == this)
            return true;
        RecipePers otherObject = (RecipePers) object;
        return otherObject.getKey().equals(getKey());
    }

}
