package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeInvisSword extends Item {

    private static RecipeInvisSword instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeInvisSword() {
        iD = 183;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{ShadowAmulet.instance(),Claymore.instance()};
        itemResult = InvisSword.instance();
        key = "item_recipe_invis_sword";
        localizedName = "Shadow Blade Recipe";
    }

    public static RecipeInvisSword instance() {
        if( instance == null ){
            instance = new RecipeInvisSword();
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
        if (!(object instanceof RecipeInvisSword))
            return false;
        if (object == this)
            return true;
        RecipeInvisSword otherObject = (RecipeInvisSword) object;
        return otherObject.getKey().equals(getKey());
    }

}
