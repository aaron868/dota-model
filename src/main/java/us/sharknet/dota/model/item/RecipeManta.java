package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeManta extends Item {

    private static RecipeManta instance;

    private final int fightRecapLevel;
    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipeManta() {
        fightRecapLevel = 1;
        iD = 146;
        itemCost = 800;
        itemRecipe = 1;
        itemRequirements = new Item[]{Yasha.instance(),UltimateOrb.instance()};
        itemResult = Manta.instance();
        key = "item_recipe_manta";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Manta Style Recipe";
    }

    public static RecipeManta instance() {
        if( instance == null ){
            instance = new RecipeManta();
        }
        return instance;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
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
        if (!(object instanceof RecipeManta))
            return false;
        if (object == this)
            return true;
        RecipeManta otherObject = (RecipeManta) object;
        return otherObject.getKey().equals(getKey());
    }

}
