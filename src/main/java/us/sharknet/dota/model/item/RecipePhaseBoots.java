package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class RecipePhaseBoots extends Item {

    private static RecipePhaseBoots instance;

    private final int iD;
    private final int itemCost;
    private final int itemRecipe;
    private final Item[] itemRequirements;
    private final Item itemResult;
    private final String key;
    private final String model;
    private final String localizedName;

    private RecipePhaseBoots() {
        iD = 49;
        itemCost = 0;
        itemRecipe = 1;
        itemRequirements = new Item[]{Boots.instance(),BladesOfAttack.instance(),BladesOfAttack.instance()};
        itemResult = PhaseBoots.instance();
        key = "item_recipe_phase_boots";
        model = "models/props_gameplay/recipe.vmdl";
        localizedName = "Phase Boots Recipe";
    }

    public static RecipePhaseBoots instance() {
        if( instance == null ){
            instance = new RecipePhaseBoots();
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
        if (!(object instanceof RecipePhaseBoots))
            return false;
        if (object == this)
            return true;
        RecipePhaseBoots otherObject = (RecipePhaseBoots) object;
        return otherObject.getKey().equals(getKey());
    }

}
