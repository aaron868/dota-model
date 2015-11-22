package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Butterfly extends Item {

    private static Butterfly instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_agility;
    private final int bonus_attack_speed;
    private final int bonus_damage;
    private final int bonus_evasion;
    private final int bonus_move_speed;
    private final int duration;
    private final String localizedName;

    private Butterfly() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 35;
        iD = 139;
        itemAliases = new String[]{"bfly","butterfly"};
        itemCost = 5875;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "epic";
        itemShopTags = new String[]{"agi","damage","evasion","attack_speed"};
        key = "item_butterfly";
        bonus_agility = 30;
        bonus_attack_speed = 30;
        bonus_damage = 30;
        bonus_evasion = 35;
        bonus_move_speed = 25;
        duration = 6;
        localizedName = "Butterfly";
    }

    public static Butterfly instance() {
        if( instance == null ){
            instance = new Butterfly();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
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

    public int getBonusEvasion() {
        return bonus_evasion;
    }

    public int getBonusMoveSpeed() {
        return bonus_move_speed;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Butterfly))
            return false;
        if (object == this)
            return true;
        Butterfly otherObject = (Butterfly) object;
        return otherObject.getKey().equals(getKey());
    }

}
