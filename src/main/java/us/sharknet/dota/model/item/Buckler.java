package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Buckler extends Item {

    private static Buckler instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_all_stats;
    private final int bonus_aoe_armor;
    private final int bonus_aoe_duration;
    private final int bonus_aoe_duration_hero;
    private final int bonus_aoe_radius;
    private final int bonus_armor;
    private final String localizedName;

    private Buckler() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 25;
        abilityManaCost = 1;
        iD = 86;
        itemAliases = "buckler";
        itemCost = 8;
        itemQuality = "rare";
        itemShopTags = new String[]{"armor","boost_armor"};
        key = "item_buckler";
        bonus_all_stats = 2;
        bonus_aoe_armor = 2;
        bonus_aoe_duration = 3;
        bonus_aoe_duration_hero = 25;
        bonus_aoe_radius = 9;
        bonus_armor = 5;
        localizedName = "Buckler";
    }

    public static Buckler instance() {
        if( instance == null ){
            instance = new Buckler();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
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

    public int getBonusAllStats() {
        return bonus_all_stats;
    }

    public int getBonusAoeArmor() {
        return bonus_aoe_armor;
    }

    public int getBonusAoeDuration() {
        return bonus_aoe_duration;
    }

    public int getBonusAoeDurationHero() {
        return bonus_aoe_duration_hero;
    }

    public int getBonusAoeRadius() {
        return bonus_aoe_radius;
    }

    public int getBonusArmor() {
        return bonus_armor;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Buckler))
            return false;
        if (object == this)
            return true;
        Buckler otherObject = (Buckler) object;
        return otherObject.getKey().equals(getKey());
    }

}
