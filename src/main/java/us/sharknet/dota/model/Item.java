package us.sharknet.dota.model;

public abstract class Item {


    private final int itemCost;

    public Item(){
        itemCost = 0;
    }

    public abstract String getLocalizedName();
    public abstract String getKey();

    public int getItemCost() {
        return itemCost;
    }


    @Override
    public int hashCode() {
        return getKey().hashCode();
    }

    @Override
    public String toString() {
        return getLocalizedName();
    }

}
