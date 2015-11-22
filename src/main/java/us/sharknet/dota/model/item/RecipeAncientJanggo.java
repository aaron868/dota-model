package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeAncientJanggo extends Item {

    private static RecipeAncientJanggo instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeAncientJanggo() {
        iD = 184;
        itemCost = 875;
        itemRecipe = 1;
        itemRequirements = new Item[]{Robe.instance(),Bracer.instance(),AncientJanggo.instance()};
        itemResult = AncientJanggo.instance();
        key = "item_recipe_ancient_janggo";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Drum Of Endurance Recipe";
    }

    public static RecipeAncientJanggo instance() {
        if( instance == null ){
            instance = new RecipeAncientJanggo();
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
        if (!(object instanceof RecipeAncientJanggo))
            return false;
        if (object == this)
            return true;
        RecipeAncientJanggo otherObject = (RecipeAncientJanggo) object;
        return otherObject.getKey().equals(getKey());
    }

}
