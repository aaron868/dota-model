package us.sharknet.dota.model;

public abstract class Ability {



    public Ability(){
    }

    public abstract String getLocalizedName();
    public abstract String getKey();


    @Override
    public int hashCode() {
        return getKey().hashCode();
    }

    @Override
    public String toString() {
        return getLocalizedName();
    }

}
