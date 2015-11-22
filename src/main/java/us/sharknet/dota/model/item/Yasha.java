package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Yasha extends Item {

    private static Yasha instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_agility;
    private final int bonus_attack_speed;
    private final String localizedName;
    private final int movement_speed_percent_bonus;

    private Yasha() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 170;
        itemAliases = "yasha";
        itemCost = 2050;
        itemQuality = "artifact";
        itemShopTags = new String[]{"agi","attack_speed","move_speed"};
        key = "item_yasha";
        bonus_agility = 16;
        bonus_attack_speed = 15;
        localizedName = "Yasha";
        movement_speed_percent_bonus = 10;
    }

    public static Yasha instance() {
        if( instance == null ){
            instance = new Yasha();
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

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMovementSpeedPercentBonus() {
        return movement_speed_percent_bonus;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Yasha))
            return false;
        if (object == this)
            return true;
        Yasha otherObject = (Yasha) object;
        return otherObject.getKey().equals(getKey());
    }

}
