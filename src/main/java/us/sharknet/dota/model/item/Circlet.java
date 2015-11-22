package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Circlet extends Item {

    private static Circlet instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_all_stats;
    private final String localizedName;

    private Circlet() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 2;
        itemAliases = "circlet";
        itemCost = 165;
        itemQuality = "component";
        itemShopTags = new String[]{"agi","int","str"};
        key = "item_circlet";
        bonus_all_stats = 2;
        localizedName = "Circlet";
    }

    public static Circlet instance() {
        if( instance == null ){
            instance = new Circlet();
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

    public String[] getItemShopTags() {
        return itemShopTags;
    }

    public String getKey() {
        return key;
    }

    public int getBonusAllStats() {
        return bonus_all_stats;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Circlet))
            return false;
        if (object == this)
            return true;
        Circlet otherObject = (Circlet) object;
        return otherObject.getKey().equals(getKey());
    }

}
