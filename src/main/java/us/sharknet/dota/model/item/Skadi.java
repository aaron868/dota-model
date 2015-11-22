package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Skadi extends Item {

    private static Skadi instance;

    private final String abilityBehavior;
    private final int iD;
    private final String[] itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_all_stats;
    private final int bonus_health;
    private final int bonus_mana;
    private final int cold_attack_speed;
    private final int cold_duration_melee;
    private final double cold_duration_ranged;
    private final int cold_movement_speed;
    private final String localizedName;

    private Skadi() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 16;
        itemAliases = new String[]{"eos","eye of skadi"};
        itemCost = 5675;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "artifact";
        itemShopTags = new String[]{"agi","str","int","hard_to_tag","mana_pool","health_pool","unique"};
        key = "item_skadi";
        bonus_all_stats = 25;
        bonus_health = 25;
        bonus_mana = 25;
        cold_attack_speed = -45;
        cold_duration_melee = 5;
        cold_duration_ranged = 2.5;
        cold_movement_speed = -35;
        localizedName = "Eye Of Skadi";
    }

    public static Skadi instance() {
        if( instance == null ){
            instance = new Skadi();
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

    public int getBonusAllStats() {
        return bonus_all_stats;
    }

    public int getBonusHealth() {
        return bonus_health;
    }

    public int getBonusMana() {
        return bonus_mana;
    }

    public int getColdAttackSpeed() {
        return cold_attack_speed;
    }

    public int getColdDurationMelee() {
        return cold_duration_melee;
    }

    public double getColdDurationRanged() {
        return cold_duration_ranged;
    }

    public int getColdMovementSpeed() {
        return cold_movement_speed;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Skadi))
            return false;
        if (object == this)
            return true;
        Skadi otherObject = (Skadi) object;
        return otherObject.getKey().equals(getKey());
    }

}
