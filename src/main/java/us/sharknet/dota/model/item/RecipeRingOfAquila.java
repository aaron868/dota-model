package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeRingOfAquila extends Item {

    private static RecipeRingOfAquila instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String localizedName;

    private RecipeRingOfAquila() {
        iD = 211;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{WraithBand.instance(),RingOfBasilius.instance()};
        itemResult = RingOfAquila.instance();
        key = "item_recipe_ring_of_aquila";
        localizedName = "Ring Of Aquila Recipe";
    }

    public static RecipeRingOfAquila instance() {
        if( instance == null ){
            instance = new RecipeRingOfAquila();
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
        if (!(object instanceof RecipeRingOfAquila))
            return false;
        if (object == this)
            return true;
        RecipeRingOfAquila otherObject = (RecipeRingOfAquila) object;
        return otherObject.getKey().equals(getKey());
    }

}
