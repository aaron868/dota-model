package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeForceStaff extends Item {

    private static RecipeForceStaff instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeForceStaff() {
        iD = 101;
        itemCost = 900;
        itemRecipe = 1;
        itemRequirements = new Item[]{StaffOfWizardry.instance(),RingOfRegen.instance()};
        itemResult = ForceStaff.instance();
        key = "item_recipe_force_staff";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Force Staff Recipe";
    }

    public static RecipeForceStaff instance() {
        if( instance == null ){
            instance = new RecipeForceStaff();
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
        if (!(object instanceof RecipeForceStaff))
            return false;
        if (object == this)
            return true;
        RecipeForceStaff otherObject = (RecipeForceStaff) object;
        return otherObject.getKey().equals(getKey());
    }

}
