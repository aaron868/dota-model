package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeDiffusalBlade2 extends Item {

    private static RecipeDiffusalBlade2 instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeDiffusalBlade2() {
        iD = 195;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{DiffusalBlade.instance(),RecipeDiffusalBlade.instance()};
        itemResult = DiffusalBlade2.instance();
        key = "item_recipe_diffusal_blade_2";
        localizedName = "Diffusal Blade 2 Recipe";
    }

    public static RecipeDiffusalBlade2 instance() {
        if( instance == null ){
            instance = new RecipeDiffusalBlade2();
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
        if (!(object instanceof RecipeDiffusalBlade2))
            return false;
        if (object == this)
            return true;
        RecipeDiffusalBlade2 otherObject = (RecipeDiffusalBlade2) object;
        return otherObject.getKey().equals(getKey());
    }

}
