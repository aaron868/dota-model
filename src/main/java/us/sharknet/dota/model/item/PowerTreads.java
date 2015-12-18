package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class PowerTreads extends Item {

    private static PowerTreads instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_attack_speed;
    private final int bonus_damage;
    private final int bonus_movement_speed;
    private final int bonus_stat;
    private final String localizedName;

    private PowerTreads() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        iD = 63;
        itemAliases = "power treads";
        itemCost = 1400;
        itemDeclarations = "DECLARE_PURCHASES_TO_SPECTATORS";
        itemQuality = "common";
        itemShopTags = new String[]{"attack_speed","move_speed","int","agi","str"};
        key = "item_power_treads";
        bonus_attack_speed = 25;
        bonus_damage = 0;
        bonus_movement_speed = 45;
        bonus_stat = 9;
        localizedName = "Power Treads";
    }

    public static PowerTreads instance() {
        if( instance == null ){
            instance = new PowerTreads();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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

    public String getItemDeclarations() {
        return itemDeclarations;
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

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusMovementSpeed() {
        return bonus_movement_speed;
    }

    public int getBonusStat() {
        return bonus_stat;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PowerTreads))
            return false;
        if (object == this)
            return true;
        PowerTreads otherObject = (PowerTreads) object;
        return otherObject.getKey().equals(getKey());
    }

}
