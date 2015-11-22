package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Mekansm extends Item {

    private static Mekansm instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int fightRecapLevel;
    private final int iD;
    private final int itemAlertable;
    private final String[] itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int aura_health_regen;
    private final int aura_radius;
    private final int bonus_all_stats;
    private final int bonus_armor;
    private final int heal_amount;
    private final int heal_armor_duration;
    private final int heal_bonus_armor;
    private final int heal_radius;
    private final String localizedName;

    private Mekansm() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 65;
        abilityManaCost = 225;
        fightRecapLevel = 2;
        iD = 79;
        itemAlertable = 1;
        itemAliases = new String[]{"mechanism","mekansm"};
        itemCost = 2300;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "rare";
        itemShopTags = new String[]{"agi","int","str","armor","boost_health"};
        key = "item_mekansm";
        aura_health_regen = 4;
        aura_radius = 900;
        bonus_all_stats = 5;
        bonus_armor = 5;
        heal_amount = 250;
        heal_armor_duration = 25;
        heal_bonus_armor = 2;
        heal_radius = 900;
        localizedName = "Mekansm";
    }

    public static Mekansm instance() {
        if( instance == null ){
            instance = new Mekansm();
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

    public int getFightRecapLevel() {
        return fightRecapLevel;
    }

    public int getID() {
        return iD;
    }

    public int getItemAlertable() {
        return itemAlertable;
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

    public int getAuraHealthRegen() {
        return aura_health_regen;
    }

    public int getAuraRadius() {
        return aura_radius;
    }

    public int getBonusAllStats() {
        return bonus_all_stats;
    }

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getHealAmount() {
        return heal_amount;
    }

    public int getHealArmorDuration() {
        return heal_armor_duration;
    }

    public int getHealBonusArmor() {
        return heal_bonus_armor;
    }

    public int getHealRadius() {
        return heal_radius;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Mekansm))
            return false;
        if (object == this)
            return true;
        Mekansm otherObject = (Mekansm) object;
        return otherObject.getKey().equals(getKey());
    }

}
