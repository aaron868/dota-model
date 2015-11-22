package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeBladeMail extends Item {

    private static RecipeBladeMail instance;

    private final int fightRecapLevel;
    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeBladeMail() {
        fightRecapLevel = 1;
        iD = 126;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{Broadsword.instance(),Chainmail.instance(),Robe.instance()};
        itemResult = BladeMail.instance();
        key = "item_recipe_blade_mail";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Blade Mail Recipe";
    }

    public static RecipeBladeMail instance() {
        if( instance == null ){
            instance = new RecipeBladeMail();
        }
        return instance;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
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
        if (!(object instanceof RecipeBladeMail))
            return false;
        if (object == this)
            return true;
        RecipeBladeMail otherObject = (RecipeBladeMail) object;
        return otherObject.getKey().equals(getKey());
    }

}
