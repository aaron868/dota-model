package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeMagicWand extends Item {

    private static RecipeMagicWand instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeMagicWand() {
        iD = 35;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{Circlet.instance(),Branches.instance(),Branches.instance(),MagicStick.instance()};
        itemResult = MagicWand.instance();
        key = "item_recipe_magic_wand";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Magic Wand Recipe";
    }

    public static RecipeMagicWand instance() {
        if( instance == null ){
            instance = new RecipeMagicWand();
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
        if (!(object instanceof RecipeMagicWand))
            return false;
        if (object == this)
            return true;
        RecipeMagicWand otherObject = (RecipeMagicWand) object;
        return otherObject.getKey().equals(getKey());
    }

}
