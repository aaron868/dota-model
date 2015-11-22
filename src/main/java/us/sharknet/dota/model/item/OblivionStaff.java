package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class OblivionStaff extends Item {

    private static OblivionStaff instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_attack_speed;
    private final int bonus_damage;
    private final int bonus_intellect;
    private final int bonus_mana_regen;
    private final String localizedName;

    private OblivionStaff() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 67;
        itemAliases = "oblivion staff";
        itemCost = 1650;
        itemQuality = "common";
        itemShopTags = new String[]{"damage","int","attack_speed","regen_mana"};
        key = "item_oblivion_staff";
        bonus_attack_speed = 10;
        bonus_damage = 15;
        bonus_intellect = 6;
        bonus_mana_regen = 75;
        localizedName = "Oblivion Staff";
    }

    public static OblivionStaff instance() {
        if( instance == null ){
            instance = new OblivionStaff();
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

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusIntellect() {
        return bonus_intellect;
    }

    public int getBonusManaRegen() {
        return bonus_mana_regen;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof OblivionStaff))
            return false;
        if (object == this)
            return true;
        OblivionStaff otherObject = (OblivionStaff) object;
        return otherObject.getKey().equals(getKey());
    }

}
