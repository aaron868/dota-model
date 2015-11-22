package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeUltimateScepter extends Item {

    private static RecipeUltimateScepter instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeUltimateScepter() {
        iD = 17;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{PointBooster.instance(),StaffOfWizardry.instance(),OgreAxe.instance(),BladeOfAlacrity.instance()};
        itemResult = UltimateScepter.instance();
        key = "item_recipe_ultimate_scepter";
        localizedName = "Aghanim's Scepter Recipe";
    }

    public static RecipeUltimateScepter instance() {
        if( instance == null ){
            instance = new RecipeUltimateScepter();
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

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RecipeUltimateScepter))
            return false;
        if (object == this)
            return true;
        RecipeUltimateScepter otherObject = (RecipeUltimateScepter) object;
        return otherObject.getKey().equals(getKey());
    }

}
