package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipePowerTreads extends Item {

    private static RecipePowerTreads instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipePowerTreads() {
        iD = 62;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{Boots.instance(),Gloves.instance(),BeltOfStrength.instance(),Boots.instance(),Gloves.instance(),Robe.instance(),Boots.instance(),Gloves.instance(),BootsOfElves.instance()};
        itemResult = PowerTreads.instance();
        key = "item_recipe_power_treads";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Power Treads Recipe";
    }

    public static RecipePowerTreads instance() {
        if( instance == null ){
            instance = new RecipePowerTreads();
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
        if (!(object instanceof RecipePowerTreads))
            return false;
        if (object == this)
            return true;
        RecipePowerTreads otherObject = (RecipePowerTreads) object;
        return otherObject.getKey().equals(getKey());
    }

}
