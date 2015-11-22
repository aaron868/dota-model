package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeSoulRing extends Item {

    private static RecipeSoulRing instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeSoulRing() {
        iD = 177;
        itemCost = 125;
        itemRecipe = 1;
        itemRequirements = new Item[]{RingOfRegen.instance(),SobiMask.instance()};
        itemResult = SoulRing.instance();
        key = "item_recipe_soul_ring";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Soul Ring Recipe";
    }

    public static RecipeSoulRing instance() {
        if( instance == null ){
            instance = new RecipeSoulRing();
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
        if (!(object instanceof RecipeSoulRing))
            return false;
        if (object == this)
            return true;
        RecipeSoulRing otherObject = (RecipeSoulRing) object;
        return otherObject.getKey().equals(getKey());
    }

}
