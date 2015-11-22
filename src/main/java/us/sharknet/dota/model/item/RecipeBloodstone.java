package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeBloodstone extends Item {

    private static RecipeBloodstone instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeBloodstone() {
        iD = 120;
        itemCost = 900;
        itemRecipe = 1;
        itemRequirements = new Item[]{SoulRing.instance(),SoulBooster.instance()};
        itemResult = Bloodstone.instance();
        key = "item_recipe_bloodstone";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Bloodstone Recipe";
    }

    public static RecipeBloodstone instance() {
        if( instance == null ){
            instance = new RecipeBloodstone();
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
        if (!(object instanceof RecipeBloodstone))
            return false;
        if (object == this)
            return true;
        RecipeBloodstone otherObject = (RecipeBloodstone) object;
        return otherObject.getKey().equals(getKey());
    }

}
