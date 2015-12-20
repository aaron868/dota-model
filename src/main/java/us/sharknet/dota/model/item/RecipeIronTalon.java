package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeIronTalon extends Item {

    private static RecipeIronTalon instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeIronTalon() {
        iD = 238;
        itemCost = 125;
        itemRecipe = 1;
        itemRequirements = new Item[]{QuellingBlade.instance(),RingOfProtection.instance()};
        itemResult = IronTalon.instance();
        key = "item_recipe_iron_talon";
        model = "models/props_gameplay/recipe.mdl";
        localizedName = "Iron Talon Recipe";
    }

    public static RecipeIronTalon instance() {
        if( instance == null ){
            instance = new RecipeIronTalon();
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
        if (!(object instanceof RecipeIronTalon))
            return false;
        if (object == this)
            return true;
        RecipeIronTalon otherObject = (RecipeIronTalon) object;
        return otherObject.getKey().equals(getKey());
    }

}
