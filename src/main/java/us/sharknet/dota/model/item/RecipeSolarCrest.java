package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeSolarCrest extends Item {

    private static RecipeSolarCrest instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeSolarCrest() {
        iD = 227;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{MedallionOfCourage.instance(),TalismanOfEvasion.instance()};
        itemResult = SolarCrest.instance();
        key = "item_recipe_solar_crest";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Solar Crest Recipe";
    }

    public static RecipeSolarCrest instance() {
        if( instance == null ){
            instance = new RecipeSolarCrest();
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
        if (!(object instanceof RecipeSolarCrest))
            return false;
        if (object == this)
            return true;
        RecipeSolarCrest otherObject = (RecipeSolarCrest) object;
        return otherObject.getKey().equals(getKey());
    }

}
