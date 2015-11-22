package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class NullTalisman extends Item {

    private static NullTalisman instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_agility;
    private final int bonus_damage;
    private final int bonus_intellect;
    private final int bonus_strength;
    private final String localizedName;

    private NullTalisman() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 77;
        itemAliases = "null talisman";
        itemCost = 470;
        itemQuality = "common";
        itemShopTags = new String[]{"damage","int","agi","str"};
        key = "item_null_talisman";
        bonus_agility = 3;
        bonus_damage = 3;
        bonus_intellect = 6;
        bonus_strength = 3;
        localizedName = "Null Talisman";
    }

    public static NullTalisman instance() {
        if( instance == null ){
            instance = new NullTalisman();
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

    public int getBonusAgility() {
        return bonus_agility;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusIntellect() {
        return bonus_intellect;
    }

    public int getBonusStrength() {
        return bonus_strength;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof NullTalisman))
            return false;
        if (object == this)
            return true;
        NullTalisman otherObject = (NullTalisman) object;
        return otherObject.getKey().equals(getKey());
    }

}
