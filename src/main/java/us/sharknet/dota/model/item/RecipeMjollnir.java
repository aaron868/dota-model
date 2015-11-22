package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeMjollnir extends Item {

    private static RecipeMjollnir instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeMjollnir() {
        iD = 157;
        itemCost = 9;
        itemRecipe = 1;
        itemRequirements = new Item[]{Maelstrom.instance(),Hyperstone.instance()};
        itemResult = Mjollnir.instance();
        key = "item_recipe_mjollnir";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Mjollnir Recipe";
    }

    public static RecipeMjollnir instance() {
        if( instance == null ){
            instance = new RecipeMjollnir();
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
        if (!(object instanceof RecipeMjollnir))
            return false;
        if (object == this)
            return true;
        RecipeMjollnir otherObject = (RecipeMjollnir) object;
        return otherObject.getKey().equals(getKey());
    }

}
