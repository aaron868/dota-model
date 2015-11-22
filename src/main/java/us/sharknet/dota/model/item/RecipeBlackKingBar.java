package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeBlackKingBar extends Item {

    private static RecipeBlackKingBar instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeBlackKingBar() {
        iD = 115;
        itemCost = 1375;
        itemRecipe = 1;
        itemRequirements = new Item[]{OgreAxe.instance(),MithrilHammer.instance()};
        itemResult = BlackKingBar.instance();
        key = "item_recipe_black_king_bar";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Black King Bar Recipe";
    }

    public static RecipeBlackKingBar instance() {
        if( instance == null ){
            instance = new RecipeBlackKingBar();
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
        if (!(object instanceof RecipeBlackKingBar))
            return false;
        if (object == this)
            return true;
        RecipeBlackKingBar otherObject = (RecipeBlackKingBar) object;
        return otherObject.getKey().equals(getKey());
    }

}
