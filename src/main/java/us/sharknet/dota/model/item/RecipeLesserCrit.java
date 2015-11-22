package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeLesserCrit extends Item {

    private static RecipeLesserCrit instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeLesserCrit() {
        iD = 148;
        itemCost = 5;
        itemRecipe = 1;
        itemRequirements = new Item[]{Broadsword.instance(),BladesOfAttack.instance()};
        itemResult = LesserCrit.instance();
        key = "item_recipe_lesser_crit";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Crystalys Recipe";
    }

    public static RecipeLesserCrit instance() {
        if( instance == null ){
            instance = new RecipeLesserCrit();
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
        if (!(object instanceof RecipeLesserCrit))
            return false;
        if (object == this)
            return true;
        RecipeLesserCrit otherObject = (RecipeLesserCrit) object;
        return otherObject.getKey().equals(getKey());
    }

}
