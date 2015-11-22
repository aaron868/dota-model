package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeVeilOfDiscord extends Item {

    private static RecipeVeilOfDiscord instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeVeilOfDiscord() {
        iD = 189;
        itemCost = 9;
        itemRecipe = 1;
        itemRequirements = new Item[]{HelmOfIronWill.instance(),NullTalisman.instance()};
        itemResult = VeilOfDiscord.instance();
        key = "item_recipe_veil_of_discord";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Veil Of Discord Recipe";
    }

    public static RecipeVeilOfDiscord instance() {
        if( instance == null ){
            instance = new RecipeVeilOfDiscord();
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
        if (!(object instanceof RecipeVeilOfDiscord))
            return false;
        if (object == this)
            return true;
        RecipeVeilOfDiscord otherObject = (RecipeVeilOfDiscord) object;
        return otherObject.getKey().equals(getKey());
    }

}
