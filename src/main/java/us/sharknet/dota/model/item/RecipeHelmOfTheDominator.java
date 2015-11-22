package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeHelmOfTheDominator extends Item {

    private static RecipeHelmOfTheDominator instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeHelmOfTheDominator() {
        iD = 163;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{Lifesteal.instance(),HelmOfIronWill.instance()};
        itemResult = HelmOfTheDominator.instance();
        key = "item_recipe_helm_of_the_dominator";
        localizedName = "Helm Of The Dominator Recipe";
    }

    public static RecipeHelmOfTheDominator instance() {
        if( instance == null ){
            instance = new RecipeHelmOfTheDominator();
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
        if (!(object instanceof RecipeHelmOfTheDominator))
            return false;
        if (object == this)
            return true;
        RecipeHelmOfTheDominator otherObject = (RecipeHelmOfTheDominator) object;
        return otherObject.getKey().equals(getKey());
    }

}
