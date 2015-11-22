package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeMedallionOfCourage extends Item {

    private static RecipeMedallionOfCourage instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeMedallionOfCourage() {
        iD = 186;
        itemCost = 325;
        itemRecipe = 1;
        itemRequirements = new Item[]{Chainmail.instance(),SobiMask.instance()};
        itemResult = MedallionOfCourage.instance();
        key = "item_recipe_medallion_of_courage";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Medallion Of Courage Recipe";
    }

    public static RecipeMedallionOfCourage instance() {
        if( instance == null ){
            instance = new RecipeMedallionOfCourage();
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
        if (!(object instanceof RecipeMedallionOfCourage))
            return false;
        if (object == this)
            return true;
        RecipeMedallionOfCourage otherObject = (RecipeMedallionOfCourage) object;
        return otherObject.getKey().equals(getKey());
    }

}
