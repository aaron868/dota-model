package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeArcaneBoots extends Item {

    private static RecipeArcaneBoots instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeArcaneBoots() {
        iD = 179;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{Boots.instance(),EnergyBooster.instance()};
        itemResult = ArcaneBoots.instance();
        key = "item_recipe_arcane_boots";
        localizedName = "Arcane Boots Recipe";
    }

    public static RecipeArcaneBoots instance() {
        if( instance == null ){
            instance = new RecipeArcaneBoots();
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
        if (!(object instanceof RecipeArcaneBoots))
            return false;
        if (object == this)
            return true;
        RecipeArcaneBoots otherObject = (RecipeArcaneBoots) object;
        return otherObject.getKey().equals(getKey());
    }

}
