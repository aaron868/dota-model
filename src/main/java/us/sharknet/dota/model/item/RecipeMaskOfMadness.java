package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeMaskOfMadness extends Item {

    private static RecipeMaskOfMadness instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeMaskOfMadness() {
        iD = 171;
        itemCost = 900;
        itemRecipe = 1;
        itemRequirements = new Item[0];
        itemResult = MaskOfMadness.instance();
        key = "item_recipe_mask_of_madness";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Mask Of Madness Recipe";
    }

    public static RecipeMaskOfMadness instance() {
        if( instance == null ){
            instance = new RecipeMaskOfMadness();
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
        if (!(object instanceof RecipeMaskOfMadness))
            return false;
        if (object == this)
            return true;
        RecipeMaskOfMadness otherObject = (RecipeMaskOfMadness) object;
        return otherObject.getKey().equals(getKey());
    }

}
