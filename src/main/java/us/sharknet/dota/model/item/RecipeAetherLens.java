package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeAetherLens extends Item {

    private static RecipeAetherLens instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeAetherLens() {
        iD = 233;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{EnergyBooster.instance(),RingOfHealth.instance(),Cloak.instance()};
        itemResult = AetherLens.instance();
        key = "item_recipe_aether_lens";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = " Aether Lens Recipe";
    }

    public static RecipeAetherLens instance() {
        if( instance == null ){
            instance = new RecipeAetherLens();
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
        if (!(object instanceof RecipeAetherLens))
            return false;
        if (object == this)
            return true;
        RecipeAetherLens otherObject = (RecipeAetherLens) object;
        return otherObject.getKey().equals(getKey());
    }

}
