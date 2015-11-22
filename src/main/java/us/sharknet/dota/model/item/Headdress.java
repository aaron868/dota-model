package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Headdress extends Item {

    private static Headdress instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int aura_health_regen;
    private final int aura_radius;
    private final int bonus_all_stats;
    private final String localizedName;

    private Headdress() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 94;
        itemAliases = "headdress";
        itemCost = 600;
        itemQuality = "rare";
        itemShopTags = new String[]{"str","int","agi","regen_health"};
        key = "item_headdress";
        aura_health_regen = 3;
        aura_radius = 900;
        bonus_all_stats = 2;
        localizedName = "Headdress";
    }

    public static Headdress instance() {
        if( instance == null ){
            instance = new Headdress();
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

    public int getAuraHealthRegen() {
        return aura_health_regen;
    }

    public int getAuraRadius() {
        return aura_radius;
    }

    public int getBonusAllStats() {
        return bonus_all_stats;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Headdress))
            return false;
        if (object == this)
            return true;
        Headdress otherObject = (Headdress) object;
        return otherObject.getKey().equals(getKey());
    }

}
