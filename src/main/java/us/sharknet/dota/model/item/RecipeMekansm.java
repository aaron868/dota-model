package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeMekansm extends Item {

    private static RecipeMekansm instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeMekansm() {
        iD = 78;
        itemCost = 9;
        itemRecipe = 1;
        itemRequirements = new Item[]{Headdress.instance(),Buckler.instance()};
        itemResult = Mekansm.instance();
        key = "item_recipe_mekansm";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Mekansm Recipe";
    }

    public static RecipeMekansm instance() {
        if( instance == null ){
            instance = new RecipeMekansm();
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
        if (!(object instanceof RecipeMekansm))
            return false;
        if (object == this)
            return true;
        RecipeMekansm otherObject = (RecipeMekansm) object;
        return otherObject.getKey().equals(getKey());
    }

}
