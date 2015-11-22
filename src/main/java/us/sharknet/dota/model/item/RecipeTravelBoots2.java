package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeTravelBoots2 extends Item {

    private static RecipeTravelBoots2 instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeTravelBoots2() {
        iD = 219;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{TravelBoots.instance(),RecipeTravelBoots.instance()};
        itemResult = TravelBoots2.instance();
        key = "item_recipe_travel_boots_2";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Boots of Travel 2 Recipe";
    }

    public static RecipeTravelBoots2 instance() {
        if( instance == null ){
            instance = new RecipeTravelBoots2();
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
        if (!(object instanceof RecipeTravelBoots2))
            return false;
        if (object == this)
            return true;
        RecipeTravelBoots2 otherObject = (RecipeTravelBoots2) object;
        return otherObject.getKey().equals(getKey());
    }

}
