package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeCyclone extends Item {

    private static RecipeCyclone instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeCyclone() {
        iD = 99;
        itemCost = 650;
        itemRecipe = 1;
        itemRequirements = new Item[]{SobiMask.instance(),StaffOfWizardry.instance(),VoidStone.instance()};
        itemResult = Cyclone.instance();
        key = "item_recipe_cyclone";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Eul's Scepter Of Divinity Recipe";
    }

    public static RecipeCyclone instance() {
        if( instance == null ){
            instance = new RecipeCyclone();
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
        if (!(object instanceof RecipeCyclone))
            return false;
        if (object == this)
            return true;
        RecipeCyclone otherObject = (RecipeCyclone) object;
        return otherObject.getKey().equals(getKey());
    }

}
