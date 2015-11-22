package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Branches extends Item {

    private static Branches instance;

    private final String abilityBehavior;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final String model;
    private final int bonus_all_stats;
    private final String localizedName;

    private Branches() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 16;
        itemAliases = new String[]{"gg branch","iron branch"};
        itemCost = 5;
        itemQuality = "component";
        itemShopTags = new String[]{"agi","int","str"};
        key = "item_branches";
        model = "models/props_gameplay/branch.vmdl";
        bonus_all_stats = 1;
        localizedName = "Iron Branch";
    }

    public static Branches instance() {
        if( instance == null ){
            instance = new Branches();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getID() {
        return iD;
    }

    public String[] getItemAliases() {
        return itemAliases;
    }

    public int getItemCost() {
        return itemCost;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public String[] getItemShopTags() {
        return itemShopTags;
    }

    public String getKey() {
        return key;
    }

    public String getModel() {
        return model;
    }

    public int getBonusAllStats() {
        return bonus_all_stats;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Branches))
            return false;
        if (object == this)
            return true;
        Branches otherObject = (Branches) object;
        return otherObject.getKey().equals(getKey());
    }

}
