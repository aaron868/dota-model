package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeHeavensHalberd extends Item {

    private static RecipeHeavensHalberd instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeHeavensHalberd() {
        iD = 209;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{Sange.instance(),TalismanOfEvasion.instance()};
        itemResult = HeavensHalberd.instance();
        key = "item_recipe_heavens_halberd";
        localizedName = "Heaven's Halberd Recipe";
    }

    public static RecipeHeavensHalberd instance() {
        if( instance == null ){
            instance = new RecipeHeavensHalberd();
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
        if (!(object instanceof RecipeHeavensHalberd))
            return false;
        if (object == this)
            return true;
        RecipeHeavensHalberd otherObject = (RecipeHeavensHalberd) object;
        return otherObject.getKey().equals(getKey());
    }

}
