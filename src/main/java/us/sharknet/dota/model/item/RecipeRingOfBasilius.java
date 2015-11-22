package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipeRingOfBasilius extends Item {

    private static RecipeRingOfBasilius instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String uIDropSound;
    private final String uIPickupSound;
    private final String worldDropSound;
    private final String localizedName;

    private RecipeRingOfBasilius() {
        iD = 87;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{SobiMask.instance(),RingOfProtection.instance()};
        itemResult = RingOfBasilius.instance();
        key = "item_recipe_ring_of_basilius";
        uIDropSound = "Item.DropRingShop";
        uIPickupSound = "Item.PickUpRingShop";
        worldDropSound = "Item.DropRingWorld";
        localizedName = "Ring Of Basilius Recipe";
    }

    public static RecipeRingOfBasilius instance() {
        if( instance == null ){
            instance = new RecipeRingOfBasilius();
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

    public String getUIDropSound() {
        return uIDropSound;
    }

    public String getUIPickupSound() {
        return uIPickupSound;
    }

    public String getWorldDropSound() {
        return worldDropSound;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RecipeRingOfBasilius))
            return false;
        if (object == this)
            return true;
        RecipeRingOfBasilius otherObject = (RecipeRingOfBasilius) object;
        return otherObject.getKey().equals(getKey());
    }

}
