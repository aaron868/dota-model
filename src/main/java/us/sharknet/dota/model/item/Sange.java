package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Sange extends Item {

    private static Sange instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_damage;
    private final int bonus_strength;
    private final String localizedName;
    private final int maim_attack_speed;
    private final int maim_chance;
    private final int maim_duration;
    private final int maim_movement_speed;

    private Sange() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 162;
        itemAliases = "sange";
        itemCost = 2050;
        itemQuality = "artifact";
        itemShopTags = new String[]{"damage","str","unique"};
        key = "item_sange";
        bonus_damage = 10;
        bonus_strength = 16;
        localizedName = "Sange";
        maim_attack_speed = -20;
        maim_chance = 15;
        maim_duration = 4;
        maim_movement_speed = -20;
    }

    public static Sange instance() {
        if( instance == null ){
            instance = new Sange();
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

    public int getBonusStrength() {
        return bonus_strength;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaimAttackSpeed() {
        return maim_attack_speed;
    }

    public int getMaimChance() {
        return maim_chance;
    }

    public int getMaimDuration() {
        return maim_duration;
    }

    public int getMaimMovementSpeed() {
        return maim_movement_speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Sange))
            return false;
        if (object == this)
            return true;
        Sange otherObject = (Sange) object;
        return otherObject.getKey().equals(getKey());
    }

}
