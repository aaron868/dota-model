package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeSheepstick extends Item {

    private static RecipeSheepstick instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeSheepstick() {
        iD = 95;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{MysticStaff.instance(),UltimateOrb.instance(),VoidStone.instance()};
        itemResult = Sheepstick.instance();
        key = "item_recipe_sheepstick";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Scythe Of Vyse Recipe";
    }

    public static RecipeSheepstick instance() {
        if( instance == null ){
            instance = new RecipeSheepstick();
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
        if (!(object instanceof RecipeSheepstick))
            return false;
        if (object == this)
            return true;
        RecipeSheepstick otherObject = (RecipeSheepstick) object;
        return otherObject.getKey().equals(getKey());
    }

}
