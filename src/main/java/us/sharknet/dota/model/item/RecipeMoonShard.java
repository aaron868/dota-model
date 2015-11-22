package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeMoonShard extends Item {

    private static RecipeMoonShard instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeMoonShard() {
        iD = 246;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{Hyperstone.instance(),Hyperstone.instance()};
        itemResult = MoonShard.instance();
        key = "item_recipe_moon_shard";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Moon Shard Recipe";
    }

    public static RecipeMoonShard instance() {
        if( instance == null ){
            instance = new RecipeMoonShard();
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
        if (!(object instanceof RecipeMoonShard))
            return false;
        if (object == this)
            return true;
        RecipeMoonShard otherObject = (RecipeMoonShard) object;
        return otherObject.getKey().equals(getKey());
    }

}
