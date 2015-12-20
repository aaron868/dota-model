package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class DragonLance extends Item {

    private static DragonLance instance;

    private final String abilityBehavior;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemDisassembleRule;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int base_attack_range;
    private final int bonus_damage;
    private final int bonus_speed;
    private final int bonus_strength;
    private final String localizedName;

    private DragonLance() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 236;
        itemAliases = "dragon lance";
        itemCost = 1875;
        itemDisassembleRule = "DOTA_ITEM_DISASSEMBLE_ALWAYS";
        itemQuality = "epic";
        itemShopTags = "damage";
        key = "item_dragon_lance";
        base_attack_range = 130;
        bonus_damage = 10;
        bonus_speed = 10;
        bonus_strength = 10;
        localizedName = "Dragon Lance";
    }

    public static DragonLance instance() {
        if( instance == null ){
            instance = new DragonLance();
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

    public String getItemDisassembleRule() {
        return itemDisassembleRule;
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

    public int getBaseAttackRange() {
        return base_attack_range;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusSpeed() {
        return bonus_speed;
    }

    public int getBonusStrength() {
        return bonus_strength;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DragonLance))
            return false;
        if (object == this)
            return true;
        DragonLance otherObject = (DragonLance) object;
        return otherObject.getKey().equals(getKey());
    }

}
