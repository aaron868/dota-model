package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeGuardianGreaves extends Item {

    private static RecipeGuardianGreaves instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeGuardianGreaves() {
        iD = 230;
        itemCost = 1650;
        itemRecipe = 1;
        itemRequirements = new Item[]{Mekansm.instance(),ArcaneBoots.instance()};
        itemResult = GuardianGreaves.instance();
        key = "item_recipe_guardian_greaves";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Guardian Greaves Recipe";
    }

    public static RecipeGuardianGreaves instance() {
        if( instance == null ){
            instance = new RecipeGuardianGreaves();
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
        if (!(object instanceof RecipeGuardianGreaves))
            return false;
        if (object == this)
            return true;
        RecipeGuardianGreaves otherObject = (RecipeGuardianGreaves) object;
        return otherObject.getKey().equals(getKey());
    }

}
