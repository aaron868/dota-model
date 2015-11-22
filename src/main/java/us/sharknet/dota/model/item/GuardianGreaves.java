package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class GuardianGreaves extends Item {

    private static GuardianGreaves instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int fightRecapLevel;
    private final int iD;
    private final int itemAlertable;
    private final String itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int aura_armor;
    private final int aura_armor_bonus;
    private final int aura_bonus_threshold;
    private final int aura_health_regen;
    private final int aura_health_regen_bonus;
    private final int aura_radius;
    private final int bonus_all_stats;
    private final int bonus_armor;
    private final int bonus_mana;
    private final int bonus_movement;
    private final String localizedName;
    private final int replenish_health;
    private final int replenish_mana;
    private final int replenish_radius;

    private GuardianGreaves() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = 40;
        abilityManaCost = 0;
        fightRecapLevel = 1;
        iD = 231;
        itemAlertable = 1;
        itemAliases = "guardian greaves";
        itemCost = 5300;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "rare";
        itemShopTags = new String[]{"int","armor","regen_health","hard_to_tag"};
        key = "item_guardian_greaves";
        aura_armor = 2;
        aura_armor_bonus = 15;
        aura_bonus_threshold = 20;
        aura_health_regen = 4;
        aura_health_regen_bonus = 15;
        aura_radius = 900;
        bonus_all_stats = 5;
        bonus_armor = 5;
        bonus_mana = 250;
        bonus_movement = 55;
        localizedName = "Guardian Greaves";
        replenish_health = 250;
        replenish_mana = 160;
        replenish_radius = 900;
    }

    public static GuardianGreaves instance() {
        if( instance == null ){
            instance = new GuardianGreaves();
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

    public String getItemAliases() {
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

    public int getAuraArmor() {
        return aura_armor;
    }

    public int getAuraArmorBonus() {
        return aura_armor_bonus;
    }

    public int getAuraBonusThreshold() {
        return aura_bonus_threshold;
    }

    public int getAuraHealthRegen() {
        return aura_health_regen;
    }

    public int getAuraHealthRegenBonus() {
        return aura_health_regen_bonus;
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

    public int getBonusMana() {
        return bonus_mana;
    }

    public int getBonusMovement() {
        return bonus_movement;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getReplenishHealth() {
        return replenish_health;
    }

    public int getReplenishMana() {
        return replenish_mana;
    }

    public int getReplenishRadius() {
        return replenish_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof GuardianGreaves))
            return false;
        if (object == this)
            return true;
        GuardianGreaves otherObject = (GuardianGreaves) object;
        return otherObject.getKey().equals(getKey());
    }

}
