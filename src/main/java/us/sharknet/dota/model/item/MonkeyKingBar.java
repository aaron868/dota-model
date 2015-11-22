package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class MonkeyKingBar extends Item {

    private static MonkeyKingBar instance;

    private final String abilityBehavior;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bash_chance;
    private final int bash_damage;
    private final double bash_stun;
    private final int bonus_attack_speed;
    private final int bonus_damage;
    private final String localizedName;

    private MonkeyKingBar() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 135;
        itemAliases = new String[]{"mkb","monkey king bar"};
        itemCost = 5400;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "epic";
        itemShopTags = new String[]{"damage","attack_speed","hard_to_tag"};
        key = "item_monkey_king_bar";
        bash_chance = 35;
        bash_damage = 100;
        bash_stun = .1;
        bonus_attack_speed = 15;
        bonus_damage = 88;
        localizedName = "Monkey King Bar";
    }

    public static MonkeyKingBar instance() {
        if( instance == null ){
            instance = new MonkeyKingBar();
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

    public String getItemQuality() {
        return itemQuality;
    }

    public String[] getItemShopTags() {
        return itemShopTags;
    }

    public String getKey() {
        return key;
    }

    public int getBashChance() {
        return bash_chance;
    }

    public int getBashDamage() {
        return bash_damage;
    }

    public double getBashStun() {
        return bash_stun;
    }

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MonkeyKingBar))
            return false;
        if (object == this)
            return true;
        MonkeyKingBar otherObject = (MonkeyKingBar) object;
        return otherObject.getKey().equals(getKey());
    }

}
