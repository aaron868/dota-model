package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class LesserCrit extends Item {

    private static LesserCrit instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_damage;
    private final int crit_chance;
    private final int crit_multiplier;
    private final String localizedName;

    private LesserCrit() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 149;
        itemAliases = "crystalys";
        itemCost = 2120;
        itemQuality = "epic";
        itemShopTags = new String[]{"damage","crit"};
        key = "item_lesser_crit";
        bonus_damage = 30;
        crit_chance = 20;
        crit_multiplier = 175;
        localizedName = "Crystalys";
    }

    public static LesserCrit instance() {
        if( instance == null ){
            instance = new LesserCrit();
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

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getCritChance() {
        return crit_chance;
    }

    public int getCritMultiplier() {
        return crit_multiplier;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LesserCrit))
            return false;
        if (object == this)
            return true;
        LesserCrit otherObject = (LesserCrit) object;
        return otherObject.getKey().equals(getKey());
    }

}
