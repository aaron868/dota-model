package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeGlimmerCape extends Item {

    private static RecipeGlimmerCape instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeGlimmerCape() {
        iD = 253;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{ShadowAmulet.instance(),Cloak.instance()};
        itemResult = GlimmerCape.instance();
        key = "item_recipe_glimmer_cape";
        localizedName = "Glimmer Cape Recipe";
    }

    public static RecipeGlimmerCape instance() {
        if( instance == null ){
            instance = new RecipeGlimmerCape();
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
        if (!(object instanceof RecipeGlimmerCape))
            return false;
        if (object == this)
            return true;
        RecipeGlimmerCape otherObject = (RecipeGlimmerCape) object;
        return otherObject.getKey().equals(getKey());
    }

}
