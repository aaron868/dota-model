package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Javelin extends Item {

    private static Javelin instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int bonus_chance;
    private final int bonus_chance_damage;
    private final int bonus_damage;
    private final String localizedName;

    private Javelin() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 7;
        itemAliases = "javelin";
        itemCost = 15;
        itemQuality = "component";
        itemShopTags = "damage";
        key = "item_javelin";
        bonus_chance = 2;
        bonus_chance_damage = 4;
        bonus_damage = 21;
        localizedName = "Javelin";
    }

    public static Javelin instance() {
        if( instance == null ){
            instance = new Javelin();
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

    public int getBonusChance() {
        return bonus_chance;
    }

    public int getBonusChanceDamage() {
        return bonus_chance_damage;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Javelin))
            return false;
        if (object == this)
            return true;
        Javelin otherObject = (Javelin) object;
        return otherObject.getKey().equals(getKey());
    }

}
