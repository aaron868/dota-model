package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class SangeAndYasha extends Item {

    private static SangeAndYasha instance;

    private final String abilityBehavior;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemDisassembleRule;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_agility;
    private final int bonus_attack_speed;
    private final int bonus_damage;
    private final int bonus_strength;
    private final String localizedName;
    private final int maim_chance;
    private final int maim_duration;
    private final int maim_slow_attack;
    private final int maim_slow_movement;
    private final int movement_speed_percent_bonus;

    private SangeAndYasha() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 154;
        itemAliases = new String[]{"sny","s&y","sy","sange and yasha"};
        itemCost = 41;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemDisassembleRule = "DOTA_ITEM_DISASSEMBLE_ALWAYS";
        itemQuality = "artifact";
        itemShopTags = new String[]{"damage","str","agi","attack_speed","unique"};
        key = "item_sange_and_yasha";
        bonus_agility = 16;
        bonus_attack_speed = 16;
        bonus_damage = 16;
        bonus_strength = 16;
        localizedName = "Sange And Yasha";
        maim_chance = 16;
        maim_duration = 5;
        maim_slow_attack = -32;
        maim_slow_movement = -32;
        movement_speed_percent_bonus = 16;
    }

    public static SangeAndYasha instance() {
        if( instance == null ){
            instance = new SangeAndYasha();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getID() {
        return iD;
    }

    public String[] getItemAliases() {
        return itemAliases;
    }

    public int getItemCost() {
        return itemCost;
    }

    public String[] getItemDeclarations() {
        return itemDeclarations;
    }

    public String getItemDisassembleRule() {
        return itemDisassembleRule;
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

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusStrength() {
        return bonus_strength;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaimChance() {
        return maim_chance;
    }

    public int getMaimDuration() {
        return maim_duration;
    }

    public int getMaimSlowAttack() {
        return maim_slow_attack;
    }

    public int getMaimSlowMovement() {
        return maim_slow_movement;
    }

    public int getMovementSpeedPercentBonus() {
        return movement_speed_percent_bonus;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SangeAndYasha))
            return false;
        if (object == this)
            return true;
        SangeAndYasha otherObject = (SangeAndYasha) object;
        return otherObject.getKey().equals(getKey());
    }

}
