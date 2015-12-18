package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Boots extends Item {

    private static Boots instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final String model;
    private final int sideShop;
    private final int bonus_movement_speed;
    private final String localizedName;

    private Boots() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 29;
        itemAliases = "boots of speed";
        itemCost = 400;
        itemQuality = "component";
        itemShopTags = "move_speed";
        key = "item_boots";
        model = "models/props_gameplay/boots_of_speed.vmdl";
        sideShop = 1;
        bonus_movement_speed = 45;
        localizedName = "Boots Of Speed";
    }

    public static Boots instance() {
        if( instance == null ){
            instance = new Boots();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getID() {
        return iD;
    }

    public String getItemAliases() {
        return itemAliases;
    }

    public int getItemCost() {
        return itemCost;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public String getItemShopTags() {
        return itemShopTags;
    }

    public String getKey() {
        return key;
    }

    public String getModel() {
        return model;
    }

    public int getSideShop() {
        return sideShop;
    }

    public int getBonusMovementSpeed() {
        return bonus_movement_speed;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Boots))
            return false;
        if (object == this)
            return true;
        Boots otherObject = (Boots) object;
        return otherObject.getKey().equals(getKey());
    }

}
